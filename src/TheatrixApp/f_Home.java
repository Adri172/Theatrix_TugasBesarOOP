/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheatrixApp;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Stevan Del Arisandi 1301184365
 */
public class f_Home extends javax.swing.JFrame {
    
    
    /**
     * Creates new form f_Home
     */
    public f_Home() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/Image/Icon-Theatrix.png");
        setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        icoProfile = new javax.swing.JLabel();
        lblProfile = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        icoPrint = new javax.swing.JLabel();
        icoOrder = new javax.swing.JLabel();
        lblAbout = new javax.swing.JLabel();
        icoAbout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(21, 151, 133));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home Page");

        lblWelcome.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Welcome");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Theatrix-Logo-Large.png"))); // NOI18N

        icoProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Profile.png"))); // NOI18N
        icoProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoProfileMouseClicked(evt);
            }
        });

        lblProfile.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        lblProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblProfile.setText("Profile");
        lblProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProfileMouseClicked(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logout.png"))); // NOI18N
        lblLogout.setText("Logout");
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        icoPrint.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        icoPrint.setForeground(new java.awt.Color(255, 255, 255));
        icoPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Print.png"))); // NOI18N
        icoPrint.setText("Print your Purchased Ticket");
        icoPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoPrintMouseClicked(evt);
            }
        });

        icoOrder.setFont(new java.awt.Font("Rockwell Condensed", 1, 16)); // NOI18N
        icoOrder.setForeground(new java.awt.Color(255, 255, 255));
        icoOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Order.png"))); // NOI18N
        icoOrder.setText("Order a Movie Ticket");
        icoOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoOrderMouseClicked(evt);
            }
        });

        lblAbout.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        lblAbout.setForeground(new java.awt.Color(255, 255, 255));
        lblAbout.setText("About");
        lblAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutMouseClicked(evt);
            }
        });

        icoAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Info.png"))); // NOI18N
        icoAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icoAboutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblLogout)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(icoProfile))
                            .addComponent(lblProfile)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(icoAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblAbout))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblWelcome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(icoOrder))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(icoPrint)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(icoProfile)
                        .addGap(6, 6, 6)
                        .addComponent(lblProfile)
                        .addGap(20, 20, 20)
                        .addComponent(icoAbout)
                        .addGap(0, 0, 0)
                        .addComponent(lblAbout)))
                .addGap(18, 18, 18)
                .addComponent(lblWelcome)
                .addGap(35, 35, 35)
                .addComponent(icoOrder)
                .addGap(43, 43, 43)
                .addComponent(icoPrint)
                .addContainerGap(61, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        c_Home LoggedUser = new c_Home();
        
        try {
            if (LoggedUser.simpanProfil() != null) {
                LoggedUser.detailProfil(LoggedUser.simpanProfil());
                lblWelcome.setText("Welcome, "+LoggedUser.getNama());
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } catch (SQLException ex) {
            Logger.getLogger(f_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formComponentShown

    private void icoProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoProfileMouseClicked
        try {
            Frame_PROFILE pro = new Frame_PROFILE();
            pro.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(f_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_icoProfileMouseClicked

    private void lblProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProfileMouseClicked
        try {
            Frame_PROFILE pro = new Frame_PROFILE();
            pro.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(f_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblProfileMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        Logout off = new Logout();
        off.LogOff();

        f_Login login = new f_Login();
        login.setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null, "Your Account successfully logged off");
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void icoPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoPrintMouseClicked
        f_Transaksi tiket = new f_Transaksi();
        tiket.setVisible(true);
        tiket.pack();
        this.dispose();
    }//GEN-LAST:event_icoPrintMouseClicked

    private void icoOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoOrderMouseClicked
        GUI_PilTheater order = new GUI_PilTheater();
        order.setVisible(true);
        order.pack();
        this.dispose();
    }//GEN-LAST:event_icoOrderMouseClicked

    private void lblAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseClicked
        f_About info = new f_About();
        info.setVisible(true);
        info.pack();
        this.dispose();
    }//GEN-LAST:event_lblAboutMouseClicked

    private void icoAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icoAboutMouseClicked
        f_About info = new f_About();
        info.setVisible(true);
        info.pack();
        this.dispose();
    }//GEN-LAST:event_icoAboutMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(f_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(f_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(f_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(f_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new f_Home().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icoAbout;
    private javax.swing.JLabel icoOrder;
    private javax.swing.JLabel icoPrint;
    private javax.swing.JLabel icoProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
