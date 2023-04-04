/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import dao.GioHangDao;
import dao.KetQuaDao;
import dao.ThucPhamDao;
import helper.MessageDialogHelper;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import viewForm.PaneAddFood;

import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.GioHang;
import model.KetQua;
import model.PhuongAn;
import model.ThucPham;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;

/**
 *
 * @author Admin
 */
public class XFile {

    PaneAddFood panel;
    private FileInputStream fileInputStream;
    private BufferedReader bufferedReader;
    private int a, b, c;
    private String soTienMua;
    private StringBuilder sb;
    private ArrayList<PhuongAn> phuongAn;

    public String createMa() throws Exception, NumberFormatException {
        ThucPhamDao dao = new ThucPhamDao();
        int i = 1;
        String ma = new String();
        ArrayList<ThucPham> list = dao.findAll();
        if (list.size() == 0) {
            ma = "TP-001";
        }
        for (ThucPham it : list) {
            if (list.size() == i) {
                String matp = it.getMaThucPham();
                int mamoi = Integer.parseInt(matp.substring(3)) + 1;
                ma = String.format("TP-%03d", mamoi);
            }
            i++;
        }
        return ma;
    }

    public static String readTypeFood(String str) {
        if (Integer.parseInt(str) == 1) {
            return "Rau củ";
        }
        if (Integer.parseInt(str) == 2) {
            return "Thịt cá";
        }
        if (Integer.parseInt(str) == 3) {
            return "Các loại hạt";
        }
        return null;
    }

    public static Float parseToFloat(String s) {
        if (s.contains(".")) {
            String[] w = new String[3];
            w = s.split("[.]", 2);
            return (float) (((Integer.parseInt(w[0]) * Math.pow(10, w[1].length()))
                    + Integer.parseInt(w[1])) / Math.pow(10, w[1].length()));
        }

        return Float.parseFloat(s);
    }

