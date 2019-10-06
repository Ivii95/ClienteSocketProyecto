/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static controlador.Controlador.*;
import static controlador.MainFlujo.usu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Protocolo;
import modelo.Usuario;

/**
 *
 * @author Iván
 */
public class GestionUsuario implements Protocolo {

    public GestionUsuario() {

    }

    public Usuario getUsuario(int id) {
        Usuario usu=new Usuario();
        try {
            flujo_salida.writeUTF(LISTAR_USUARIO);
            flujo_salida.writeUTF(id+"");
            usu = (Usuario) flujoObjEntrada.readObject();

        } catch (ClassNotFoundException e) {
            System.out.println("Error al obtener la clase al listar");
        } catch (IOException e) {
            System.out.println("Error de SQL al listar");
        }
        return usu;
    }

    public ArrayList<Usuario> gestionListarUsuarios() {
        ArrayList<Usuario> usus = null;
        try {
            flujo_salida.writeUTF(LISTAR_USUARIOS);
            usus = (ArrayList<Usuario>) flujoObjEntrada.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("Error al obtener la clase al listar");
        } catch (IOException e) {
            System.out.println("Error de SQL al listar");
        }
        return usus;
    }

    public void gestionInsertarUsuario(Usuario usu) {
        try {
            flujoObjSalida.writeUTF(INSERTAR_USUARIO);
            flujoObjSalida.writeObject(usu);
            boolean insertado = flujoObjEntrada.readBoolean();
            if (insertado) {
                JOptionPane.showMessageDialog(null, "Se ha insertado");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha insertado");
            }
        } catch (IOException ex) {

        }
    }

    public void gestionBorrarUsuario(int id) {
        try {
            flujoObjSalida.writeUTF(BORRAR_USUARIO);
            flujoObjSalida.writeObject(id);

            if (flujoObjEntrada.readBoolean()) {
                JOptionPane.showMessageDialog(null, "Se ha borrado");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha borrado");
            }
        } catch (IOException e) {

        }
    }

    public void gestionActualizarUsuario(Usuario usu) {
        try {
            flujo_salida.writeUTF(ACTUALIZAR_USUARIO);
            JOptionPane.showMessageDialog(null, "Se ha actualizado1");
            flujoObjSalida.writeObject(usu);
            JOptionPane.showMessageDialog(null, "Se ha actualizado2");
            boolean actualizado = flujo_entrada.readBoolean();
            JOptionPane.showMessageDialog(null, "Se ha actualizado3");
            if (actualizado) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha actualizado");
            }
        } catch (IOException ex) {
            Logger.getLogger(GestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
