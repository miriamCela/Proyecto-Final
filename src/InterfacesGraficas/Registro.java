package InterfacesGraficas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        this.setSize(1100, 750);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistro = new javax.swing.JPanel();
        pnlRegistroCliente = new javax.swing.JPanel();
        lblRegistroCliente = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnVolverRegistro = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtNroDias = new javax.swing.JTextField();
        txtValorCosto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNroDias = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblNroHabitacion = new javax.swing.JLabel();
        txtNroHabitacion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCorreoInvalido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro.setBackground(new java.awt.Color(254, 250, 211));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistroCliente.setBackground(new java.awt.Color(192, 240, 202));
        pnlRegistroCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlRegistroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistroCliente.setText("REGISTRO DE CLIENTE");
        pnlRegistroCliente.add(lblRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 160, 40));

        btnGuardar.setBackground(new java.awt.Color(102, 234, 202));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlRegistroCliente.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 150, 50));

        btnVolverRegistro.setBackground(new java.awt.Color(102, 234, 202));
        btnVolverRegistro.setText("VOLVER");
        btnVolverRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverRegistroMouseExited(evt);
            }
        });
        btnVolverRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverRegistroActionPerformed(evt);
            }
        });
        pnlRegistroCliente.add(btnVolverRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        pnlRegistro.add(pnlRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        txtDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDNIMouseClicked(evt);
            }
        });
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDNIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });
        pnlRegistro.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 260, -1));

        lblNombres.setText("NOMBRES");
        pnlRegistro.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 160, 20));

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        pnlRegistro.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 260, -1));

        lblApellidos.setText("APELLIDOS");
        pnlRegistro.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 160, 20));

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        pnlRegistro.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 260, -1));

        lblCelular.setText("CELULAR");
        pnlRegistro.add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 160, 20));

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        pnlRegistro.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 260, -1));

        lblDNI.setText("DNI");
        pnlRegistro.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 160, 20));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        pnlRegistro.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 260, -1));

        lblCorreo.setText("CORREO");
        pnlRegistro.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 160, 20));

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        pnlRegistro.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 260, -1));

        txtNroDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroDiasActionPerformed(evt);
            }
        });
        txtNroDias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroDiasKeyTyped(evt);
            }
        });
        pnlRegistro.add(txtNroDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 260, -1));

        txtValorCosto.setText(" valor del costo");
        pnlRegistro.add(txtValorCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 160, 20));
        pnlRegistro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 710, 30));

        lblNroDias.setText("Nro. Dias");
        pnlRegistro.add(lblNroDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 100, 20));

        lblCosto.setText("costo:");
        pnlRegistro.add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 160, 20));

        lblNroHabitacion.setText("nro habitacion");
        pnlRegistro.add(lblNroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 100, 20));

        txtNroHabitacion.setText("nro");
        pnlRegistro.add(txtNroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 160, 20));

        jLabel3.setText("* Debe rellenar todos los campos\"");
        pnlRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 430, 30));
        pnlRegistro.add(lblCorreoInvalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 200, 20));

        getContentPane().add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtDNI.getText().isEmpty() || txtNombres.getText().isEmpty() || 
                txtApellidos.getText().isEmpty() || txtCelular.getText().isEmpty() ||
                txtCorreo.getText().isEmpty() || txtNroDias.getText().isEmpty()){ 
            
            JOptionPane.showMessageDialog(this, "Por favor, NO dejar campos vacíos");
            
        } else { 
            JOptionPane.showMessageDialog(rootPane, "REGISTRO EXITOSO");
            Menu m = new Menu();
            m.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverRegistroActionPerformed
        Habitacion h = new Habitacion();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverRegistroActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNroDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroDiasActionPerformed

    private void btnVolverRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverRegistroMouseEntered
        btnVolverRegistro.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnVolverRegistroMouseEntered

    private void btnVolverRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverRegistroMouseExited
        btnVolverRegistro.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnVolverRegistroMouseExited

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(247,201,222));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(102,234,202));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void txtDNIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDNIMouseClicked
    }//GEN-LAST:event_txtDNIMouseClicked

    private void txtDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyReleased
        
    }//GEN-LAST:event_txtDNIKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume();
        if (txtDNI.getText().length() == 10)evt.consume();
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z')&& (c!=KeyEvent.VK_BACK_SPACE) && (c!=KeyEvent.VK_SPACE)) evt.consume();
        if (txtNombres.getText().length() == 20)evt.consume();
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z')&& (c!=KeyEvent.VK_BACK_SPACE) && (c!=KeyEvent.VK_SPACE)) evt.consume();
        if (txtApellidos.getText().length() == 20)evt.consume();
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9') evt.consume();
        if (txtCelular.getText().length() == 10)evt.consume();
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        if (correo(txtCorreo.getText())) {
        } else {
            JOptionPane.showMessageDialog(null, "Correo incorrecto", "validar correo", JOptionPane.INFORMATION_MESSAGE);
            txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtNroDiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroDiasKeyTyped
        char c = evt.getKeyChar();
        if (c<'0' || c>'9')evt.consume();
        if (txtNroDias.getText().length() == 2)evt.consume();
    }//GEN-LAST:event_txtNroDiasKeyTyped

    public boolean correo(String correo){
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile ("^[A-Za-z0-9- _ ][\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*\\w{2,30}@(hotmail|gmail|outlook)\\.(com|es|ec|net)$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            return true;
        }else{
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolverRegistro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreoInvalido;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNroDias;
    private javax.swing.JLabel lblNroHabitacion;
    private javax.swing.JLabel lblRegistroCliente;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JPanel pnlRegistroCliente;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNroDias;
    private javax.swing.JLabel txtNroHabitacion;
    private javax.swing.JLabel txtValorCosto;
    // End of variables declaration//GEN-END:variables
}
