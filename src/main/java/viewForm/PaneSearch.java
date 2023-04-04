/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewForm;

import dao.GioHangDao;
import dao.ThucPhamDao;
import helper.MessageDialogHelper;
import java.awt.Color;
import java.awt.event.KeyEvent;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import helper.Bang;
import model.GioHang;
import model.ThucPham;
import static viewForm.FrmMain.back;
import static viewForm.FrmMain.indexList;
import static viewForm.FrmMain.listIndex;
import static viewForm.FrmMain.listPanel;
import static viewForm.FrmMain.pnlMain;
import static viewForm.FrmMain.listPanel;
import static viewForm.FrmMain.now;
import static viewForm.FrmMain.pnlMain;

/**
 *
 * @author Admin
 */
public class PaneSearch extends javax.swing.JPanel {

    private Bang table = new Bang();

    /**
     * Creates new form PaneSearch
     */
    public PaneSearch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSeach1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblSoKetQua = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 236, 230));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(200, 134, 6));
        jLabel3.setText("Nhập từ khóa :");

        txtSearch.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        btnSeach1.setBackground(new java.awt.Color(149, 204, 149));
        btnSeach1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSeach1.setForeground(new java.awt.Color(0, 102, 0));
        btnSeach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green-search-icon.png"))); // NOI18N
        btnSeach1.setText("Tìm kiếm");
        btnSeach1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSeach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeach1ActionPerformed(evt);
            }
        });

        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSearch.setGridColor(new java.awt.Color(102, 102, 102));
        tblSearch.setShowGrid(true);
        tblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSearchMouseClicked(evt);
            }
        });
        tblSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblSearchKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblSearch);

        lblSoKetQua.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblSoKetQua.setForeground(new java.awt.Color(204, 0, 0));
        lblSoKetQua.setText("Có kết quả được tìm thấy:");

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Previous-icon.png"))); // NOI18N
        lblBack.setToolTipText("Trở về");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackMouseExited(evt);
            }
        });

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Button-Next-icon (1).png"))); // NOI18N
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblBack)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnSeach1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(lblNext)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSoKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeach1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBack)
                    .addComponent(lblNext))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSoKetQua)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
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
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnSeach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeach1ActionPerformed
        search();
    }//GEN-LAST:event_btnSeach1ActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            search();
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void tblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchMouseClicked
        try {
            int row = tblSearch.getSelectedRow();
            String id = (String) tblSearch.getValueAt(row, 1);
            if (id.substring(0, 3).equals("TP-")) {
                showPanel(id, 2);
            } else {
                showPanel(id, 4);
            }
        } catch (Exception ex) {
            Logger.getLogger(PaneSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblSearchMouseClicked

    private void tblSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSearchKeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
            try {
                int row = tblSearch.getSelectedRow();
                String id = (String) tblSearch.getValueAt(row, 1);
                if (id.substring(0, 3).equals("TP-")) {
                    showPanel(id, 2);
                } else {
                    showPanel(id, 4);
                }
            } catch (Exception ex) {
                Logger.getLogger(PaneSearch.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblSearchKeyPressed

    private void lblBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseEntered
        lblBack.setSize(46, 46);
        lblBack.setLocation(117, 73);
    }//GEN-LAST:event_lblBackMouseEntered

    private void lblBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseExited
        lblBack.setSize(48, 48);
        lblBack.setLocation(115, 71);
    }//GEN-LAST:event_lblBackMouseExited

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        if (listIndex.size() == indexList + 1) {
            return;
        }
        pnlMain.removeAll();
        int a = Integer.parseInt(listIndex.get(indexList + 1));
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
        indexList++;
        pnlMain.updateUI();
        now = a;
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblNextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseEntered
        lblNext.setSize(46, 46);
        lblNext.setLocation(1168, 73);
    }//GEN-LAST:event_lblNextMouseEntered

    private void lblNextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseExited
        lblNext.setSize(48, 48);
        lblNext.setLocation(1166, 71);
    }//GEN-LAST:event_lblNextMouseExited

    public void searchText(ArrayList<ThucPham> listSearch, String text) throws Exception {
        txtSearch.setText(text);
        lblSoKetQua.setText("Có " + listSearch.size() + " kết quả [" + text + "] được tìm thấy:");
        table.initTable(tblSearch);
        table.loadDataToTable(this, listSearch);
        table.tableModel(tblSearch);
    }

    public void searchText1(ArrayList<GioHang> listSearch, String text) throws Exception {
        txtSearch.setText(text);
        lblSoKetQua.setText("Có " + listSearch.size() + " kết quả [" + text + "] được tìm thấy:");
        table.initTableDSGH(tblSearch);
        table.loadDataToTableDSGH(this);
        table.tableModelCart(tblSearch);
    }

    private void search() {
        try {
            String text = txtSearch.getText().toLowerCase().trim();
            if (text.contains("giỏ")){
            GioHangDao dao = new GioHangDao();
            ArrayList<GioHang> list = dao.findAll();
            ArrayList<GioHang> listSearch = new ArrayList<>();
            for (GioHang it : list) {
                    if (it.getTenGioHang().equalsIgnoreCase(text) || it.getMaGioHang().equalsIgnoreCase(text)) {
                        showPanel(it.getMaGioHang(), 4);
                        return;
                    } else {
                        if (it.getTenGioHang().toLowerCase().contains(text)) {
                            listSearch.add(it);
                        }
                    }
                }
                if (listSearch.size() == 0) {
                    MessageDialogHelper.showMessageDialog(this, "Không tìm thấy kết quả cho từ khóa [ " + txtSearch.getText() + " ].", "Thông báo");
                    return;
                }
            } else {
                ThucPhamDao daotp = new ThucPhamDao();
                ArrayList<ThucPham> list = daotp.findAll();
                ArrayList<ThucPham> listSearch = new ArrayList<>();
                for (ThucPham it : list) {
                    if (it.getTenThucPham().equalsIgnoreCase(text) || it.getMaThucPham().equalsIgnoreCase(text)) {
                        showPanel(it.getMaThucPham(), 2);
                        return;
                    } else {
                        if (it.getTenThucPham().toLowerCase().contains(text) || it.getLoaiThucPham().toLowerCase().contains(text)) {
                            listSearch.add(it);
                        }
                    }
                }
                if (listSearch.size() == 0) {
                    MessageDialogHelper.showMessageDialog(this, "Không tìm thấy kết quả cho từ khóa [ " + txtSearch.getText() + " ].", "Thông báo");
                    return;
                }
                searchText(listSearch, txtSearch.getText().trim());
            }

        } catch (Exception ex) {
            Logger.getLogger(PaneListFood.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void showPanel(String id, int a) throws NumberFormatException, Exception {
        pnlMain.removeAll();
        if (a == 4) {
            PaneCreateCart panel = (PaneCreateCart) listPanel.get(4);
            int k = 0;
            for (int i = 0; i < listIndex.size(); i++) {
                if (listIndex.get(i).equals("4")) {
                    k++;
                }
            }
            if (k != 0) {
                panel.createJTabbedPane();
            }
            panel.loadData(id);
            pnlMain.add(panel);
        } else if (a == 2) {
            PaneAddFood panel = (PaneAddFood) listPanel.get(a);
            panel.showThucPham(id);
            pnlMain.add(panel);
        }

        pnlMain.updateUI();
        if (Integer.parseInt(listIndex.get(listIndex.size() - 1)) != a) {
            listIndex.add(valueOf(a));
            indexList = listIndex.size() - 1;
        }
        now = a;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeach1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblSoKetQua;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}