/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewForm;

import dao.ThucPhamDao;
import helper.DataValidator;
import helper.MessageDialogHelper;
import java.awt.event.KeyEvent;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import helper.Bang;
import model.ThucPham;

/**
 *
 * @author Admin
 */
public class DlogAddNewFood extends javax.swing.JDialog {

    ArrayList<String> list = new ArrayList<>();
    private Bang table = new Bang();

    /**
     * Creates new form DialogThemTPMoi
     */
    public DlogAddNewFood(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgLoaiTP = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMaTP = new javax.swing.JLabel();
        txtTenThucPham = new javax.swing.JTextField();
        txtGTDD = new javax.swing.JTextField();
        spnKhoiLuong = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        btnThemVaoGio = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        pnlLoaiTP = new javax.swing.JPanel();
        rdbRauCu = new javax.swing.JRadioButton();
        rdbThitCa = new javax.swing.JRadioButton();
        rdbHat = new javax.swing.JRadioButton();
        btnThemVaoGio1 = new javax.swing.JButton();
        cbxDonVi1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        spnKhoiLuongIt = new javax.swing.JSpinner();
        cbxDonVi2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm thực phẩm mới");

        jPanel2.setBackground(new java.awt.Color(230, 236, 230));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Thông tin thực phẩm");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mã thực phẩm :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Tên thực phẩm :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Khối lượng cần mua : ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Giá trị dinh dưỡng (calo/100g) :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Giá tiền cho mỗi 100g (VND) :");

        lblMaTP.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblMaTP.setText("TP-");

