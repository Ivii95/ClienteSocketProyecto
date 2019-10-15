/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelos.Alquiler;
import Modelos.Pista;
import Modelos.Usuario;

/**
 *
 * @author DAM2
 */
public class ReservarPista extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public ReservarPista() {
        initComponents();
        iniciarModelos();
        iniciarOtrosComponentes();
        setLocationRelativeTo(null);
    }

    public void iniciarModelos() {
        
        modeloReservaPista1 = new DefaultTableModel(new Object[][]{}, new String[]{
            "Dia", "Hora Inicio", "Hora Final"}) {
            Class[] types = new Class[]{java.lang.String.class, java.lang.String.class, java.lang.String.class};
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        modeloHechaPista1 =new DefaultTableModel(new Object[][]{}, new String[]{
            "Dia", "Hora Inicio", "Hora Final"}) {
            Class[] types = new Class[]{java.lang.String.class, java.lang.String.class, java.lang.String.class};
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        modeloReservaPista2 =new DefaultTableModel(new Object[][]{}, new String[]{
            "Dia", "Hora Inicio", "Hora Final"}) {
            Class[] types = new Class[]{java.lang.String.class, java.lang.String.class, java.lang.String.class};
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        modeloHechaPista2 = new DefaultTableModel(new Object[][]{}, new String[]{
            "Dia", "Hora Inicio", "Hora Final"}) {
            Class[] types = new Class[]{java.lang.String.class, java.lang.String.class, java.lang.String.class};
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        modeloReservaPista3 = new DefaultTableModel(new Object[][]{}, new String[]{
            "Dia", "Hora Inicio", "Hora Final"}) {
            Class[] types = new Class[]{java.lang.String.class, java.lang.String.class, java.lang.String.class};
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        modeloHechaPista3 = new DefaultTableModel(new Object[][]{}, new String[]{
            "Dia", "Hora Inicio", "Hora Final"}) {
            Class[] types = new Class[]{java.lang.String.class, java.lang.String.class, java.lang.String.class};
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }

    private void iniciarOtrosComponentes() {
        ahora = LocalDate.now();
        tomorrow = ahora.plus(1, ChronoUnit.DAYS);
        //ponLaAyuda();
        
        String[] horas_inicios = new String[14];
        String[] horas_finales = new String[14];
        int hora = 9;
        for (int i = 0; i < 14; i++) {
            horas_inicios[i] = hora + ":00";
            hora++;
            horas_finales[i] = hora + ":00";
            modeloReservaPista1.addRow(new Object[]{ahora, horas_inicios[i], horas_finales[i]});
            modeloReservaPista2.addRow(new Object[]{ahora, horas_inicios[i], horas_finales[i]});
            modeloReservaPista3.addRow(new Object[]{ahora, horas_inicios[i], horas_finales[i]});
        }
        for (int i = 0; i < 14; i++) {
            modeloReservaPista1.addRow(new Object[]{tomorrow, horas_inicios[i], horas_finales[i]});
            modeloReservaPista2.addRow(new Object[]{tomorrow, horas_inicios[i], horas_finales[i]});
            modeloReservaPista3.addRow(new Object[]{tomorrow, horas_inicios[i], horas_finales[i]});
        }
        tblReserva.setModel(modeloReservaPista1);
        tblHecha.setModel(modeloHechaPista1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        labelHeader1 = new org.edisoncor.gui.label.LabelHeader();
        jPanel1 = new javax.swing.JPanel();
        btnPista1 = new org.edisoncor.gui.button.ButtonIcon();
        btnPista2 = new org.edisoncor.gui.button.ButtonIcon();
        btnPista3 = new org.edisoncor.gui.button.ButtonIcon();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReserva = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHecha = new javax.swing.JTable();
        btnFlechaIzq = new org.edisoncor.gui.button.ButtonIcon();
        btnFlechaDch = new org.edisoncor.gui.button.ButtonIcon();
        txtNombre = new javax.swing.JLabel();
        txtTusReservas = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(1360, 762));
        setMinimumSize(new java.awt.Dimension(1360, 762));
        setPreferredSize(new java.awt.Dimension(1360, 762));
        setResizable(false);
        setSize(new java.awt.Dimension(1360, 762));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHeader1.setText("Reserva tu pista");
        labelHeader1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addComponent(labelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 1360, -1));

        btnPista1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pistaPadelModularVerde.jpg"))); // NOI18N
        btnPista1.setText("buttonIcon1");
        btnPista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPista1ActionPerformed(evt);
            }
        });

        btnPista2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pistaPadelModularVerde.jpg"))); // NOI18N
        btnPista2.setText("buttonIcon2");
        btnPista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPista2ActionPerformed(evt);
            }
        });

        btnPista3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pistaPadelModularVerde.jpg"))); // NOI18N
        btnPista3.setText("buttonIcon3");
        btnPista3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPista3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pista 1");

        jLabel2.setText("Pista 2");

        jLabel3.setText("Pista 3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPista1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPista3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPista2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel3)))
                .addContainerGap(922, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPista2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPista3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPista1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 90, 1360, 110));

        tblReserva.setBackground(new java.awt.Color(204, 255, 204));
        tblReserva.setForeground(new java.awt.Color(102, 102, 102));
        tblReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Hora Inicio", "Hora Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReserva.setRowSelectionAllowed(false);
        tblReserva.setSelectionForeground(new java.awt.Color(102, 255, 255));
        jScrollPane1.setViewportView(tblReserva);
        if (tblReserva.getColumnModel().getColumnCount() > 0) {
            tblReserva.getColumnModel().getColumn(0).setResizable(false);
            tblReserva.getColumnModel().getColumn(1).setResizable(false);
            tblReserva.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 690, 460));

        tblHecha.setBackground(new java.awt.Color(204, 255, 204));
        tblHecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Hora Inicio", "Hora Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHecha.setRequestFocusEnabled(false);
        tblHecha.setSelectionForeground(new java.awt.Color(102, 255, 255));
        jScrollPane2.setViewportView(tblHecha);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 590, 250));

        btnFlechaIzq.setBackground(new java.awt.Color(102, 102, 102));
        btnFlechaIzq.setForeground(new java.awt.Color(102, 102, 102));
        btnFlechaIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/izquierda.png"))); // NOI18N
        btnFlechaIzq.setText("buttonIcon4");
        btnFlechaIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlechaIzqActionPerformed(evt);
            }
        });
        getContentPane().add(btnFlechaIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 720, 40, 30));

        btnFlechaDch.setBackground(new java.awt.Color(102, 102, 102));
        btnFlechaDch.setForeground(new java.awt.Color(102, 102, 102));
        btnFlechaDch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/derecha.png"))); // NOI18N
        btnFlechaDch.setText("buttonIcon4");
        btnFlechaDch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFlechaDchActionPerformed(evt);
            }
        });
        getContentPane().add(btnFlechaDch, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 40, 30));

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.setText("Nombre: ");
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, -1, -1));

        txtTusReservas.setBackground(new java.awt.Color(51, 51, 51));
        txtTusReservas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTusReservas.setForeground(new java.awt.Color(51, 51, 51));
        txtTusReservas.setText("Tus reservas:");
        getContentPane().add(txtTusReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, -1, -1));

        btnAyuda.setText("Ayuda");
        getContentPane().add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 200, 70, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fondo.jpg"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(1360, 762));
        Fondo.setMinimumSize(new java.awt.Dimension(1360, 762));
        Fondo.setPreferredSize(new java.awt.Dimension(1360, 762));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPista1ActionPerformed
        tblReserva.setModel(modeloReservaPista1);
        tblHecha.setModel(modeloHechaPista1);
    }//GEN-LAST:event_btnPista1ActionPerformed

    private void btnPista3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPista3ActionPerformed
        tblReserva.setModel(modeloReservaPista3);
        tblHecha.setModel(modeloHechaPista3);
    }//GEN-LAST:event_btnPista3ActionPerformed

    private void btnPista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPista2ActionPerformed
        tblReserva.setModel(modeloReservaPista2);
        tblHecha.setModel(modeloHechaPista2);
    }//GEN-LAST:event_btnPista2ActionPerformed

    private void btnFlechaIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlechaIzqActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de que quiere borarr la pista a esta hora?", "Alquiler", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            DefaultTableModel modelo = (DefaultTableModel) tblReserva.getModel();
            DefaultTableModel modelohecha = (DefaultTableModel) tblHecha.getModel();
            int selec = tblHecha.getSelectedRow();
            modelo.addRow(new Object[]{modelo.getValueAt(selec, 0), modelo.getValueAt(selec, 1), modelo.getValueAt(selec, 2)});
            modelohecha.removeRow(selec);
            txtNombre.setText("Nombre" + usu.getNombre() + " " + usu.getApellidos());
        }
    }//GEN-LAST:event_btnFlechaIzqActionPerformed

    private void btnFlechaDchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFlechaDchActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de que quiere alquilar la pista a esta hora?", "Alquiler", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            DefaultTableModel modelo = (DefaultTableModel) tblReserva.getModel();
            DefaultTableModel modelohecha = (DefaultTableModel) tblHecha.getModel();
            int selec = tblReserva.getSelectedRow();
            modelohecha.addRow(new Object[]{modelo.getValueAt(selec, 0), modelo.getValueAt(selec, 1), modelo.getValueAt(selec, 2)});
            modelo.removeRow(selec);
            txtNombre.setText("Nombre" + usu.getNombre() + " " + usu.getApellidos());
        }
    }//GEN-LAST:event_btnFlechaDchActionPerformed

    /*private void ponLaAyuda() 
    {
        try 
        {
            // Carga el fichero de ayuda
            java.io.File fichero = new java.io.File("lib"+File.separator+"help"+java.io.File.separator+"help_set.hs");
            java.net.URL hsURL = fichero.toURI().toURL();
            
            //ClassLoader cl = Examen20171122.class.getClassLoader();
            //java.net.URL hsURL = HelpSet.findHelpSet(cl,"help\\help_set.hs");
            
            //HelpSet hs = new HelpSet(null, hsURL);

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Pone ayuda a item de menu al pulsarlo y a F1 en ventana
            // principal y secundaria.
            hb.enableHelpOnButton(btnAyuda, "Proyecto", helpset);
            hb.enableHelpKey(getRootPane(),"Proyecto",helpset);
            
            
            //hb.enableHelpOnButton(jButton2, "ventana_secundaria", helpset);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }*/
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ReservarPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservarPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservarPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservarPista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservarPista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton btnAyuda;
    private org.edisoncor.gui.button.ButtonIcon btnFlechaDch;
    private org.edisoncor.gui.button.ButtonIcon btnFlechaIzq;
    private org.edisoncor.gui.button.ButtonIcon btnPista1;
    private org.edisoncor.gui.button.ButtonIcon btnPista2;
    private org.edisoncor.gui.button.ButtonIcon btnPista3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.edisoncor.gui.label.LabelHeader labelHeader1;
    private javax.swing.JTable tblHecha;
    private javax.swing.JTable tblReserva;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTusReservas;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel modeloReservaPista1;
    DefaultTableModel modeloReservaPista2;
    DefaultTableModel modeloReservaPista3;
    DefaultTableModel modeloHechaPista1;
    DefaultTableModel modeloHechaPista2;
    DefaultTableModel modeloHechaPista3;
    LocalDate ahora;
    LocalDate tomorrow;
    Usuario usu;

}
