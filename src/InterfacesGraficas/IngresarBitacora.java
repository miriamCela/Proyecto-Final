package InterfacesGraficas;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class IngresarBitacora extends javax.swing.JFrame {

    //IngresarBitacora i = new IngresarBitacora();

    public IngresarBitacora() {
        initComponents();
        this.setSize(650, 400);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIngresarBitacora = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblIngresarBitacora = new javax.swing.JLabel();
        btnIngresarBitacora = new javax.swing.JButton();
        btnAbortar = new javax.swing.JButton();
        lblContrasena = new javax.swing.JLabel();
        pswcontraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIngresarBitacora.setBackground(new java.awt.Color(254, 250, 211));
        pnlIngresarBitacora.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(192, 240, 202));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIngresarBitacora.setText("INGRESAR A LA BITACORA");
        jPanel2.add(lblIngresarBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 170, 20));

        pnlIngresarBitacora.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        btnIngresarBitacora.setBackground(new java.awt.Color(102, 234, 202));
        btnIngresarBitacora.setText("INGRESAR");
        btnIngresarBitacora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarBitacoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarBitacoraMouseExited(evt);
            }
        });
        btnIngresarBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarBitacoraActionPerformed(evt);
            }
        });
        pnlIngresarBitacora.add(btnIngresarBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 320, 40));

        btnAbortar.setBackground(new java.awt.Color(102, 234, 202));
        btnAbortar.setText("ABORTAR");
        btnAbortar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAbortarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAbortarMouseExited(evt);
            }
        });
        btnAbortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbortarActionPerformed(evt);
            }
        });
        pnlIngresarBitacora.add(btnAbortar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 330, 40));

        lblContrasena.setText("CONTRASEÑA:");
        pnlIngresarBitacora.add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 100, 30));

        pswcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pswcontraseñaKeyTyped(evt);
            }
        });
        pnlIngresarBitacora.add(pswcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 160, 30));

        jLabel3.setText("USUARIO:");
        pnlIngresarBitacora.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        txtusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtusuarioKeyTyped(evt);
            }
        });
        pnlIngresarBitacora.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 160, 30));

        getContentPane().add(pnlIngresarBitacora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbortarActionPerformed
        Inicial m = new Inicial();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAbortarActionPerformed

    private void btnIngresarBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarBitacoraActionPerformed
        String usuario = txtusuario.getText();
        String contraseña = pswcontraseña.getText();
        
        if (usuario.isEmpty() || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algún campo esta vacío");
        } else {
            if (usuario.equals("recepcionista0") && contraseña.equals("latuyasiacaso")) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                Bitacora b = new Bitacora();
                b.setVisible(true);
        dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Su usuario o contraseña es incorrecto!!!");
            }
        }
    }//GEN-LAST:event_btnIngresarBitacoraActionPerformed

    private void btnAbortarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbortarMouseEntered
        btnAbortar.setBackground(new Color(247,201,22));
    }//GEN-LAST:event_btnAbortarMouseEntered

    private void btnAbortarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbortarMouseExited
        btnAbortar.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnAbortarMouseExited

    private void btnIngresarBitacoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarBitacoraMouseEntered
        btnIngresarBitacora.setBackground(new Color(247,201,22));
    }//GEN-LAST:event_btnIngresarBitacoraMouseEntered

    private void btnIngresarBitacoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarBitacoraMouseExited
        btnIngresarBitacora.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnIngresarBitacoraMouseExited

    private void txtusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusuarioKeyTyped
        if (usuaycontra(txtusuario.getText()));
        if (txtusuario.getText().length() == 20)evt.consume();
    }//GEN-LAST:event_txtusuarioKeyTyped

    private void pswcontraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswcontraseñaKeyTyped
        if (usuaycontra(pswcontraseña.getText()));
        if (pswcontraseña.getText().length() == 20)evt.consume();
    }//GEN-LAST:event_pswcontraseñaKeyTyped

    public boolean usuaycontra(String usucon){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile ("^[A-Za-z0-9- _ ][\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*$");
        mat = pat.matcher(usucon);
        if (mat.find()) {
            return true;
        }else{
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbortar;
    private javax.swing.JButton btnIngresarBitacora;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblIngresarBitacora;
    private javax.swing.JPanel pnlIngresarBitacora;
    private javax.swing.JPasswordField pswcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
