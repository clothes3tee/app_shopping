/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewForm;

import dao.ThucPhamDao;
import helper.MessageDialogHelper;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import helper.Bang;
import model.ThucPham;
import static viewForm.FrmMain.listPanel;
import static viewForm.FrmMain.pnlMain;
import static viewForm.FrmMain.back;
import static viewForm.FrmMain.indexList;
import static viewForm.FrmMain.listIndex;
import static viewForm.FrmMain.now;
import static viewForm.FrmMain.listPanel;
import static viewForm.FrmMain.pnlMain;

/**
 *
 * @author Admin
 */
public class PaneListFood extends javax.swing.JPanel {

    private FrmMain parent;
    private Bang table = new Bang();

    /**
     * Creates new form PaneListFood
     */
    public PaneListFood() {
        initComponents();
        table.initTable(tblDsThucPham);
        loadTable();
    }

    public void loadTable() {
        table.loadDataToTable(this);
        table.tableModel(tblDsThucPham);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDsThucPham = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        cbxSapXep = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        btnAddFood = new javax.swing.JButton();
        btnXemTP = new javax.swing.JButton();
        btnEditFood = new javax.swing.JButton();
        btnXoaTP = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        btnReturn1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnAddCart = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();

        jPanel1.setBackground(new java.awt.Color(230, 236, 230));

        tblDsThucPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã thực phẩm", "Tên thực phẩm", "Loại thực phẩm", "Khối lượng (g)", "", "Giá trị dinh dưỡng (calo/100g)", "Giá tiền mỗi 100g (VND)"
            }
        ));
        tblDsThucPham.setShowGrid(true);
        tblDsThucPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDsThucPhamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDsThucPhamMousePressed(evt);
            }
        });
        tblDsThucPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDsThucPhamKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDsThucPham);
        if (tblDsThucPham.getColumnModel().getColumnCount() > 0) {
            tblDsThucPham.getColumnModel().getColumn(0).setMinWidth(60);
            tblDsThucPham.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblDsThucPham.getColumnModel().getColumn(0).setMaxWidth(60);
            tblDsThucPham.getColumnModel().getColumn(1).setMinWidth(130);
            tblDsThucPham.getColumnModel().getColumn(1).setMaxWidth(130);
            tblDsThucPham.getColumnModel().getColumn(2).setMinWidth(240);
            tblDsThucPham.getColumnModel().getColumn(2).setMaxWidth(240);
            tblDsThucPham.getColumnModel().getColumn(3).setMinWidth(180);
            tblDsThucPham.getColumnModel().getColumn(3).setMaxWidth(180);
            tblDsThucPham.getColumnModel().getColumn(4).setMinWidth(170);
            tblDsThucPham.getColumnModel().getColumn(4).setMaxWidth(170);
            tblDsThucPham.getColumnModel().getColumn(5).setMinWidth(180);
            tblDsThucPham.getColumnModel().getColumn(5).setMaxWidth(180);
            tblDsThucPham.getColumnModel().getColumn(6).setMinWidth(200);
            tblDsThucPham.getColumnModel().getColumn(6).setMaxWidth(200);
            tblDsThucPham.getColumnModel().getColumn(7).setMinWidth(190);
            tblDsThucPham.getColumnModel().getColumn(7).setMaxWidth(190);
        }

        jLabel13.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Danh sách thực phẩm");

        cbxSapXep.setBackground(new java.awt.Color(0, 153, 153));
        cbxSapXep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp xếp ", "Mới nhất", "Loại thực phẩm", "Giá trị sử dụng cao nhất", "Giá trị dinh dưỡng cao nhất", "Giá tiền cao nhất" }));
        cbxSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSapXepActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sort-descending-icon.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(942, 942, 942)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxSapXep, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jToolBar2.setRollover(true);
        jToolBar2.add(jSeparator10);

        jButton2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(135, 32, 32));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Blue-Arrow-Left-icon.png"))); // NOI18N
        jButton2.setText("Trang Trước");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);

        btnNext.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnNext.setForeground(new java.awt.Color(135, 32, 32));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Green-Arrow-Left-icon.png"))); // NOI18N
        btnNext.setText("Trang Sau");
        btnNext.setActionCommand("Trang Sau");
        btnNext.setFocusable(false);
        btnNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNextMouseExited(evt);
            }
        });
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jToolBar2.add(btnNext);
        jToolBar2.add(jSeparator11);

        btnAddFood.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAddFood.setForeground(new java.awt.Color(135, 32, 32));
        btnAddFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/savefood-icon.png"))); // NOI18N
        btnAddFood.setText("Thêm mới");
        btnAddFood.setFocusable(false);
        btnAddFood.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddFood.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAddFood);

        btnXemTP.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnXemTP.setForeground(new java.awt.Color(135, 32, 32));
        btnXemTP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewfood-icon.png"))); // NOI18N
        btnXemTP.setText("Xem");
        btnXemTP.setFocusable(false);
        btnXemTP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXemTP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXemTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemTPActionPerformed(evt);
            }
        });
        jToolBar2.add(btnXemTP);

        btnEditFood.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnEditFood.setForeground(new java.awt.Color(135, 32, 32));
        btnEditFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editfood-icon.png"))); // NOI18N
        btnEditFood.setText("Cập nhật");
        btnEditFood.setFocusable(false);
        btnEditFood.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditFood.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditFoodActionPerformed(evt);
            }
        });
        jToolBar2.add(btnEditFood);

        btnXoaTP.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnXoaTP.setForeground(new java.awt.Color(135, 32, 32));
        btnXoaTP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removefood-icon.png"))); // NOI18N
        btnXoaTP.setText("Xóa");
        btnXoaTP.setFocusable(false);
        btnXoaTP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoaTP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXoaTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTPActionPerformed(evt);
            }
        });
        jToolBar2.add(btnXoaTP);
        jToolBar2.add(jSeparator13);

        btnReturn1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnReturn1.setForeground(new java.awt.Color(135, 32, 32));
        btnReturn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow-refresh-icon.png"))); // NOI18N
        btnReturn1.setText("Tải Lại");
        btnReturn1.setFocusable(false);
        btnReturn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReturn1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn1ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnReturn1);
        jToolBar2.add(jSeparator2);

        btnAddCart.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnAddCart.setForeground(new java.awt.Color(135, 32, 32));
        btnAddCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_newcart2.png"))); // NOI18N
        btnAddCart.setText("Giỏ Mới");
        btnAddCart.setToolTipText("");
        btnAddCart.setFocusable(false);
        btnAddCart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddCart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCartActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAddCart);
        jToolBar2.add(jSeparator14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 1450, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void isNext() {
        if (listIndex.size() == indexList + 1) {
            btnNext.setEnabled(true);
        }
    }

    private void btnXemTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemTPActionPerformed
        DlogSeeFood secletion;
        try {
            int row[] = tblDsThucPham.getSelectedRows();
            if (row.length == 0) {
                MessageDialogHelper.showMessageDialog(this, "Bạn chưa CHỌN thực phẩm.", "Thông báo");
                return;
            }
            secletion = new DlogSeeFood(parent, true);
            String id = (String) tblDsThucPham.getValueAt(row[0], 1);
            try {
                secletion.showThucPham(id);
                secletion.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
                MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Lỗi");
            }
        } catch (Exception ex) {
            Logger.getLogger(PaneListFood.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadTable();
    }//GEN-LAST:event_btnXemTPActionPerformed

    private void btnEditFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditFoodActionPerformed
        DlogEditFood secletion;
        try {
            int row[] = tblDsThucPham.getSelectedRows();
            if (row.length == 0) {
                MessageDialogHelper.showMessageDialog(this, "Bạn chưa CHỌN thực phẩm.", "Thông báo");
                return;
            }
            secletion = new DlogEditFood(parent, true);
            String id = (String) tblDsThucPham.getValueAt(row[0], 1);
            try {
                secletion.showThucPham(id);
                secletion.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
                MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Lỗi");
            }
        } catch (Exception ex) {
            Logger.getLogger(PaneListFood.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadTable();
    }//GEN-LAST:event_btnEditFoodActionPerformed

    private void btnXoaTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTPActionPerformed
        try {
            int row[] = tblDsThucPham.getSelectedRows();
            if (row.length == 0) {
                MessageDialogHelper.showMessageDialog(this, "Bạn chưa CHỌN thực phẩm.", "Thông báo");
                return;
            }
            if (MessageDialogHelper.showConfirmDialog(this, "Bạn có muốn xóa " + row.length + " thực phẩm này hay không?", "Câu hỏi") == JOptionPane.NO_OPTION) {
                return;
            }
            ThucPham tp = new ThucPham();
            ThucPhamDao dao = new ThucPhamDao();
            StringBuilder sb = new StringBuilder();
            int sus = 0, fail = 0;

            for (int i = 0; i < row.length; i++) {
                String id = (String) tblDsThucPham.getValueAt(row[i], 1);
                if (dao.delete(id)) {
                    sus++;
                } else {
                    fail++;
                }
            }
            if (sus != 0) {
                sb.append(sus + " thực phẩm đã được XÓA thành công.");
            }
            if (fail != 0) {
                sb.append(fail + " thực phẩm không được XÓA!");
            }
            loadTable();
            MessageDialogHelper.showMessageDialog(this, sb.toString(), "Thông báo");

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, "Đã xảy ra lôi khi XÓA thực phẩm!\nBạn hãy thử xóa lại.", "Lỗi");
        }
    }//GEN-LAST:event_btnXoaTPActionPerformed

    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
        PaneCreateCart panel;
        try {

            panel = (PaneCreateCart) listPanel.get(4);
            pnlMain.removeAll();
            int row[] = tblDsThucPham.getSelectedRows();
            ThucPhamDao dao = new ThucPhamDao();
            ArrayList<ThucPham> list = new ArrayList<>();
            for (int i = 0; i < row.length; i++) {
                String id = (String) tblDsThucPham.getValueAt(row[i], 1);
                ThucPham tp = new ThucPham();
                tp = dao.findByID(id);
                if (tp != null) {
                    list.add(tp);
                }
            }
            int a = 0;
            for (int i = 0; i < listIndex.size(); i++) {
                if (listIndex.get(i).equals("4")) {
                    a++;
                }
            }
            if (a != 0) {
                panel.createJTabbedPane();
            }
            panel.loadData(list);
            pnlMain.add(panel);
            listPanel.add(this);
            pnlMain.updateUI();
            listIndex.add(valueOf(4));
            indexList = listIndex.size() - 1;
            now = 4;
        } catch (Exception ex) {
            Logger.getLogger(PaneListFood.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAddCartActionPerformed

    private void tblDsThucPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDsThucPhamMouseClicked
    }//GEN-LAST:event_tblDsThucPhamMouseClicked

    private void tblDsThucPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDsThucPhamMousePressed
    }//GEN-LAST:event_tblDsThucPhamMousePressed

    private void tblDsThucPhamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDsThucPhamKeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            DlogSeeFood secletion;
            try {
                secletion = new DlogSeeFood(parent, true);

                int row[] = tblDsThucPham.getSelectedRows();
                String id = (String) tblDsThucPham.getValueAt(row[0], 1);
                try {
                    secletion.showThucPham(id);
                    secletion.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                    MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Lỗi");
                }
            } catch (Exception ex) {
                Logger.getLogger(PaneListFood.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadTable();
        }
        if (KeyEvent.VK_DELETE == evt.getKeyCode()) {
            try {
                int row[] = tblDsThucPham.getSelectedRows();
                ThucPham tp = new ThucPham();
                ThucPhamDao dao = new ThucPhamDao();
                StringBuilder sb = new StringBuilder();
                int sus = 0, fail = 0;

                for (int i = 0; i < row.length; i++) {
                    String id = (String) tblDsThucPham.getValueAt(row[i], 1);
                    if (dao.delete(id)) {
                        sus++;
                    } else {
                        fail++;
                    }
                }
                if (sus != 0) {
                    sb.append(sus + " thực phẩm đã được xóa thành công.");
                }
                if (fail != 0) {
                    sb.append(fail + " thực phẩm không được xóa!");
                }
                loadTable();
                MessageDialogHelper.showMessageDialog(this, sb.toString(), "Thông báo");

            } catch (Exception e) {
                e.printStackTrace();
                MessageDialogHelper.showErrorDialog(this, "Đã xảy ra lôi khi xóa thực phẩm!\nBạn hãy thử xóa lại.", "Lỗi");
            }
        }
    }//GEN-LAST:event_tblDsThucPhamKeyPressed

    private void btnReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn1ActionPerformed
        loadTable();
    }//GEN-LAST:event_btnReturn1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pnlMain.removeAll();
        int a = Integer.parseInt(listIndex.get(indexList - 1));
        if (a == 2 || a == 3 || a == 5) {
            if (a == 2) {
                PaneAddFood panel = (PaneAddFood) listPanel.get(a);
                panel.loadTable();
                pnlMain.add(panel);
            }
            if (a == 3) {
                PaneListFood panel = (PaneListFood) listPanel.get(a);
                panel.loadTable();
                pnlMain.add(panel);
            }
            if (a == 5) {
                PaneListCart panel = (PaneListCart) listPanel.get(a);
                panel.loadTable();
                pnlMain.add(panel);
            }

        } else {
            pnlMain.add(listPanel.get(a));
        }
        indexList--;
        if (Integer.parseInt(listIndex.get(indexList)) == 1) {
            listIndex.removeAll(listIndex);
            listIndex.add("1");
            indexList = 0;
        }
        pnlMain.updateUI();
        now = a;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodActionPerformed
       DlogEditFood secletion;
        try {
            int row[] = tblDsThucPham.getSelectedRows();
            if (row.length == 0) {
                MessageDialogHelper.showMessageDialog(this, "Bạn chưa CHỌN thực phẩm.", "Thông báo");
                return;
            }
            secletion = new DlogEditFood(parent, true);
            String id = (String) tblDsThucPham.getValueAt(row[0], 1);
            try {
                secletion.showThucPham(id);
                secletion.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
                MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Lỗi");
            }
        } catch (Exception ex) {
            Logger.getLogger(PaneListFood.class.getName()).log(Level.SEVERE, null, ex);
        }
        loadTable();
    }//GEN-LAST:event_btnAddFoodActionPerformed

    private void sortType() throws Exception {
        ThucPhamDao dao = new ThucPhamDao();
        ArrayList<ThucPham> list = dao.findAll();
        ArrayList<ThucPham> listHat = new ArrayList<>();
        ArrayList<ThucPham> listRau = new ArrayList<>();
        ArrayList<ThucPham> listThitCa = new ArrayList<>();
        for (ThucPham it : list) {
            if (it.getLoaiThucPham().equals("Rau củ")) {
                listRau.add(it);
            }
            if (it.getLoaiThucPham().equals("Thịt cá")) {
                listThitCa.add(it);
            }
            if (it.getLoaiThucPham().equals("Các loại hạt")) {
                listHat.add(it);
            }
        }
        MessageDialogHelper.showErrorDialog(this, list.size() + " " + listRau.size() + " " + listThitCa.size() + " " + listHat.size(), "Lỗi");
        list.removeAll(list);
        list.addAll(listRau);
        list.addAll(listThitCa);
        list.addAll(listHat);
        table.loadDataToTable(this, list);
        table.tableModel(tblDsThucPham);
    }

    public void sortLatest() throws Exception {
        ThucPhamDao dao = new ThucPhamDao();
        ArrayList<ThucPham> list = dao.findAll();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                int a = Integer.parseInt(list.get(j).getMaThucPham().substring(3));
                int b = Integer.parseInt(list.get(j + 1).getMaThucPham().substring(3));
                if (a < b) {
                    ThucPham temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }

        }
        table.loadDataToTable(this, list);
        table.tableModel(tblDsThucPham);
    }

    public void sortGTSD() throws Exception {
        ThucPhamDao dao = new ThucPhamDao();
        ArrayList<ThucPham> list = dao.findAll();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getDonGia() < list.get(j + 1).getDonGia()) {
                    ThucPham temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }

        }
        table.loadDataToTable(this, list);
        table.tableModel(tblDsThucPham);
    }

    public void sortGTDD() throws Exception {
        ThucPhamDao dao = new ThucPhamDao();
        ArrayList<ThucPham> list = dao.findAll();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getGiaTriDD() < list.get(j + 1).getGiaTriDD()) {
                    ThucPham temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }

        }
        table.loadDataToTable(this, list);
        table.tableModel(tblDsThucPham);
    }

    public void sortMoney() throws Exception {
        ThucPhamDao dao = new ThucPhamDao();
        ArrayList<ThucPham> list = dao.findAll();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getGiaTienTP() < list.get(j + 1).getGiaTienTP()) {
                    ThucPham temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }

        }
        table.loadDataToTable(this, list);
        table.tableModel(tblDsThucPham);
    }

    private void cbxSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSapXepActionPerformed
        try {
            if (cbxSapXep.getSelectedIndex() == 0) {
                loadTable();
            }
            if (cbxSapXep.getSelectedIndex() == 1) {
                sortLatest();
            }
            if (cbxSapXep.getSelectedIndex() == 2) {
                sortType();
            }
            if (cbxSapXep.getSelectedIndex() == 3) {
                sortGTSD();
            }
            if (cbxSapXep.getSelectedIndex() == 4) {
                sortGTDD();
            }
            if (cbxSapXep.getSelectedIndex() == 5) {
                sortMoney();
            }
        } catch (Exception ex) {
            MessageDialogHelper.showErrorDialog(this, "Đã xảy ra lôi khi xóa thực phẩm!\nBạn hãy thử xóa lại.", "Lỗi");
        }
    }//GEN-LAST:event_cbxSapXepActionPerformed

    private void btnNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseEntered
        if (listIndex.size() == indexList + 1) {
            btnNext.setEnabled(false);
            btnNext.setToolTipText("Đây là trang cuối cùng!");
        }
    }//GEN-LAST:event_btnNextMouseEntered

    private void btnNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseExited
        btnNext.setEnabled(true);
        btnNext.setToolTipText(null);
    }//GEN-LAST:event_btnNextMouseExited

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        PaneAddFood panel;
        try {

            panel = (PaneAddFood) listPanel.get(2);
            pnlMain.removeAll();
            panel.lamMoi();
            panel.loadTable();
            pnlMain.add(panel);
            listPanel.add(this);
            pnlMain.updateUI();
            listIndex.add(valueOf(4));
            indexList = listIndex.size() - 1;
            now = 4;
        } catch (Exception ex) {
            Logger.getLogger(PaneListFood.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton btnAddFood;
    private javax.swing.JButton btnEditFood;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnReturn1;
    private javax.swing.JButton btnXemTP;
    private javax.swing.JButton btnXoaTP;
    private javax.swing.JComboBox<String> cbxSapXep;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tblDsThucPham;
    // End of variables declaration//GEN-END:variables
}
