/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import modelo.*;

/**
 *
 * @author DAM2
 */
public class ModificarUsu extends javax.swing.JDialog {

    /**
     * Creates new form ModificarUsu
     */
    public ModificarUsu(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        initComponents();
        setLocationRelativeTo(null);
        //ponLaAyuda();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        nom_usu = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        tlf = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        fech_nac = new javax.swing.JLabel();
        pais = new javax.swing.JLabel();
        comunidad_auto = new javax.swing.JLabel();
        provincia = new javax.swing.JLabel();
        ciudad = new javax.swing.JLabel();
        domicilio = new javax.swing.JLabel();
        txtnom_usu = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txttlf = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        txtfech_nac = new javax.swing.JTextField();
        txtpais = new javax.swing.JTextField();
        txtcomunidad_autonoma = new javax.swing.JTextField();
        txtprovincia = new javax.swing.JTextField();
        txtciudad = new javax.swing.JTextField();
        txtdomicilio = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        checkAdmin = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar");

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        nom_usu.setText("nom_usu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(nom_usu, gridBagConstraints);

        pass.setText("pass");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(pass, gridBagConstraints);

        admin.setText("admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(admin, gridBagConstraints);

        correo.setText("correo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(correo, gridBagConstraints);

        nombre.setText("nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(nombre, gridBagConstraints);

        apellidos.setText("apellidos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(apellidos, gridBagConstraints);

        tlf.setText("tlf");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(tlf, gridBagConstraints);

        sexo.setText("sexo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(sexo, gridBagConstraints);

        fech_nac.setText("fech_nac");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(fech_nac, gridBagConstraints);

        pais.setText("pais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(pais, gridBagConstraints);

        comunidad_auto.setText("comunidad_autonoma");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(comunidad_auto, gridBagConstraints);

        provincia.setText("provincia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(provincia, gridBagConstraints);

        ciudad.setText("ciudad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(ciudad, gridBagConstraints);

        domicilio.setText("domicilio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(domicilio, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtnom_usu, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtpass, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtcorreo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtnombre, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtapellidos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txttlf, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtsexo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtfech_nac, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtpais, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtcomunidad_autonoma, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtprovincia, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtciudad, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(txtdomicilio, gridBagConstraints);

        btnCancelar.setBackground(new java.awt.Color(255, 255, 204));
        btnCancelar.setText("Cancelar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        jPanel2.add(btnCancelar, gridBagConstraints);

        btnAceptar.setBackground(new java.awt.Color(255, 255, 204));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        jPanel2.add(btnAceptar, gridBagConstraints);

        checkAdmin.setText("Admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel2.add(checkAdmin, gridBagConstraints);

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

            use.setUsuario(txtnom_usu.getText());
            use.setContrasena(txtpass.getText());
            boolean Admin=false;
            if(checkAdmin.isSelected()){
                Admin=true;
            }else{
                Admin=false;
            }
            use.setAdmin(checkAdmin.isSelected());
            use.setCorreoRecuperacion(txtcorreo.getText());
            use.setNombre(txtnombre.getText());
            use.setApellidos(txtapellidos.getText());
            use.setTlf(Integer.parseInt(txttlf.getText()));
            LocalDate fechaNac=LocalDate.parse(txtfech_nac.getText());
            use.setNacimiento(fechaNac);
            use.setPais(txtpais.getText());
            use.setComunidadAutonoma(txtcomunidad_autonoma.getText());
            use.setProvincia(txtprovincia.getText());
            use.setCiudad(txtciudad.getText());
            use.setDomicilio(txtdomicilio.getText());
            setVisible(false);
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public Usuario getUsuario(){
        return use;
    }
    public void setUsuario(Usuario user){
        txtnom_usu.setText(user.getUsuario());
        txtpass.setText(user.getContrasena());
        if(user.getAdmin()){
            checkAdmin.setSelected(true);
        }else{
            checkAdmin.setSelected(false);
        }
        txtcorreo.setText(user.getCorreoRecuperacion());
        txtnombre.setText(user.getNombre());
        txtapellidos.setText(user.getApellidos());
        txttlf.setText(user.getTlf()+"");
        txtsexo.setText(user.getSexo());
        txtfech_nac.setText(user.getNacimiento()+"");
        txtpais.setText(user.getPais());
        txtcomunidad_autonoma.setText(user.getComunidadAutonoma());
        txtprovincia.setText(user.getProvincia());
        txtciudad.setText(user.getCiudad());
        txtdomicilio.setText(user.getDomicilio());
        use=user;
        
        
    }
    private void ponLaAyuda() 
    {
        try 
        {
            // Carga el fichero de ayuda
            java.io.File fichero = new java.io.File("help"+java.io.File.separator+"help_set.hs");
            java.net.URL hsURL = fichero.toURI().toURL();
            
            //ClassLoader cl = Examen20171122.class.getClassLoader();
            //java.net.URL hsURL = HelpSet.findHelpSet(cl,"help\\help_set.hs");
            
            //HelpSet hs = new HelpSet(null, hsURL);

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Pone ayuda a item de menu al pulsarlo y a F1 en ventana
            // principal y secundaria.
            hb.enableHelpKey(getRootPane(),"ventana_principal",helpset);
            
            
            //hb.enableHelpOnButton(jButton2, "ventana_secundaria", helpset);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(ModificarUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarUsu dialog = new ModificarUsu(new javax.swing.JFrame(), true);
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
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private Usuario use;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox checkAdmin;
    private javax.swing.JLabel ciudad;
    private javax.swing.JLabel comunidad_auto;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel domicilio;
    private javax.swing.JLabel fech_nac;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nom_usu;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel pais;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel provincia;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel tlf;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcomunidad_autonoma;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdomicilio;
    private javax.swing.JTextField txtfech_nac;
    private javax.swing.JTextField txtnom_usu;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtprovincia;
    private javax.swing.JTextField txtsexo;
    private javax.swing.JTextField txttlf;
    // End of variables declaration//GEN-END:variables
}
