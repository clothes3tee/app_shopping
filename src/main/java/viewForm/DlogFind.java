/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewForm;

import dao.GioHangDao;
import dao.ThucPhamDao;
import helper.MessageDialogHelper;
import java.awt.event.KeyEvent;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.GioHang;
import model.ThucPham;
import static viewForm.FrmMain.indexList;
import static viewForm.FrmMain.listIndex;
import static viewForm.FrmMain.listPanel;
import static viewForm.FrmMain.now;
import static viewForm.FrmMain.pnlMain;

/**
 *
 * @author Admin
 */
public class DlogFind extends javax.swing.JDialog {

    /**
     * Creates new form DlogFind
     */
    public DlogFind(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        setLocation(520, 120);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtSeach = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSeach1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tìm kiếm");
        setBackground(new java.awt.Color(248, 241, 241));

        jPanel1.setBackground(new java.awt.Color(247, 238, 238));

        txtSeach.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtSeach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSeachKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("Tìm kiếm :");

        btnSeach1.setBackground(new java.awt.Color(149, 204, 149));
        btnSeach1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSeach1.setForeground(new java.awt.Color(0, 102, 0));
        btnSeach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green-search-icon.png"))); // NOI18N
        btnSeach1.setText("Tìm kiếm");
        btnSeach1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSeach1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSeach1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSeach1MouseExited(evt);
            }
        });
        btnSeach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeach1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnSeach1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtSeach, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSeach1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search() {
        try {
            String text = txtSeach.getText().toLowerCase().trim();
            int a = 0;
            
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
                    MessageDialogHelper.showMessageDialog(this, "Không tìm thấy kết quả cho từ khóa [ " + txtSeach.getText() + " ].", "Thông báo");
                    return;
                }
                    PaneSearch panel = new PaneSearch();
                    pnlMain.removeAll();
                    panel.searchText1(listSearch, txtSeach.getText().trim());
                    pnlMain.add(panel);
                    pnlMain.updateUI();
                    if (Integer.parseInt(listIndex.get(listIndex.size() - 1)) != a) {
                        listIndex.add(valueOf(0));
                        indexList = listIndex.size() - 1;
                    }
                    now = 0;
               
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
                    MessageDialogHelper.showMessageDialog(this, "Không tìm thấy kết quả cho từ khóa [ " + txtSeach.getText() + " ].", "Thông báo");
                    return;
                }
                PaneSearch panel = (PaneSearch) listPanel.get(a);
                pnlMain.removeAll();
                panel.searchText(listSearch, txtSeach.getText().trim());
                pnlMain.add(panel);
                pnlMain.updateUI();
                if (Integer.parseInt(listIndex.get(listIndex.size() - 1)) != a) {
                    listIndex.add(valueOf(0));
                    indexList = listIndex.size() - 1;
                }
                now = 0;
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
    
    private void txtSeachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeachKeyPressed
        if (KeyEvent.VK_ENTER == evt.getKeyCode()){
            search();
        }
    }//GEN-LAST:event_txtSeachKeyPressed

    private void btnSeach1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeach1MouseEntered
        btnSeach1.setSize(133, 38);
    }//GEN-LAST:event_btnSeach1MouseEntered

    private void btnSeach1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeach1MouseExited
        btnSeach1.setSize(135, 40);
    }//GEN-LAST:event_btnSeach1MouseExited

    private void btnSeach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeach1ActionPerformed
        search();
    }//GEN-LAST:event_btnSeach1ActionPerformed

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
            java.util.logging.Logger.getLogger(DlogFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlogFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlogFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlogFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlogFind dialog = new DlogFind(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnSeach1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtSeach;
    // End of variables declaration//GEN-END:variables
}
