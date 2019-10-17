/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import static Controladores.Controlador.flujoObjEntrada;
import static Controladores.Controlador.flujoObjSalida;
import static Controladores.MainFlujo.usu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelos.Alquiler;
import Modelos.Protocolo;
import static Modelos.Protocolo.ACTUALIZAR_ALQUILER;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Iván
 */
public class GestionAlquiler {

    public LocalTime[] horas_inicios = new LocalTime[14];
    public LocalTime[] horas_finales = new LocalTime[14];
    public ArrayList<LocalTime> horasOcupadas = new ArrayList<>();
    public LocalDate ahora = LocalDate.now();
    public LocalDate tomorrow = ahora.plus(1, ChronoUnit.DAYS);
    DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;

    public void cargarHorasDelDia() {
        int hora = 9;
        for (int i = 0; i < 14; i++) {
            if (hora < 10) {
                horas_inicios[i] = LocalTime.parse("0" + hora + ":00", formatter);
                hora++;
                horas_finales[i] = LocalTime.parse(hora + ":00", formatter);
            } else {
                horas_inicios[i] = LocalTime.parse(hora + ":00", formatter);
                hora++;
                horas_finales[i] = LocalTime.parse(hora + ":00", formatter);
            }
        }
    }

    public ArrayList<Alquiler> gestionListarAlquileres() {
        ArrayList<Alquiler> alquiRecibido = null;
        ArrayList<Alquiler> alquileres = new ArrayList<>();
        try {
            flujoObjSalida.writeUTF(Protocolo.LISTAR_ALQUILERES);
            flujoObjSalida.writeObject(alquiRecibido);
            alquiRecibido = (ArrayList<Alquiler>) flujoObjEntrada.readObject();
            for (int i = 0; i < alquiRecibido.size(); i++) {
                if (alquiRecibido.get(i).getDia().equals(ahora) || alquiRecibido.get(i).getDia().equals(tomorrow)) {
                    alquileres.add(alquiRecibido.get(i));//Añadimos el alquiler del dia de hoy y de mañana que son los que se pueden contratar.
                    for (int j = 0; j < horas_inicios.length; j++) {
                        if (alquiRecibido.get(i).horaInicio.equals(horas_inicios[j])) {
                            horasOcupadas.add(horas_inicios[j]);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error al obtener la clase al listar");
        } catch (IOException e) {
            System.out.println("Error de SQL al listar");
        }
        return alquileres;
    }

    public void gestionInsertarAlquiler(Alquiler alqui) {
        try {
            flujoObjSalida.writeUTF(Protocolo.INSERTAR_ALQUILER);
            flujoObjSalida.writeObject(usu);
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

    public void gestionBorrarAlquiler(int id) {
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

    public void gestionActualizarAlquiler(Alquiler alqui) {
        try {
            flujoObjSalida.writeUTF(ACTUALIZAR_ALQUILER);
            flujoObjSalida.writeObject(alqui);
            flujoObjSalida.writeObject(alqui.getId());
            boolean actualizado = flujoObjEntrada.readBoolean();
            if (actualizado) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha actualizado");
            }
        } catch (IOException ex) {
            Logger.getLogger(GestionAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
