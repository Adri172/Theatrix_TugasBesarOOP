/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheatrixApp;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Tuf Gaming
 */
public class GUI_Theater1 extends javax.swing.JFrame {

    /**
     * Creates new form JadwalFilm
     */
    public GUI_Theater1(){
        initComponents();
        Database db = new Database();
        db.Query("delete from orders");
        ImageIcon icon = new ImageIcon("src/Image/Icon-Theatrix.png");
        setIconImage(icon.getImage());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lajoker = new javax.swing.JLabel();
        fjoker = new javax.swing.JLabel();
        flaskarpelangi = new javax.swing.JLabel();
        llaskar = new javax.swing.JLabel();
        fkniveout = new javax.swing.JLabel();
        laknives = new javax.swing.JLabel();
        fnkcthi = new javax.swing.JLabel();
        lankcthi = new javax.swing.JLabel();
        faac = new javax.swing.JLabel();
        laac = new javax.swing.JLabel();
        fendgame = new javax.swing.JLabel();
        laendgame = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(21, 151, 133));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Theater I.png"))); // NOI18N
        jLabel1.setText("THEATER I");

        lajoker.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lajoker.setForeground(new java.awt.Color(255, 255, 255));
        lajoker.setText("JOKER");

        fjoker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Capture112.PNG"))); // NOI18N
        fjoker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fjokerMouseClicked(evt);
            }
        });

        flaskarpelangi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/15.PNG"))); // NOI18N
        flaskarpelangi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flaskarpelangiMouseClicked(evt);
            }
        });

        llaskar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        llaskar.setForeground(new java.awt.Color(255, 255, 255));
        llaskar.setText("LASKAR PELANGI");

        fkniveout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/17.PNG"))); // NOI18N
        fkniveout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fkniveoutMouseClicked(evt);
            }
        });

        laknives.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        laknives.setForeground(new java.awt.Color(255, 255, 255));
        laknives.setText("KNIVES OUT");

        fnkcthi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/13.PNG"))); // NOI18N
        fnkcthi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnkcthiMouseClicked(evt);
            }
        });

        lankcthi.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        lankcthi.setForeground(new java.awt.Color(255, 255, 255));
        lankcthi.setText("NANTI KITA CERITA TENTANG HARI INI");

        faac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/16.PNG"))); // NOI18N
        faac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faacMouseClicked(evt);
            }
        });

        laac.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        laac.setForeground(new java.awt.Color(255, 255, 255));
        laac.setText("AYAT AYAT CINTA");

        fendgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/114.PNG"))); // NOI18N
        fendgame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fendgameMouseClicked(evt);
            }
        });

        laendgame.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        laendgame.setForeground(new java.awt.Color(255, 255, 255));
        laendgame.setText("AVENGERS ENDGAME");

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Theatrix-Logo-Medium.png"))); // NOI18N
        jLabel2.setText("NOW PLAYING");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblBack)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fjoker)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lajoker)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(flaskarpelangi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addComponent(fkniveout)
                                .addGap(138, 138, 138))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(llaskar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(laknives)
                                .addGap(163, 163, 163)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lankcthi)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(fnkcthi)))
                        .addContainerGap(119, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(255, 255, 255)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(faac)
                            .addComponent(laac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(fendgame)
                                .addGap(15, 15, 15))
                            .addComponent(laendgame, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(370, 370, 370))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fjoker)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fkniveout)
                                    .addComponent(flaskarpelangi, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fnkcthi)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lajoker)
                            .addComponent(llaskar)
                            .addComponent(laknives)
                            .addComponent(lankcthi))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fendgame)
                            .addComponent(faac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laac)
                            .addComponent(laendgame)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBack)
                        .addComponent(jLabel1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fjokerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fjokerMouseClicked
         try {
            Sementara play = new Sementara();
            play.tayang(lajoker.getText());
            
            GUI_InfoFilm fi = new GUI_InfoFilm();
            fi.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error :"+ex.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }           
    }//GEN-LAST:event_fjokerMouseClicked

    private void flaskarpelangiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flaskarpelangiMouseClicked
        try {
            Sementara play = new Sementara();
            play.tayang(llaskar.getText());
            
            GUI_InfoFilm fi = new GUI_InfoFilm();
            fi.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error :"+ex.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_flaskarpelangiMouseClicked

    private void fkniveoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fkniveoutMouseClicked
         try {
            Sementara play = new Sementara();
            play.tayang(laknives.getText());
            
            GUI_InfoFilm fi = new GUI_InfoFilm();
            fi.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error :"+ex.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_fkniveoutMouseClicked

    private void fnkcthiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnkcthiMouseClicked
       try {
            Sementara play = new Sementara();
            play.tayang(lankcthi.getText());
            
            GUI_InfoFilm fi = new GUI_InfoFilm();
            fi.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error :"+ex.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_fnkcthiMouseClicked

    private void faacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faacMouseClicked
        try {
            Sementara play = new Sementara();
            play.tayang(laac.getText());
            
            GUI_InfoFilm fi = new GUI_InfoFilm();
            fi.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error :"+ex.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_faacMouseClicked

    private void fendgameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fendgameMouseClicked
        try {
            Sementara play = new Sementara();
            play.tayang(laendgame.getText());
            
            GUI_InfoFilm fi = new GUI_InfoFilm();
            fi.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error :"+ex.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_fendgameMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        GUI_PilTheater p = new GUI_PilTheater();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel faac;
    private javax.swing.JLabel fendgame;
    private javax.swing.JLabel fjoker;
    private javax.swing.JLabel fkniveout;
    private javax.swing.JLabel flaskarpelangi;
    private javax.swing.JLabel fnkcthi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel laac;
    private javax.swing.JLabel laendgame;
    private javax.swing.JLabel lajoker;
    private javax.swing.JLabel laknives;
    private javax.swing.JLabel lankcthi;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel llaskar;
    // End of variables declaration//GEN-END:variables

}