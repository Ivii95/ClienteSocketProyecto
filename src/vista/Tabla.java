/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import controlador.GestionUsuario;
import controlador.UtilidadesPantalla;
import modelo.*;

import java.io.File;
import java.util.ArrayList;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prueba
 */
public class Tabla extends javax.swing.JFrame implements Protocolo {

    /**
     * Creates new form Tabla
     */
    public Tabla(java.awt.Frame parent, boolean modal) {
        initComponents();
        UtilidadesPantalla.resolucionPantalla(this);
        ponLaAyuda();
        modeloTabla=(DefaultTableModel) tblPrinci.getModel();
        cargarTodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrinci = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        Informe = new javax.swing.JButton();
        brnReserva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setForeground(new java.awt.Color(204, 255, 204));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setFocusable(false);
        jScrollPane1.setFont(new java.awt.Font("Laksaman", 1, 12)); // NOI18N

        tblPrinci.setBackground(new java.awt.Color(204, 255, 204));
        tblPrinci.setBorder(new javax.swing.border.MatteBorder(null));
        tblPrinci.setForeground(new java.awt.Color(0, 0, 0));
        tblPrinci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Usuario", "Domicilio", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrinci.setGridColor(new java.awt.Color(51, 51, 51));
        tblPrinci.setSelectionForeground(new java.awt.Color(51, 255, 255));
        jScrollPane1.setViewportView(tblPrinci);
        if (tblPrinci.getColumnModel().getColumnCount() > 0) {
            tblPrinci.getColumnModel().getColumn(0).setMinWidth(0);
            tblPrinci.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblPrinci.getColumnModel().getColumn(0).setMaxWidth(0);
            tblPrinci.getColumnModel().getColumn(1).setResizable(false);
            tblPrinci.getColumnModel().getColumn(2).setResizable(false);
            tblPrinci.getColumnModel().getColumn(3).setResizable(false);
            tblPrinci.getColumnModel().getColumn(4).setResizable(false);
            tblPrinci.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        Titulo.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(102, 102, 102));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Administrador de usuarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        btnInsertar.setBackground(new java.awt.Color(255, 255, 204));
        btnInsertar.setFont(new java.awt.Font("Laksaman", 1, 12)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/añadir.png"))); // NOI18N
        btnInsertar.setText(" Insertar usuario");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 255, 204));
        btnBorrar.setFont(new java.awt.Font("Laksaman", 1, 12)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 255, 204));
        btnModificar.setFont(new java.awt.Font("Laksaman", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setMaximumSize(new java.awt.Dimension(120, 40));
        btnModificar.setMinimumSize(new java.awt.Dimension(120, 40));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAyuda.setBackground(new java.awt.Color(255, 255, 204));
        btnAyuda.setText("Ayuda");

        Informe.setBackground(new java.awt.Color(255, 255, 204));
        Informe.setText("Generar Informe");
        Informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformeActionPerformed(evt);
            }
        });

        brnReserva.setText("Añadir reserva");
        brnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(brnReserva)
                .addGap(31, 31, 31)
                .addComponent(Informe)
                .addGap(18, 18, 18)
                .addComponent(btnAyuda)
                .addContainerGap(514, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnInsertar)
                    .addGap(18, 18, 18)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnBorrar)
                    .addContainerGap(981, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brnReserva)
                    .addComponent(Informe)
                    .addComponent(btnAyuda))
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInsertar)
                        .addComponent(btnBorrar)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(45, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        Formulario f = new Formulario(this, true);
        f.setVisible(true);
        usu = f.getUsuario();
        GU.gestionInsertarUsuario(usu);
        agregarFila(usu);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(recogerIdFila()!= -1){
            ModificarUsu mf=new ModificarUsu(null,true);
            int idusu=recogerIdFila();
            Usuario usu=null;
            for (int i = 0; i < Usuarios.size(); i++) {
                if(Usuarios.get(i).getId()==idusu){
                    usu=Usuarios.get(i);
                }
            }
            mf.setUsuario(usu);
            mf.setVisible(rootPaneCheckingEnabled);
            usu=mf.getUsuario();
            GU.gestionActualizarUsuario(usu);
            borrarTodo();
            cargarTodo();
        }else{
            JOptionPane.showMessageDialog(this, "Tienes que seleccionar un usuario", "IMPORTANTE", HEIGHT);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int id = recogerIdFila();
        GU.gestionBorrarUsuario(id);
        modeloTabla.removeRow(recogerFila());
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void InformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformeActionPerformed
        startReport();
    }//GEN-LAST:event_InformeActionPerformed

    private void brnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnReservaActionPerformed
        Usuario usuarioRecogido=recogerFilaEntera(tblPrinci.getSelectedRow());
        ReservarPista RP=new ReservarPista();
        RP.usu=usuarioRecogido;
        RP.setVisible(true);
    }//GEN-LAST:event_brnReservaActionPerformed
    /**
     * @param args the command line arguments
     */
    private void agregarFila(Usuario u) {
        modeloTabla.addRow(new Object[]{u.getId(),
            u.getNombre(),
            u.getApellidos(),
            u.getUsuario(),
            u.getDomicilio(),
            u.getTlf()});
    }

    private Usuario recogerFilaEntera(int i) {
        Usuario u = new Usuario();
        u.setId((int) modeloTabla.getValueAt(i, 1));
        u.setNombre((String) modeloTabla.getValueAt(i, 2));
        u.setApellidos((String) modeloTabla.getValueAt(i, 3));
        u.setUsuario((String) modeloTabla.getValueAt(i, 4));
        u.setContrasena((String) modeloTabla.getValueAt(i, 5));
        u.setTlf((int) modeloTabla.getValueAt(i, 6));

        /*u.setCorreoRecuperacion((String) modeloTabla.getValueAt(i, 2));
        u.setSexo((String) modeloTabla.getValueAt(i, 5));
        u.setNacimiento((String) modeloTabla.getValueAt(i, 6));
        u.setPais((String) modeloTabla.getValueAt(i, 7));
        u.setCiudad((String) modeloTabla.getValueAt(i, 8));
        u.setDomicilio((String) modeloTabla.getValueAt(i, 9));*/
        return u;
    }

    private int recogerIdFila() {
        int Id = ((int) modeloTabla.getValueAt(tblPrinci.getSelectedRow(), 0));
        return Id;
    }

    private int recogerFila() {
        int Id = (int) tblPrinci.getSelectedRow();
        /*u.setCorreoRecuperacion((String) modeloTabla.getValueAt(i, 2));
        u.setSexo((String) modeloTabla.getValueAt(i, 5));
        u.setNacimiento((String) modeloTabla.getValueAt(i, 6));
        u.setPais((String) modeloTabla.getValueAt(i, 7));
        u.setCiudad((String) modeloTabla.getValueAt(i, 8));
        u.setDomicilio((String) modeloTabla.getValueAt(i, 9));*/
        return Id;
    }

    private void ponLaAyuda() {
        try {
            // Carga el fichero de ayuda
            java.net.URL hsURL=UtilidadesPantalla.obtenerUrlAyuda();

            //ClassLoader cl = Examen20171122.class.getClassLoader();
            //java.net.URL hsURL = HelpSet.findHelpSet(cl,"help\\help_set.hs");
            //HelpSet hs = new HelpSet(null, hsURL);
            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Pone ayuda a item de menu al pulsarlo y a F1 en ventana
            hb.enableHelpOnButton(btnAyuda, "tabla", helpset);
            hb.enableHelpKey(getRootPane(), "tabla", helpset);
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tabla dialog = new Tabla(new javax.swing.JFrame(), true);
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
    GestionUsuario GU=new GestionUsuario();
    File f;
    ArrayList<Usuario> Usuarios;
    DefaultTableModel modeloTabla;
    boolean userOn = false;
    private boolean salir = false;
    public static Usuario usu;
    public static String usuario = "";
    public static String pass = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Informe;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton brnReserva;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPrinci;
    // End of variables declaration//GEN-END:variables
    private void borrarTodo() {
        modeloTabla.setRowCount(0);
    }
    private void cargarTodo() {
        try{
        Usuarios=GU.gestionListarUsuarios();
        for (int i = 0; i < Usuarios.size(); i++) {
            Usuario usu=Usuarios.get(i);
            agregarFila(usu);
        }
        }catch(Exception e){
            System.out.println("Error al cargar la tabla");
        }
    }
    public void startReport() {
        /*
        try{
            JasperReport reporte;
            String path = "lib"+File.separator+"UsuariosPadel.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null,conexion);
            JasperViewer viewer = new JasperViewer(jprint,false);
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            viewer.setVisible(true);
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
         */
    }
}
