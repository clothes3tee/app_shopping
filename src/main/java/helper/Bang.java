/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import dao.GioHangDao;
import dao.ThucPhamDao;
import helper.MessageDialogHelper;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.GioHang;
import model.KetQua;
import model.PhuongAn;
import model.ThucPham;

/**
 *
 * @author Admin
 */
public class Bang {

    private DefaultTableModel tblModel, tblModelGH, tblModelKQ, tblModelDSGH, tblModelKQGH;
    private DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

    public String insert_space(int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            str.append(" ");
        }
        return str.toString();
    }

    public void initTable(JTable table) {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{insert_space(2) + "STT", insert_space(8) + "Mã thực phẩm", insert_space(24) + "Tên thực phẩm",
            insert_space(15) + "Loại thực phẩm", insert_space(6) + "Khối lượng cần mua", insert_space(4) + "Khối lượng cho 1 lần mua",
            insert_space(4) + "Giá trị dinh dưỡng (calo/100g)", insert_space(8) + "Giá tiền cho mỗi (1kg)"});
        table.setModel(tblModel);

    }

    public void initTable1(JTable table) {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{insert_space(2) + "STT", insert_space(2) + "Mã thực phẩm", insert_space(12) + "Tên thực phẩm",
            insert_space(2) + "Loại thực phẩm", insert_space(4) + " Khối lượng cần mua", "Khối lượng cho 1 lần mua",
            "Giá trị dinh dưỡng (calo/100g)", insert_space(2) + "Giá tiền cho mỗi (1kg)"});
        table.setModel(tblModel);

    }

    public String firstUpcase(String s) {
        String firstLetter = s.substring(0, 1).toUpperCase();
        String remainingLetters = s.substring(1, s.length()).toLowerCase();
        return (firstLetter + remainingLetters).trim();
    }

    public void initTableGioHang(JTable table) {
        tblModelGH = new DefaultTableModel();
        tblModelGH.setColumnIdentifiers(new String[]{insert_space(2) + "STT", insert_space(8) + "Mã thực phẩm", insert_space(24) + "Tên thực phẩm",
            insert_space(15) + "Loại thực phẩm", insert_space(6) + "Khối lượng cần mua", insert_space(4) + "Khối lượng cho 1 lần mua",
            insert_space(4) + "Giá trị dinh dưỡng (calo/100g)", insert_space(8) + "Giá tiền cho mỗi (1kg)"});
        table.setModel(tblModelGH);
    }

    public void initTableKetQua(JTable table) {
        tblModelKQ = new DefaultTableModel();
        tblModelKQ.setColumnIdentifiers(new String[]{insert_space(1) + "STT", insert_space(3) + "Mã thực phẩm", insert_space(8) + "Tên thực phẩm",
            insert_space(5) + "Loại thực phẩm", insert_space(4) + "Khối lượng cần mua", insert_space(4) + "Khối lượng cho 1 lần mua", insert_space(2) + "Giá trị dinh dưỡng (calo/100g)",
            insert_space(1) + "Giá tiền cho mỗi (1kg)",insert_space(2)+"Tỉ lệ GTDD/Số tiền", insert_space(3) + "Phương án"});
        table.setModel(tblModelKQ);
    }

    public void initTableKetQuaGH(JTable table) {
        tblModelKQGH = new DefaultTableModel();
        tblModelKQGH.setColumnIdentifiers(new String[]{insert_space(1) + "STT", "Mã thực phẩm", insert_space(14) + "Tên thực phẩm",
            insert_space(1) + "Loại thực phẩm", "Khối lượng cần mua", "Khối lượng cho 1 lần mua", "Giá trị dinh dưỡng (calo/100g)",
            "Giá tiền cho mỗi (1kg)", insert_space(10) + "Phương án"});
        table.setModel(tblModelKQGH);
    }

    public void initTableDSGH(JTable table) {
        tblModelDSGH = new DefaultTableModel();
        tblModelDSGH.setColumnIdentifiers(new String[]{insert_space(2) + "STT", insert_space(10) + "Mã giỏ hàng", insert_space(21) + "Tên giỏ hàng", insert_space(7) + "Số tiền cần mua",
            "Số lượng thực phẩm", insert_space(9) + "Số tiền còn lại", " Tổng giá trị dinh dưỡng", insert_space(10) + "Ngày tạo", insert_space(35) + "Ghi chú"});
        table.setModel(tblModelDSGH);
    }

    public void loadDataToTable(JPanel p) {
        try {
            ThucPhamDao dao = new ThucPhamDao();
            ArrayList<ThucPham> list = dao.findAll();
            tblModel.setRowCount(0);
            int i = 1;
            for (ThucPham it : list) {
                if (i <= list.size()) {
                    tblModel.addRow(new Object[]{
                        i, it.getMaThucPham(), insert_space(2) + it.getTenThucPham(), insert_space(2) + it.getLoaiThucPham(), it.getKhoiLuongTP() + " kg",
                        it.getKhoiLuongIt() + " kg", it.getGiaTriDD(), (int) it.getGiaTienTP() * 1000
                    });
                    i++;
                }
            }
            tblModel.fireTableStructureChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(p, e.getMessage(), "Lỗi");
        }
    }

    public void loadDataToTable(JPanel p, ArrayList<ThucPham> list) {
        try {
            tblModel.setRowCount(0);
            int i = 1;
            for (ThucPham it : list) {
                if (i <= list.size()) {
                    tblModel.addRow(new Object[]{
                        i, it.getMaThucPham(), insert_space(2) + it.getTenThucPham(), insert_space(2) + it.getLoaiThucPham(), it.getKhoiLuongTP() + " kg",
                        it.getKhoiLuongIt() + " kg", it.getGiaTriDD(), (int) it.getGiaTienTP() * 1000
                    });
                    i++;
                }
            }
            tblModel.fireTableStructureChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(p, e.getMessage(), "Lỗi");
        }
    }

    public void loadDataToTableGioHang(JPanel p, ArrayList<ThucPham> list) {
        try {

            tblModelGH.setRowCount(0);
            int i = 1;
            for (ThucPham it : list) {
                if (i <= list.size()) {
                    tblModelGH.addRow(new Object[]{
                        i, it.getMaThucPham(), insert_space(2) + it.getTenThucPham(), insert_space(2) + it.getLoaiThucPham(), it.getKhoiLuongTP() + " kg",
                        it.getKhoiLuongIt() + " kg", it.getGiaTriDD(), (int) it.getGiaTienTP() * 1000
                    });

                    i++;
                }
            }
            tblModelGH.fireTableStructureChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(p, e.getMessage(), "Lỗi");
        }
    }

    public void loadDataToTableKetQua(JPanel p, ArrayList<ThucPham> list, ArrayList<PhuongAn> kq) {
        try {

            tblModelKQ.setRowCount(0);
            for (int i = 0; i < list.size(); i++) {
                if (i <= list.size()) {
                    tblModelKQ.addRow(new Object[]{
                        i + 1, list.get(i).getMaThucPham(), insert_space(2) + list.get(i).getTenThucPham(), insert_space(2) + list.get(i).getLoaiThucPham(),
                        list.get(i).getKhoiLuongTP() + " kg", list.get(i).getKhoiLuongIt() + " kg",
                        list.get(i).getGiaTriDD(), (int) list.get(i).getGiaTienTP() * 1000, list.get(i).getDonGia()/10, kq.get(i).getPhuongAn() + " kg"
                    });

                }
            }
            tblModelKQ.fireTableStructureChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(p, e.getMessage(), "Lỗi");
        }
    }

    public void loadDataToTableDSGH(JPanel p) {
        try {
            int i = 1;
            GioHangDao dao = new GioHangDao();
            ArrayList<GioHang> list = dao.findAll();
            tblModelDSGH.setRowCount(0);
            for (GioHang it : list) {
                if (i <= list.size()) {
                    tblModelDSGH.addRow(new Object[]{
                        i, it.getMaGioHang(), insert_space(2) + it.getTenGioHang(), it.getSoTienMua() * 1000, it.getSoThucPham(), 
                         (int)(it.getSoTienCL() * 1000), it.getGiaTriDD(), insert_space(1) + it.getNgayTao(), insert_space(2) + it.getGhiChu()
                    });
                    i++;
                }
            }
            tblModelDSGH.fireTableStructureChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(p, e.getMessage(), "Lỗi");
        }
    }

    public void loadDataToTableDSGH(JPanel p, ArrayList<GioHang> list) {
        try {
            int i = 1;
            tblModelDSGH.setRowCount(0);
            for (GioHang it : list) {
                if (i <= list.size()) {
                    tblModelDSGH.addRow(new Object[]{
                        i, it.getMaGioHang(), insert_space(2) + it.getTenGioHang(), it.getSoTienMua() * 1000, it.getSoThucPham(), 
                        (int)(it.getSoTienCL() * 1000), it.getGiaTriDD(),  insert_space(1) + it.getNgayTao(), it.getGhiChu()
                    });
                    i++;
                }
            }
            tblModelDSGH.fireTableStructureChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(p, e.getMessage(), "Lỗi");
        }
    }

    public void loadDataToTableKetQuaGH(JPanel p, ArrayList<KetQua> list) {
        try {

            tblModelKQGH.setRowCount(0);
            for (int i = 0; i < list.size(); i++) {
                if (i <= list.size()) {
                    tblModelKQGH.addRow(new Object[]{
                        i + 1, list.get(i).getMaThucPham(), insert_space(2) + list.get(i).getTenThucPham(), insert_space(2) + list.get(i).getLoaiThucPham(),
                        list.get(i).getKhoiLuongTP(), list.get(i).getKhoiLuongIt(),
                        list.get(i).getGiaTriDD(), (int) list.get(i).getGiaTienTP() * 1000, list.get(i).getPhuongAn()
                    });

                }
            }
            tblModelKQGH.fireTableStructureChanged();
        } catch (Exception e) {
//            MessageDialogHelper.showErrorDialog( p, e.getMessage(),"Lỗi");
        }
    }

    public void tableModel(JTable table) {
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(50);
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(0).setMaxWidth(50);
            table.getColumnModel().getColumn(1).setMinWidth(140);
            table.getColumnModel().getColumn(1).setMaxWidth(140);
            table.getColumnModel().getColumn(2).setMinWidth(240);
            table.getColumnModel().getColumn(2).setMaxWidth(240);
            table.getColumnModel().getColumn(3).setMinWidth(180);
            table.getColumnModel().getColumn(3).setMaxWidth(180);
            table.getColumnModel().getColumn(4).setMinWidth(170);
            table.getColumnModel().getColumn(4).setMaxWidth(170);
            table.getColumnModel().getColumn(5).setMinWidth(180);
            table.getColumnModel().getColumn(5).setMaxWidth(180);
            table.getColumnModel().getColumn(6).setMinWidth(200);
            table.getColumnModel().getColumn(6).setMaxWidth(200);
            table.getColumnModel().getColumn(7).setMinWidth(190);
            table.getColumnModel().getColumn(7).setMaxWidth(190);
        }
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
    }

    public void tableModelKQ(JTable table) {
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(40);
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(0).setMaxWidth(40);
            table.getColumnModel().getColumn(1).setMinWidth(110);
            table.getColumnModel().getColumn(1).setMaxWidth(110);
            table.getColumnModel().getColumn(2).setMinWidth(160);
            table.getColumnModel().getColumn(2).setMaxWidth(160);
            table.getColumnModel().getColumn(3).setMinWidth(120);
            table.getColumnModel().getColumn(3).setMaxWidth(120);
            table.getColumnModel().getColumn(4).setMinWidth(150);
            table.getColumnModel().getColumn(4).setMaxWidth(150);
            table.getColumnModel().getColumn(5).setMinWidth(180);
            table.getColumnModel().getColumn(5).setMaxWidth(180);
            table.getColumnModel().getColumn(6).setMinWidth(190);
            table.getColumnModel().getColumn(6).setMaxWidth(190);
            table.getColumnModel().getColumn(7).setMinWidth(150);
            table.getColumnModel().getColumn(7).setMaxWidth(150);
            table.getColumnModel().getColumn(8).setMinWidth(120);
            table.getColumnModel().getColumn(8).setMaxWidth(120);
            table.getColumnModel().getColumn(9).setMinWidth(140);
            table.getColumnModel().getColumn(9).setMaxWidth(140);
        }
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
    }

    public void tableModelSeeKQ(JTable table) {
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(40);
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(0).setMaxWidth(40);
            table.getColumnModel().getColumn(1).setMinWidth(100);
            table.getColumnModel().getColumn(1).setMaxWidth(100);
            table.getColumnModel().getColumn(2).setMinWidth(170);
            table.getColumnModel().getColumn(2).setMaxWidth(170);
            table.getColumnModel().getColumn(3).setMinWidth(110);
            table.getColumnModel().getColumn(3).setMaxWidth(110);
            table.getColumnModel().getColumn(4).setMinWidth(110);
            table.getColumnModel().getColumn(4).setMaxWidth(100);
            table.getColumnModel().getColumn(5).setMinWidth(110);
            table.getColumnModel().getColumn(5).setMaxWidth(110);
            table.getColumnModel().getColumn(6).setMinWidth(150);
            table.getColumnModel().getColumn(6).setMaxWidth(150);
            table.getColumnModel().getColumn(7).setMinWidth(150);
            table.getColumnModel().getColumn(7).setMaxWidth(150);
            table.getColumnModel().getColumn(8).setMinWidth(130);
            table.getColumnModel().getColumn(8).setMaxWidth(130);
        }
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);

    }

    public void tableModelChooe(JTable table) {
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(40);
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(0).setMaxWidth(40);
            table.getColumnModel().getColumn(1).setMinWidth(110);
            table.getColumnModel().getColumn(1).setMaxWidth(110);
            table.getColumnModel().getColumn(2).setMinWidth(180);
            table.getColumnModel().getColumn(2).setMaxWidth(180);
            table.getColumnModel().getColumn(3).setMinWidth(120);
            table.getColumnModel().getColumn(3).setMaxWidth(120);
            table.getColumnModel().getColumn(4).setMinWidth(150);
            table.getColumnModel().getColumn(4).setMaxWidth(150);
            table.getColumnModel().getColumn(5).setMinWidth(160);
            table.getColumnModel().getColumn(5).setMaxWidth(160);
            table.getColumnModel().getColumn(6).setMinWidth(180);
            table.getColumnModel().getColumn(6).setMaxWidth(180);
            table.getColumnModel().getColumn(7).setMinWidth(150);
            table.getColumnModel().getColumn(7).setMaxWidth(150);
        }
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
    }

    public void tableModelCart(JTable table) {
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(50);
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(0).setMaxWidth(50);
            table.getColumnModel().getColumn(1).setMinWidth(140);
            table.getColumnModel().getColumn(1).setMaxWidth(140);
            table.getColumnModel().getColumn(2).setMinWidth(200);
            table.getColumnModel().getColumn(2).setMaxWidth(200);
            table.getColumnModel().getColumn(3).setMinWidth(140);
            table.getColumnModel().getColumn(3).setMaxWidth(140);
            table.getColumnModel().getColumn(4).setMinWidth(130);
            table.getColumnModel().getColumn(4).setMaxWidth(130);
            table.getColumnModel().getColumn(5).setMinWidth(140);
            table.getColumnModel().getColumn(5).setMaxWidth(140);
            table.getColumnModel().getColumn(6).setMinWidth(150);
            table.getColumnModel().getColumn(6).setMaxWidth(150);
            table.getColumnModel().getColumn(7).setMinWidth(120);
            table.getColumnModel().getColumn(7).setMaxWidth(120);
            table.getColumnModel().getColumn(8).setMinWidth(270);
            table.getColumnModel().getColumn(8).setMaxWidth(270);
        }
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);

    }
}
