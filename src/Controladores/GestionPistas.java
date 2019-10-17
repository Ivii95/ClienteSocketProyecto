/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import static Controladores.Controlador.flujoObjEntrada;
import static Controladores.Controlador.flujoObjSalida;
import Modelos.Alquiler;
import Modelos.Pista;
import Modelos.Protocolo;
import static Modelos.Protocolo.ACTUALIZAR_ALQUILER;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DisenoWeb
 */
public class GestionPistas {

    ArrayList<Pista> pistas = new ArrayList<>();
    ArrayList<DefaultTableModel> modeloPistas = new ArrayList<>();
    ArrayList<DefaultTableModel> modeloPistasAlquiladas = new ArrayList<>();
    GestionAlquiler GA = new GestionAlquiler();

    public void crearPistas() {
        for (int i = 0; i < pistas.size(); i++) {

            modeloPistas.add(crearTabla());
            modeloPistasAlquiladas.add(crearTabla());
        }
    }

    public DefaultTableModel crearTabla() {
        return new DefaultTableModel(new Object[][]{}, new String[]{
            "Dia", "Hora Inicio", "Hora Final"}) {
            Class[] types = new Class[]{java.lang.String.class,
                java.lang.String.class,
                java.lang.String.class
            };
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

    public DefaultTableModel getModeloReserva(int tabla, ArrayList<Alquiler> alquileres) {
        modeloPistas.get(tabla + 1).addRow(new Object[]{"----------------- " + GA.ahora + " -----------------", "----------------- " + GA.ahora + " -----------------", "----------------- " + GA.ahora + " -----------------"});
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < alquileres.size(); j++) {
                if (!alquileres.get(j).horaInicio.equals(GA.horas_inicios[i])) {
                    modeloPistas.get(tabla + 1).addRow(new Object[]{GA.ahora, GA.horas_inicios[i], GA.horas_finales[i]});
                }
            }
        }
        modeloPistas.get(tabla + 1).addRow(new Object[]{"----------------- " + GA.ahora + " -----------------", "----------------- " + GA.ahora + " -----------------", "----------------- " + GA.ahora + " -----------------"});
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < alquileres.size(); j++) {
                if (!alquileres.get(j).horaInicio.equals(GA.horas_inicios[i])) {
                    modeloPistas.get(tabla + 1).addRow(new Object[]{GA.tomorrow, GA.horas_inicios[i], GA.horas_finales[i]});
                }
            }    
        }
        return modeloPistas.get(tabla + 1);
    }

    public DefaultTableModel getModeloReservaHecha(int tabla, ArrayList<Alquiler> alquileres) {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < alquileres.size(); j++) {
                if (alquileres.get(j).horaInicio.equals(GA.horas_inicios[i])) {
                    modeloPistasAlquiladas.get(tabla + 1).addRow(new Object[]{alquileres.get(j).dia, alquileres.get(j).horaInicio, alquileres.get(j).horaFin});
                }
            }
        }
        return modeloPistasAlquiladas.get(tabla + 1);
    }

    public ArrayList<Pista> gestionListarPistas() {

        try {
            flujoObjSalida.writeUTF(Protocolo.LISTAR_PISTAS);
            flujoObjSalida.writeObject(pistas);
            pistas = (ArrayList<Pista>) flujoObjEntrada.readObject();

        } catch (ClassNotFoundException e) {
            System.out.println("Error al obtener la clase al listar");
        } catch (IOException e) {
            System.out.println("Error de SQL al listar");
        }
        return pistas;
    }

    public void gestionInsertarPista(Pista pista) {
        try {
            flujoObjSalida.writeUTF(Protocolo.INSERTAR_ALQUILER);
            flujoObjSalida.writeObject(pista);
            boolean insertado = flujoObjEntrada.readBoolean();
            if (insertado) {
                JOptionPane.showMessageDialog(null, "Se ha insertado");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha insertado");
            }
        } catch (IOException ex) {

        }

        //gestionListarMetas();
    }

    public void gestionBorrarPista(int id) {
        try {
            flujoObjSalida.writeUTF(Protocolo.BORRAR_ALQUILER);
            flujoObjSalida.writeObject(id);

            if (flujoObjEntrada.readBoolean()) {
                JOptionPane.showMessageDialog(null, "Se ha borrado");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha borrado");
            }
        } catch (IOException e) {

        }
        //gestionListarMetas();
    }

    public void gestionActualizarPista(Pista pista) {
        try {
            flujoObjSalida.writeUTF(ACTUALIZAR_ALQUILER);
            flujoObjSalida.writeObject(pista);
            flujoObjSalida.writeObject(pista.getId());
            boolean actualizado = flujoObjEntrada.readBoolean();
            if (actualizado) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha actualizado");

            }
        } catch (IOException ex) {
            Logger.getLogger(GestionAlquiler.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }
}
