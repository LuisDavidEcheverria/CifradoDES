package des;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.Accessible;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UI extends javax.swing.JFrame {

    public UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jFileChooser3 = new javax.swing.JFileChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jFileChooser4 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cifradoTxt = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cifrarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        claveTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        seleccionarBtn = new javax.swing.JButton();
        mensajeTxt = new javax.swing.JTextField();
        descifrarBtn = new javax.swing.JButton();
        rutaTxt = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tarea ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, -1, -1));

        jLabel2.setText("Mensaje");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cifrar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 282, -1));

        cifradoTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DES", "AES-128", "AES-192", "AES-256" }));
        cifradoTxt.setKeySelectionManager(null);
        cifradoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifradoTxtActionPerformed(evt);
            }
        });
        getContentPane().add(cifradoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 102, -1));

        jLabel4.setText("Cifrado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        cifrarBtn.setText("Cifrar");
        cifrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cifrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel5.setText("Clave");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));
        getContentPane().add(claveTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 280, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 12, 50, 200));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Descifrar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 350, -1));

        seleccionarBtn.setText("Seleccionar Archivo");
        seleccionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(seleccionarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 160, 30));

        mensajeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajeTxtActionPerformed(evt);
            }
        });
        getContentPane().add(mensajeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, -1));

        descifrarBtn.setText("Descifrar");
        descifrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descifrarBtnActionPerformed(evt);
            }
        });
        getContentPane().add(descifrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, -1));

        rutaTxt.setEditable(false);
        getContentPane().add(rutaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cifradoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifradoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cifradoTxtActionPerformed
    Path ruta;
    CifradoAES cifrador = new CifradoAES();
    private void seleccionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarBtnActionPerformed
        //Desplegar el selector de archivos
        JFileChooser selector = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("txt", "txt");
        selector.setFileFilter(filtro);
        int returnVal = selector.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("ARCHIVO SELECCIONADO: " + selector.getSelectedFile().getPath());
            ruta = Paths.get(selector.getSelectedFile().getPath());
            rutaTxt.setText(selector.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_seleccionarBtnActionPerformed

    private void cifrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifrarBtnActionPerformed
        String mensaje = "", clave = "", cifrado = "", mensajeCifrado = "";

        //Obtener los componentes
        mensaje = mensajeTxt.getText();
        clave = claveTxt.getText();
        cifrado = cifradoTxt.getSelectedItem().toString();
        //Verificar que ninguno esté vacio
        if ("".equals(mensaje) || "".equals(clave) || "".equals(cifrado)) {
            JOptionPane.showMessageDialog(null, "Favor de introducir todos los datos");
        } else {
            clave = cifrador.AdaptarLlave(clave);
            if (cifrador.ValidarLlave(clave, cifrado)) {
                //Imprimir los datos
                System.out.println("TIPO DE CIFRADO: " + cifrado);
                System.out.println("MENSAJE: " + mensaje);
                System.out.println("CLAVE: " + clave);
                switch (cifrado) {
                    case "DES":
                        break;
                    default:
                        mensajeCifrado = cifrador.CifrarAES(clave, mensaje);
                        System.out.println("MENSAJE CIFRADO: " + mensajeCifrado);
                         {
                            try {
                                System.out.println(cifrador.DescifrarAES(clave, mensajeCifrado));
                            } catch (NoSuchAlgorithmException ex) {
                                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (NoSuchPaddingException ex) {
                                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                }
                try {
                    cifrador.EscribirArchivo(clave, mensajeCifrado, cifrado);
                } catch (IOException ex) {
                    Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Favor de introducir una clave valida para el tipo de dato cifrado");
            }
        }

    }//GEN-LAST:event_cifrarBtnActionPerformed

    private void mensajeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensajeTxtActionPerformed

    private void descifrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descifrarBtnActionPerformed
        String clave = "";
        try {
            clave = cifrador.AdaptarLlave(clave);

            String mensajeCifrado = "", mensajeOriginal = "prueba", XD = "";
            cifrador.LeerArchivo(ruta);
            clave = cifrador.getdClave();
            mensajeCifrado = cifrador.getdMensajeCifrado();
            System.out.println("CLAVE:  " + clave);
            System.out.println("MENSAJE CIFFRADO: " + mensajeCifrado);
            try {
                XD = cifrador.CifrarAES(clave, XD);
                mensajeOriginal = cifrador.DescifrarAES(clave, mensajeCifrado);
                System.out.println(mensajeOriginal);
                cifrador.EscribirArchivoDescifrado(mensajeOriginal);
                JOptionPane.showMessageDialog(null, "Archivo Descifrado");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Mensaje Descifrado: " + mensajeOriginal);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            JOptionPane.showMessageDialog(null, "Selecciona un archivo valido");
        }
    }//GEN-LAST:event_descifrarBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cifradoTxt;
    private javax.swing.JButton cifrarBtn;
    private javax.swing.JTextField claveTxt;
    private javax.swing.JButton descifrarBtn;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFileChooser jFileChooser3;
    private javax.swing.JFileChooser jFileChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mensajeTxt;
    private javax.swing.JTextField rutaTxt;
    private javax.swing.JButton seleccionarBtn;
    // End of variables declaration//GEN-END:variables
}
