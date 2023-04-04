/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import viewForm.FrmMain;
import viewForm.PaneCreateCart;

/**
 * --------------------- @author nguyenvanquan7826 ---------------------
 * ------------------ website: cachhoc.net ------------------- ---------- date:
 * Jul 24, 2014 - filename: DemoButtonTab.java ----------
 */
public class CloseTab extends JPanel {

    static PaneCreateCart closeTab;

    /**
     * JPanel contain a JLabel and a JButton to close
     */
    public CloseTab(PaneCreateCart closeTab) {
        this.closeTab = closeTab;
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        setBorder(new EmptyBorder(5, 2, 2, 2));
        setOpaque(false);
        addLabel();
        add(new Close());
    }

    private void addLabel() {
        JLabel label = new JLabel() {
            /**
             * set text for JLabel, it will title of tab
             */
            public String getText() {
                int index = closeTab.getTabbedPaneCart().indexOfTabComponent(CloseTab.this);
                if (index != -1) {
                    return closeTab.getTabbedPaneCart().getTitleAt(index);
                }
                return null;
            }
        };
        /**
         * add more space between the label and the button
         */
        label.setBorder(new EmptyBorder(0, 0, 0, 5));
        add(label);
    }

    public int index() {
        return closeTab.getTabbedPaneCart().indexOfTabComponent(CloseTab.this);
    }
                                                                  
    public class Close extends javax.swing.JPanel {

        public Close() {
            initComponents();
            setBackground(new java.awt.Color(240, 240, 240));
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            jLabel2 = new javax.swing.JLabel();

            addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    formMouseClicked(evt);
                }

                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    formMouseEntered(evt);
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    formMouseExited(evt);
                }
            });

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closetab_icon.png"))); // NOI18N

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2))
            );
        }// </editor-fold>                        

        private void formMouseEntered(java.awt.event.MouseEvent evt) {
            jLabel2.setForeground(Color.WHITE);
            setBackground(Color.red);
        }

        private void formMouseExited(java.awt.event.MouseEvent evt) {
            jLabel2.setForeground(Color.BLACK);
            setBackground(new java.awt.Color(255, 255, 255));
        }

        private void formMouseClicked(java.awt.event.MouseEvent evt) {
            if (index() != -1) {
                closeTab.removeTab(index());
            }
        }
        
        private javax.swing.JLabel jLabel2;
        
    }
}