        txtTenThucPham.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTenThucPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenThucPhamKeyPressed(evt);
            }
        });

        txtGTDD.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        spnKhoiLuong.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Loại thực phẩm : ");

        btnThemVaoGio.setBackground(new java.awt.Color(255, 51, 51));
        btnThemVaoGio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnThemVaoGio.setForeground(new java.awt.Color(255, 255, 255));
        btnThemVaoGio.setText("Thêm vào giỏ");
        btnThemVaoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGioActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(0, 102, 102));
        btnThoat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Bạn hãy nhập các thông tin bên dưới:");

        txtGiaTien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        pnlLoaiTP.setBackground(new java.awt.Color(230, 236, 230));

        btgLoaiTP.add(rdbRauCu);
        rdbRauCu.setText("Rau củ");

        btgLoaiTP.add(rdbThitCa);
        rdbThitCa.setText("Thịt cá ");

        btgLoaiTP.add(rdbHat);
        rdbHat.setText("Các loại hạt");

        javax.swing.GroupLayout pnlLoaiTPLayout = new javax.swing.GroupLayout(pnlLoaiTP);
        pnlLoaiTP.setLayout(pnlLoaiTPLayout);
        pnlLoaiTPLayout.setHorizontalGroup(
            pnlLoaiTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoaiTPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbRauCu, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(rdbThitCa)
                .addGap(30, 30, 30)
                .addComponent(rdbHat)
                .addContainerGap())
        );
        pnlLoaiTPLayout.setVerticalGroup(
            pnlLoaiTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoaiTPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLoaiTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbHat)
                    .addComponent(rdbThitCa)
                    .addComponent(rdbRauCu))
                .addContainerGap())
        );

        btnThemVaoGio1.setBackground(new java.awt.Color(0, 0, 204));
        btnThemVaoGio1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnThemVaoGio1.setForeground(new java.awt.Color(255, 255, 255));
        btnThemVaoGio1.setText("Làm mới");
        btnThemVaoGio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGio1ActionPerformed(evt);
            }
        });

        cbxDonVi1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        cbxDonVi1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đơn vị", "kg", "g" }));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Khối lượng cho 1 lần mua :");

        spnKhoiLuongIt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cbxDonVi2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        cbxDonVi2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đơn vị", "kg", "g" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(btnThemVaoGio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnThemVaoGio1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pnlLoaiTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(spnKhoiLuongIt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxDonVi2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtGiaTien)
                                            .addComponent(txtGTDD)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(spnKhoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxDonVi1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblMaTP, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTenThucPham)))))
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblMaTP))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenThucPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnlLoaiTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnKhoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxDonVi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spnKhoiLuongIt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDonVi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGTDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemVaoGio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemVaoGio1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String selectedTypeFood() {
        String loaiThucPham = new String("");
        if (rdbRauCu.isSelected()) {
            loaiThucPham = rdbRauCu.getText();
        }
        if (rdbThitCa.isSelected()) {
            loaiThucPham = rdbThitCa.getText();
        }
        if (rdbHat.isSelected()) {
            loaiThucPham = rdbHat.getText();
        }
        return loaiThucPham;
    }

    private void lamMoi() {
        lblMaTP.setText("TP-");
        txtTenThucPham.setText("");
        spnKhoiLuong.setValue(0);
        spnKhoiLuongIt.setValue(0);
        cbxDonVi1.setSelectedIndex(0);
        cbxDonVi2.setSelectedIndex(0);
        txtGiaTien.setText("");
        btgLoaiTP.clearSelection();
        txtGTDD.setText("");
    }

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

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemVaoGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGioActionPerformed
        StringBuilder sb = new StringBuilder();
        StringBuilder str = new StringBuilder();
        DataValidator.validateEmpty(txtTenThucPham, sb, "\t- Tên thực phẩm!");
        DataValidator.validateEmpty(spnKhoiLuong, sb, "\t- Khối lượng cần mua!");
        DataValidator.validateEmpty(cbxDonVi1, sb, "\t- Đơn vị khối lượng mua!");
        DataValidator.validateEmpty(cbxDonVi2, sb, "\t- Đơn vị khối lượng mua!");
        DataValidator.validateEmpty(txtGiaTien, sb, "\t- Giá tiền cho mỗi 100g thực phẩm!");
        if (selectedTypeFood().equals("")) {
            sb.append("\t- Loại thực phẩm!").append("\n");
            pnlLoaiTP.setBackground(new java.awt.Color(255, 255, 0));
            pnlLoaiTP.requestFocus();
        } else {
            pnlLoaiTP.setBackground(new java.awt.Color(230, 236, 230));
        }
        DataValidator.validateEmpty(txtGTDD, sb, "\t- Giá trị dinh dưỡng cho 100g!");
        if (Integer.parseInt(txtGiaTien.getText()) <= 1000 && txtGiaTien.getText().equals("")) {
            DataValidator.isNumberic(txtGiaTien, str, "\t- Giá tiền phải nhập số và có giá trị > 1000 VND.");
        }
        if (txtGTDD.getText().equals("")) {
            DataValidator.isNumberic(txtGTDD, str, "\t- Giá trị dinh dưỡng phải nhập số.");
        }
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(this, "Bạn chưa nhập vào đầy đủ (hoặc không đúng) thông tin \ncủa thực phẩm:\n" + sb.toString() + str.toString(), "Lỗi");
            return;
        }
        try {
            ThucPham tp = new ThucPham();
            tp.setMaThucPham(lblMaTP.getText());
            tp.setTenThucPham(table.firstUpcase(txtTenThucPham.getText()));
            if (cbxDonVi1.getSelectedIndex() == 1) {
                tp.setKhoiLuongTP((float) ((int) spnKhoiLuong.getValue()));
            } else {
                tp.setKhoiLuongTP((float) ((int) spnKhoiLuong.getValue()) / 1000);
            }
            if (cbxDonVi2.getSelectedIndex() == 1) {
                tp.setKhoiLuongIt((float) ((int) spnKhoiLuongIt.getValue()));
            } else {
                tp.setKhoiLuongIt((float) ((int) spnKhoiLuongIt.getValue()) / 1000);
            }
            tp.setLoaiThucPham(selectedTypeFood());
            int giaTien = (int) (Long.parseLong(txtGiaTien.getText()) / 1000);
            tp.setGiaTienTP(giaTien);
            tp.setGiaTriDD(Integer.parseInt(txtGTDD.getText()));
            tp.setDonGia((float) tp.getGiaTriDD() / (float) tp.getGiaTienTP());
            ThucPhamDao dao = new ThucPhamDao();
            ThucPham tpDao = new ThucPham();
            if (tp.getMaThucPham().equals("TP-")) {
                tp.setMaThucPham(createMa());
                if (dao.insert(tp)) {
                    list.add(tp.getMaThucPham());
                    this.dispose();

                } else {
                    MessageDialogHelper.showMessageDialog(this, "Thực phẩm không được lưu!", "Thông báo");
                }
            }

            tpDao = dao.findByName(tp.getTenThucPham());
            int i = 0;
            if (tpDao != null) {
                tpDao.setMaThucPham(tp.getMaThucPham());
                if (tpDao.getKhoiLuongTP() != tp.getKhoiLuongTP() || !tpDao.getLoaiThucPham().equals(tp.getLoaiThucPham())
                        || tpDao.getGiaTienTP() != tp.getGiaTienTP() || tpDao.getGiaTriDD() != tp.getGiaTriDD()) {
                    i++;
                }
                if (i == 0) {
                    list.add(tp.getMaThucPham());
                    this.dispose();
                } else {
                    if (MessageDialogHelper.showConfirmDialog(this, tp.getTenThucPham().toUpperCase(Locale.ITALY) + " đã được lưu trong danh sách thực phẩm!\nBạn có muốn CẬP NHẬT lại thực phẩm này hay không?", "Câu hỏi") == JOptionPane.YES_OPTION) {
                        if (dao.update(tp)) {
                            list.add(tp.getMaThucPham());
                            this.dispose();
                        } else {
                            MessageDialogHelper.showMessageDialog(this, "Thực phẩm không được cập nhật!", "Thông báo");
                        }
                    }
                }
            }
            list.remove(1);
        } catch (Exception e) {
            e.printStackTrace();
//            MessageDialogHelper.showErrorDialog(this, "Đã xảy ra lôi khi lưu thực phẩm!\nBạn hãy thử lưu lại.", "Lỗi");
        }
    }//GEN-LAST:event_btnThemVaoGioActionPerformed


    private void txtTenThucPhamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenThucPhamKeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            if (addNhanh()) {
                return;
            }

        }
    }//GEN-LAST:event_txtTenThucPhamKeyPressed

    private boolean addNhanh() {
        ThucPhamDao dao = new ThucPhamDao();
        ThucPham tp = new ThucPham();
        try {
            tp = dao.findByName(txtTenThucPham.getText());
            if (tp != null) {
                if (MessageDialogHelper.showConfirmDialog(this, tp.getTenThucPham().toUpperCase(Locale.ITALY) + " đã được lưu trong danh sách thực phẩm!\nBạn có muốn CHỌN thực phẩm này hay không?", "Câu hỏi") == JOptionPane.YES_OPTION) {
                    lblMaTP.setText(tp.getMaThucPham());
                    txtTenThucPham.setText(tp.getTenThucPham());
                    rdbRauCu.setSelected(tp.getLoaiThucPham().equals(rdbRauCu.getText()) ? true : false);
                    rdbThitCa.setSelected(tp.getLoaiThucPham().equals(rdbThitCa.getText()) ? true : false);
                    rdbHat.setSelected(tp.getLoaiThucPham().equals(rdbHat.getText()) ? true : false);
                    if (tp.getKhoiLuongTP() >= 1) {
                        spnKhoiLuong.setValue((int) tp.getKhoiLuongTP());
                        cbxDonVi1.setSelectedIndex(1);
                    } else {
                        spnKhoiLuong.setValue((int) tp.getKhoiLuongTP() * 1000);
                        cbxDonVi1.setSelectedIndex(2);
                    }
                    if (tp.getKhoiLuongIt() >= 1) {
                        spnKhoiLuongIt.setValue((int) tp.getKhoiLuongIt());
                        cbxDonVi2.setSelectedIndex(1);
                    } else {
                        spnKhoiLuongIt.setValue((int) (tp.getKhoiLuongIt() * 1000));
                        cbxDonVi2.setSelectedIndex(2);
                    }
                    txtGiaTien.setText(valueOf((int) tp.getGiaTienTP() * 1000));
                    txtGTDD.setText(valueOf(tp.getGiaTriDD()));
                }
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(DlogAddNewFood.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        if (!txtTenThucPham.getText().equals(null)) {
            int i = 0;
            if (selectedTypeFood().equals("")) {
                i++;
            }
            if (spnKhoiLuong.getValue().equals(0)) {
                i++;
            }
            if (spnKhoiLuongIt.getValue().equals(0)) {
                i++;
            }
            if (txtGiaTien.getText().equals(null)) {
                i++;
            }
            if (i != 0 && addNhanh()) {
                return;
            }
        }
    }//GEN-LAST:event_jPanel2MousePressed

    private void btnThemVaoGio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemVaoGio1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlogAddNewFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlogAddNewFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlogAddNewFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlogAddNewFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlogAddNewFood dialog = new DlogAddNewFood(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgLoaiTP;
    private javax.swing.JButton btnThemVaoGio;
    private javax.swing.JButton btnThemVaoGio1;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbxDonVi1;
    private javax.swing.JComboBox<String> cbxDonVi2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMaTP;
    private javax.swing.JPanel pnlLoaiTP;
    private javax.swing.JRadioButton rdbHat;
    private javax.swing.JRadioButton rdbRauCu;
    private javax.swing.JRadioButton rdbThitCa;
    private javax.swing.JSpinner spnKhoiLuong;
    private javax.swing.JSpinner spnKhoiLuongIt;
    private javax.swing.JTextField txtGTDD;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtTenThucPham;
    // End of variables declaration//GEN-END:variables
}
