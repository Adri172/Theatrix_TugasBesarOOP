/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheatrixApp;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/**
 *
 * @author Tuf Gaming
 */
public class GUI_Theater2 extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Theater2
     */
    public GUI_Theater2() {
        initComponents();
        Database db = new Database();
        db.Query("delete from orders");
        ImageIcon icon = new ImageIcon("src/Image/Icon-Theatrix.png");
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hRidge = new javax.swing.JLabel();
        sFFH = new javax.swing.JLabel();
        sROTS = new javax.swing.JLabel();
        bd = new javax.swing.JLabel();
        sFarfh = new javax.swing.JLabel();
        fhRidge = new javax.swing.JLabel();
        sWTROS = new javax.swing.JLabel();
        fBD = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 151, 133));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        hRidge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/20.PNG"))); // NOI18N
        hRidge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hRidgeMouseClicked(evt);
            }
        });

        sFFH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/21.png"))); // NOI18N
        sFFH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sFFHMouseClicked(evt);
            }
        });

        sROTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/22.png"))); // NOI18N
        sROTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sROTSMouseClicked(evt);
            }
        });

        bd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/23.png"))); // NOI18N
        bd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdMouseClicked(evt);
            }
        });

        sFarfh.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        sFarfh.setForeground(new java.awt.Color(255, 255, 255));
        sFarfh.setText("SPIDERMAN FAR FROM HOME");

        fhRidge.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        fhRidge.setForeground(new java.awt.Color(255, 255, 255));
        fhRidge.setText("HACKSAW RIDGE");

        sWTROS.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        sWTROS.setForeground(new java.awt.Color(255, 255, 255));
        sWTROS.setText("STAR WARS THE RISE OF SKYWALKER");

        fBD.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        fBD.setForeground(new java.awt.Color(255, 255, 255));
        fBD.setText("BABY DRIVER");

        lblBack.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back.png"))); // NOI18N
        lblBack.setText(" Back");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Theatrix-Logo-Medium.png"))); // NOI18N
        jLabel2.setText("NOW PLAYING");

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Theater II.png"))); // NOI18N
        jLabel1.setText("THEATER II");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblBack)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(137, 137, 137)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(fhRidge)
                        .addGap(127, 127, 127)
                        .addComponent(sFarfh)
                        .addGap(80, 80, 80)
                        .addComponent(sWTROS))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hRidge)
                        .addGap(137, 137, 137)
                        .addComponent(sFFH)
                        .addGap(161, 161, 161)
                        .addComponent(sROTS)))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bd)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(fBD)))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBack)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sFFH)
                    .addComponent(hRidge)
                    .addComponent(sROTS)
                    .addComponent(bd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fBD)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sFarfh)
                        .addComponent(sWTROS))
                    .addComponent(fhRidge))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hRidgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hRidgeMouseClicked
        // TODO add your handling code here:
        try {
            Sementara pl = new Sementara();
            pl.tayang(fhRidge.getText());
            
            GUI_T2InfoFilm t2 = new GUI_T2InfoFilm();
            t2.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_T2InfoFilm.class.getName()).log(Level.SEVERE, null, ex);
        }           
              
    }//GEN-LAST:event_hRidgeMouseClicked

    private void sFFHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sFFHMouseClicked
        // TODO add your handling code here:
        try {
            Sementara pl = new Sementara();
            pl.tayang(sFarfh.getText());
            
            GUI_T2InfoFilm t2 = new GUI_T2InfoFilm();
            t2.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_T2InfoFilm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_sFFHMouseClicked

    private void sROTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sROTSMouseClicked
        // TODO add your handling code here:
        try {
            Sementara pl = new Sementara();
            pl.tayang(sWTROS.getText());
            
            GUI_T2InfoFilm t2 = new GUI_T2InfoFilm();
            t2.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_T2InfoFilm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_sROTSMouseClicked

    private void bdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdMouseClicked
        // TODO add your handling code here:
        try {
            Sementara pl = new Sementara();
            pl.tayang(fBD.getText());
            
            GUI_T2InfoFilm t2 = new GUI_T2InfoFilm();
            t2.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_T2InfoFilm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_bdMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        GUI_PilTheater p = new GUI_PilTheater();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bd;
    private javax.swing.JLabel fBD;
    private javax.swing.JLabel fhRidge;
    private javax.swing.JLabel hRidge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel sFFH;
    private javax.swing.JLabel sFarfh;
    private javax.swing.JLabel sROTS;
    private javax.swing.JLabel sWTROS;
    // End of variables declaration//GEN-END:variables
}