    public void readFileFoodTXT(File file) throws FileNotFoundException, IOException {
        try {
            ArrayList<ThucPham> list = readFile(file, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(panel, "Đã xảy ra lôi khi THÊM TỪ FILE thực phẩm!\nBạn hãy thử chọn lại.", "Lỗi");
        }

    }

    public ArrayList<ThucPham> readFileCartTXT(File file) throws FileNotFoundException, IOException {
        try {
            ArrayList<ThucPham> list = readFile(file, 0, 1);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(panel, "Đã xảy ra lôi khi THÊM TỪ FILE thực phẩm!\nBạn hãy thử chọn lại.", "Lỗi");
        }
        return null;
    }

    public String getSoTienMua() {
        return soTienMua;
    }

    public ArrayList<ThucPham> readFile(File file, int type, int t) throws Exception {
        if (!file.exists()) {
            file.createNewFile();
        }
        ThucPhamDao dao = new ThucPhamDao();
        StringBuilder sb = new StringBuilder();
        ArrayList<ThucPham> list = new ArrayList<>();
        if (type == 0) {
            loadTXT(file, dao, list, t);
        } else {
            if (type == 1) {
                loadDOCX(file, dao, list, t);
            } else {
                loadXSL(file, dao, list, t);
            }

        }

        if (a != 0) {
            sb.append("Đã THÊM " + a + " thực phẩm từ file [ " + file + " ] thành công.\n");
        }
        if (b != 0) {
            sb.append("Đã CẬP NHẬT " + b + " thực phẩm từ file [ " + file + " ] thành công.\n");
        }
        if (c != 0 && (a != 0 || b != 0)) {
            sb.append("Có " + c + " thực phẩm đã được thêm vào trước đó.");
        }
        if (a == 0 && b == 0 && c != 0) {
            sb.append("Các thực phẩm từ file [ " + file + " ] đã được thêm vào rồi.");
        }
        if (a == 0 && b == 0 && c == 0) {
            sb.append("Không thể THÊM thực phẩm từ file [ " + file + " ]");
        }
        MessageDialogHelper.showMessageDialog(panel, sb.toString(), "Thông báo");
        return list;
    }

    public void loadTXT(File file, ThucPhamDao dao, ArrayList<ThucPham> list, int t) throws Exception {
        soTienMua = "";
        a = 0;
        b = 0;
        c = 0;
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
        String line = bufferedReader.readLine();
        if (t == 1) {
            soTienMua = line;
            line = bufferedReader.readLine();
        }
        while (line != null) {
            ThucPham tp = new ThucPham();
            String[] words = new String[10];
            words = line.split(" ", 6);
            tp.setLoaiThucPham(readTypeFood(words[0]));
            tp.setKhoiLuongTP(parseToFloat(words[1]));
            tp.setKhoiLuongIt(parseToFloat(words[2]));
            tp.setGiaTriDD(Integer.parseInt(words[3]));
            tp.setGiaTienTP((int) (Long.parseLong(words[4]) / 1000));
            tp.setTenThucPham(words[5]);
            tp.setMaThucPham(createMa());
            tp.setDonGia((float) tp.getGiaTriDD() / (float) tp.getGiaTienTP());
            if (dao.findByName(tp.getTenThucPham()) != null) {
                ThucPham tpA = dao.findByName(tp.getTenThucPham());
                if (tpA.equalsTest(tp)) {
                    list.add(tpA);
                    c++;
                } else if (dao.update(tpA)) {
                    list.add(tpA);
                    b++;
                }
            } else if (dao.insert(tp)) {
                list.add(tp);
                a++;
            }
            line = bufferedReader.readLine();
        }
    }

    public void loadDOCX(File file, ThucPhamDao dao, ArrayList<ThucPham> list, int t) {
        try ( XWPFDocument doc = new XWPFDocument(
                new FileInputStream(file.getPath()))) {
            if (t == 1) {
                soTienMua = "";
                List<XWPFParagraph> para = doc.getParagraphs();
                String[] money = para.get(1).getText().split(" ", 5);
                soTienMua = money[3];
            }
            Iterator<IBodyElement> docElementsIterator = doc.getBodyElementsIterator();
            while (docElementsIterator.hasNext()) {
                IBodyElement docElement = docElementsIterator.next();
                if ("TABLE".equalsIgnoreCase(docElement.getElementType().name())) {
                    List<XWPFTable> xwpfTableList = docElement.getBody().getTables();
                    for (XWPFTable it : xwpfTableList) {
                        for (int i = 1; i < it.getRows().size(); i++) {
                            ThucPham tp = new ThucPham();
                            tp.setTenThucPham(it.getRow(i).getCell(1).getText());
                            tp.setLoaiThucPham(it.getRow(i).getCell(2).getText());
                            tp.setKhoiLuongTP(parseToFloat(it.getRow(i).getCell(3).getText()));
                            tp.setKhoiLuongIt(parseToFloat(it.getRow(i).getCell(4).getText()));
                            tp.setGiaTriDD(Integer.parseInt(it.getRow(i).getCell(5).getText()));
                            tp.setGiaTienTP((int) (Long.parseLong(it.getRow(i).getCell(6).getText()) / 1000));
                            tp.setDonGia((float) tp.getGiaTriDD() / (float) tp.getGiaTienTP());
                            System.out.println(tp.toString());
                            tp.setMaThucPham(createMa());
                            tp.setDonGia((float) tp.getGiaTriDD() / (float) tp.getGiaTienTP());
                            if (dao.findByName(tp.getTenThucPham()) != null) {
                                ThucPham tpA = dao.findByName(tp.getTenThucPham());
                                if (tpA.equalsTest(tp)) {
                                    list.add(tpA);
                                    c++;
                                } else if (dao.update(tpA)) {
                                    list.add(tpA);
                                    b++;
                                }
                            } else if (dao.insert(tp)) {
                                list.add(tp);
                                a++;
                            }
                        }
                    }
                }
            }

            doc.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void readFileFoodDOCX(File file) throws FileNotFoundException, IOException {
        try {
            ArrayList<ThucPham> list = readFile(file, 1, 0);
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(panel, "Đã xảy ra lôi khi THÊM TỪ FILE thực phẩm!\nBạn hãy thử chọn lại.", "Lỗi");
        }

    }

    public ArrayList<ThucPham> readFileCartDOCX(File file) throws FileNotFoundException, IOException {
        try {
            ArrayList<ThucPham> list = readFile(file, 1, 1);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(panel, "Đã xảy ra lôi khi THÊM TỪ FILE thực phẩm!\nBạn hãy thử chọn lại.", "Lỗi");
        }
        return null;
    }

    public void loadXSL(File file, ThucPhamDao dao, ArrayList<ThucPham> list, int t) throws Exception {
        soTienMua = "";
        a = 0;
        b = 0;
        c = 0;
        FileInputStream excelFile = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(excelFile);
        org.apache.poi.ss.usermodel.Sheet datatypeSheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = datatypeSheet.iterator();
        Row firstRow = iterator.next();
        if (t == 1) {
            int str = (int) firstRow.getCell(1).getNumericCellValue();
            soTienMua = valueOf(str);
            firstRow = iterator.next();
        }
        while (iterator.hasNext()) {
            Row row = iterator.next();
            ThucPham tp = new ThucPham();
            tp.setTenThucPham((String) row.getCell(1).getStringCellValue());
            tp.setLoaiThucPham((String) row.getCell(2).getStringCellValue());
            tp.setKhoiLuongTP((float) row.getCell(3).getNumericCellValue());
            tp.setKhoiLuongIt((float) row.getCell(4).getNumericCellValue());
            tp.setGiaTriDD((int) row.getCell(5).getNumericCellValue());
            tp.setGiaTienTP((int) ((long) row.getCell(6).getNumericCellValue() / 1000));
            tp.setMaThucPham(createMa());
            tp.setDonGia((float) tp.getGiaTriDD() / (float) tp.getGiaTienTP());
            if (dao.findByName(tp.getTenThucPham()) != null) {
                ThucPham tpA = dao.findByName(tp.getTenThucPham());
                if (tpA.equalsTest(tp)) {
                    list.add(tpA);
                    c++;
                } else if (dao.update(tpA)) {
                    list.add(tpA);
                    b++;
                }
            } else if (dao.insert(tp)) {
                list.add(tp);
                a++;
            }
        }
        workbook.close();
    }

    public void readFileFoodXLSX(File file) throws FileNotFoundException, IOException {
        try {
            ArrayList<ThucPham> list = readFile(file, 2, 0);
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(panel, "Đã xảy ra lôi khi THÊM TỪ FILE thực phẩm!\nBạn hãy thử chọn lại.", "Lỗi");
        }

    }

    public ArrayList<ThucPham> readFileCartXLSX(File file) throws FileNotFoundException, IOException {
        try {
            ArrayList<ThucPham> list = readFile(file, 2, 1);
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(panel, "Đã xảy ra lôi khi THÊM TỪ FILE thực phẩm!\nBạn hãy thử chọn lại.", "Lỗi");
        }
        return null;
    }

    public boolean writeFile(JFrame frame, String id) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a File to upload");
        FileNameExtensionFilter file = new FileNameExtensionFilter("All files", "txt", "docx", "xlsx");
        fileChooser.setFileFilter(file);
        fileChooser.addChoosableFileFilter(file);
        int response = fileChooser.showSaveDialog(frame);
        if (response == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                GioHangDao dao = new GioHangDao();
                GioHang gh = dao.findByID(id);
                KetQuaDao daokq = new KetQuaDao();
                ArrayList<KetQua> list = daokq.findAll();
                ArrayList<KetQua> listkq = new ArrayList<>();
                for (KetQua it : list) {
                    if (it.getMaGioHang().equals(id)) {
                        listkq.add(it);
                    }
                }
                String str = selectedFile.getAbsolutePath();
                try ( FileWriter fw = new FileWriter(str)) {
                    Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), "UTF-8"));
                    out.write(gh.getMaGioHang() + " " + gh.getTenGioHang());
                    out.write("\n");
                    out.write((gh.getSoTienMua() * 1000) + " " + gh.getSoThucPham());
                    out.write("\n");
                    for (KetQua it : listkq) {
                        out.write(it.toString());
                        out.write("\n");
                    }
                    out.write((gh.getSoTienCL() * 1000) + " " + gh.getKhoiluong() + " " + gh.getGiaTriDD());
                    out.write("\n");
                    out.write(gh.getNgayTao() + " " + gh.getGhiChu());
                    out.close();
                    fw.close();
                    return true;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public ArrayList<ThucPham> openFile(File file) throws Exception {
        soTienMua = "";
        ArrayList<ThucPham> list = new ArrayList<>();
        phuongAn = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(file);
//        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), "UTF-8"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
        sb = new StringBuilder();
        String line = bufferedReader.readLine();
        sb.append(line);
        line = bufferedReader.readLine();
        String w[] = line.split("[ ]", 2);
        soTienMua = w[0];
        int n = Integer.parseInt(w[1]);
        for (int i = 0; i < n; i++) {
            line = bufferedReader.readLine();
            ThucPham tp = new ThucPham();
            String[] words = new String[10];
            words = line.split(" ", 7);
            tp.setLoaiThucPham(readTypeFood(words[0]));
            tp.setKhoiLuongTP(parseToFloat(words[1]));
            tp.setKhoiLuongIt(parseToFloat(words[2]));
            tp.setGiaTriDD(Integer.parseInt(words[3]));
            tp.setGiaTienTP((int) (Long.parseLong(words[4]) / 1000));
            tp.setTenThucPham(words[6]);
            ThucPhamDao dao = new ThucPhamDao();
            ThucPham tpT = dao.findByName(tp.getTenThucPham());
            if (tpT == null) {
                dao.insert(tp);
                tp.setMaThucPham(createMa());
            } else {
                tp.setMaThucPham(tpT.getMaThucPham());
                dao.update(tp);
            }
            tp.setDonGia((float) tp.getGiaTriDD() / (float) tp.getGiaTienTP());
            PhuongAn pa = new PhuongAn();
            pa.setMaThucPham(tp.getMaThucPham());
            pa.setPhuongAn(parseToFloat(words[5]));
            phuongAn.add(pa);
            list.add(tp);
        }
        line = bufferedReader.readLine();
        sb.append(" " + line);
        line = bufferedReader.readLine();
        sb.append(" " + line);
        return list;
    }

    public StringBuilder getSb() {
        return sb;
    }
    public ArrayList<PhuongAn> getPhuongAn(){
        return phuongAn;
    }
}
