/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static controlador.Controlador.flujoObjEntrada;
import static controlador.Controlador.flujoObjSalida;
import static controlador.Controlador.usu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static modelo.Protocolo.ACTUALIZAR_USUARIO;
import static modelo.Protocolo.BORRAR_USUARIO;
import static modelo.Protocolo.INSERTAR_USUARIO;
import static modelo.Protocolo.LISTAR_USUARIOS;
import modelo.Usuario;

/**
 *
 * @author Iván
 */
public class GestionUsuario {
    public ArrayList<Usuario> gestionListarUsuarios() {
		ArrayList<Usuario> usus=null;
		try {
                    
                    flujoObjSalida.writeUTF(LISTAR_USUARIOS);
                    flujoObjSalida.writeObject(usu);
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
			JOptionPane.showMessageDialog(null,"Se ha insertado");
		} else {
			JOptionPane.showMessageDialog(null,"No se ha insertado");
		}
        } catch (IOException ex) {
            
        }
        
        //gestionListarMetas();
    }
    public void gestionBorrarUsuario(int id) {
        try {
            flujoObjSalida.writeUTF(BORRAR_USUARIO);
            flujoObjSalida.writeObject(id);
		
		if (flujoObjEntrada.readBoolean()) {
			JOptionPane.showMessageDialog(null,"Se ha borrado");
		} else {
			JOptionPane.showMessageDialog(null,"No se ha borrado");
		}
        } catch (IOException e) {
            
        }
        //gestionListarMetas();
    }
    public void gestionActualizarUsuario(Usuario usu){
        try {
            flujoObjSalida.writeUTF(ACTUALIZAR_USUARIO);
            flujoObjSalida.writeObject(usu);
            flujoObjSalida.writeObject(usu.getId());
            boolean actualizado = flujoObjEntrada.readBoolean();
            if (actualizado) {
			JOptionPane.showMessageDialog(null,"Se ha actualizado");
		} else {
			JOptionPane.showMessageDialog(null,"No se ha actualizado");
		}
        } catch (IOException ex) {
            Logger.getLogger(GestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
