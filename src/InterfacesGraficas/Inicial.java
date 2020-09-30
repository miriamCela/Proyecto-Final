package InterfacesGraficas;

import java.awt.Color;

public class Inicial extends javax.swing.JFrame {

    public Inicial() {
        initComponents();
        this.setSize(1100, 750);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fondoIncial = new javax.swing.JLabel();
        btnTituloProyecto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAdministracion = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        pnlLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fondoIncial, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 790, 750));

        btnTituloProyecto.setBackground(new java.awt.Color(102, 234, 202));
        btnTituloProyecto.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        btnTituloProyecto.setForeground(new java.awt.Color(0, 0, 0));
        btnTituloProyecto.setText(" SOFTTEL");
        btnTituloProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTituloProyectoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTituloProyectoMouseExited(evt);
            }
        });
        btnTituloProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTituloProyectoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTituloProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 110));

        btnSalir.setBackground(new java.awt.Color(102, 234, 202));
        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 310, 110));

        btnAdministracion.setBackground(new java.awt.Color(102, 234, 202));
        btnAdministracion.setText("ADMINISTRACIÓN");
        btnAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdministracionMouseExited(evt);
            }
        });
        btnAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministracionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 310, 110));

        btnIniciar.setBackground(new java.awt.Color(102, 234, 202));
        btnIniciar.setText("INICIAR");
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarMouseExited(evt);
            }
        });
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 310, 110));
        jPanel1.add(pnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 310, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTituloProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTituloProyectoActionPerformed
        Presentacion p = new Presentacion();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTituloProyectoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0); //cierra todas las ventanas y finaliza el programa
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministracionActionPerformed
        IngresarBitacora ib = new IngresarBitacora();
        ib.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAdministracionActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new java.awt.Color(232,17,35));

    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new java.awt.Color(102, 234, 202));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnTituloProyectoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTituloProyectoMouseEntered
        btnTituloProyecto.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnTituloProyectoMouseEntered

    private void btnTituloProyectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTituloProyectoMouseExited
        btnTituloProyecto.setBackground(new Color(102, 234, 202));
    }//GEN-LAST:event_btnTituloProyectoMouseExited

    private void btnIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseEntered
        btnIniciar.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnIniciarMouseEntered

    private void btnIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseExited
        btnIniciar.setBackground(new Color(102, 234, 202));
    }//GEN-LAST:event_btnIniciarMouseExited

    private void btnAdministracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseEntered
        btnAdministracion.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnAdministracionMouseEntered

    private void btnAdministracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministracionMouseExited
        btnAdministracion.setBackground(new Color(102, 234, 202));
    }//GEN-LAST:event_btnAdministracionMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministracion;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTituloProyecto;
    private javax.swing.JLabel fondoIncial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pnlLogo;
    // End of variables declaration//GEN-END:variables
}
