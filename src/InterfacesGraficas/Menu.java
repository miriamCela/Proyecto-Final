package InterfacesGraficas;

import java.awt.Color;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setSize(1100, 750);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        pnlTituloMenu = new javax.swing.JPanel();
        btnXCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVolverMenu = new javax.swing.JButton();
        btnHabitacion5 = new javax.swing.JButton();
        btnHabitacion1 = new javax.swing.JButton();
        btnHabitacion2 = new javax.swing.JButton();
        btnHabitacion3 = new javax.swing.JButton();
        btnHabitacion4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(254, 250, 211));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTituloMenu.setBackground(new java.awt.Color(192, 240, 202));
        pnlTituloMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTituloMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnXCerrar.setBackground(new java.awt.Color(102, 234, 202));
        btnXCerrar.setText("X");
        btnXCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXCerrarMouseExited(evt);
            }
        });
        btnXCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXCerrarActionPerformed(evt);
            }
        });
        pnlTituloMenu.add(btnXCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 60, 50));

        jLabel1.setText("SOFFTEL");
        pnlTituloMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 70, 40));

        pnlMenu.add(pnlTituloMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        btnVolverMenu.setBackground(new java.awt.Color(102, 234, 202));
        btnVolverMenu.setText("VOLVER");
        btnVolverMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMenuMouseExited(evt);
            }
        });
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });
        pnlMenu.add(btnVolverMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 150, 60));

        btnHabitacion5.setBackground(new java.awt.Color(102, 234, 202));
        btnHabitacion5.setText("HABITACION 5");
        btnHabitacion5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacion5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacion5MouseExited(evt);
            }
        });
        btnHabitacion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion5ActionPerformed(evt);
            }
        });
        pnlMenu.add(btnHabitacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 820, 80));

        btnHabitacion1.setBackground(new java.awt.Color(102, 234, 202));
        btnHabitacion1.setText("HABITACION 1");
        btnHabitacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacion1MouseExited(evt);
            }
        });
        btnHabitacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion1ActionPerformed(evt);
            }
        });
        pnlMenu.add(btnHabitacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 820, 80));

        btnHabitacion2.setBackground(new java.awt.Color(102, 234, 202));
        btnHabitacion2.setText("HABITACION 2");
        btnHabitacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacion2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacion2MouseExited(evt);
            }
        });
        btnHabitacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion2ActionPerformed(evt);
            }
        });
        pnlMenu.add(btnHabitacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 820, 80));

        btnHabitacion3.setBackground(new java.awt.Color(102, 234, 202));
        btnHabitacion3.setText("HABITACION 3");
        btnHabitacion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacion3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacion3MouseExited(evt);
            }
        });
        btnHabitacion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion3ActionPerformed(evt);
            }
        });
        pnlMenu.add(btnHabitacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 820, 80));

        btnHabitacion4.setBackground(new java.awt.Color(102, 234, 202));
        btnHabitacion4.setText("HABITACION 4");
        btnHabitacion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacion4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacion4MouseExited(evt);
            }
        });
        btnHabitacion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion4ActionPerformed(evt);
            }
        });
        pnlMenu.add(btnHabitacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 820, 80));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnXCerrarActionPerformed

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        Inicial i = new Inicial();
        i.setVisible(true);
        dispose(); // sirve para que se quede una sola ventana en pantalla
    }//GEN-LAST:event_btnVolverMenuActionPerformed

    private void btnHabitacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion1ActionPerformed
        Habitacion h1 = new Habitacion();
        h1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHabitacion1ActionPerformed

    private void btnXCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXCerrarMouseEntered
        btnXCerrar.setBackground(new Color(232,17,35));
    }//GEN-LAST:event_btnXCerrarMouseEntered

    private void btnXCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXCerrarMouseExited
        btnXCerrar.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnXCerrarMouseExited

    private void btnHabitacion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacion1MouseEntered
        btnHabitacion1.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnHabitacion1MouseEntered

    private void btnHabitacion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacion1MouseExited
        btnHabitacion1.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnHabitacion1MouseExited

    private void btnHabitacion2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacion2MouseEntered
        btnHabitacion2.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnHabitacion2MouseEntered

    private void btnHabitacion2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacion2MouseExited
        btnHabitacion2.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnHabitacion2MouseExited

    private void btnHabitacion3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacion3MouseEntered
        btnHabitacion3.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnHabitacion3MouseEntered

    private void btnHabitacion3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacion3MouseExited
        btnHabitacion3.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnHabitacion3MouseExited

    private void btnHabitacion4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacion4MouseEntered
        btnHabitacion4.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnHabitacion4MouseEntered

    private void btnHabitacion4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacion4MouseExited
        btnHabitacion4.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnHabitacion4MouseExited

    private void btnHabitacion5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacion5MouseEntered
        btnHabitacion5.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnHabitacion5MouseEntered

    private void btnHabitacion5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacion5MouseExited
        btnHabitacion5.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnHabitacion5MouseExited

    private void btnVolverMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMenuMouseEntered
        btnVolverMenu.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnVolverMenuMouseEntered

    private void btnVolverMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMenuMouseExited
        btnVolverMenu.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnVolverMenuMouseExited

    private void btnHabitacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion2ActionPerformed
        Habitacion h2 = new Habitacion();
        h2.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHabitacion2ActionPerformed

    private void btnHabitacion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion3ActionPerformed
        Habitacion h3 = new Habitacion();
        h3.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHabitacion3ActionPerformed

    private void btnHabitacion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion4ActionPerformed
        Habitacion h4 = new Habitacion();
        h4.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHabitacion4ActionPerformed

    private void btnHabitacion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion5ActionPerformed
        Habitacion h5 = new Habitacion();
        h5.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnHabitacion5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitacion1;
    private javax.swing.JButton btnHabitacion2;
    private javax.swing.JButton btnHabitacion3;
    private javax.swing.JButton btnHabitacion4;
    private javax.swing.JButton btnHabitacion5;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JButton btnXCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTituloMenu;
    // End of variables declaration//GEN-END:variables
}
