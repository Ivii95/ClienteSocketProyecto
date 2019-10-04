/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import static controlador.Controlador.flujoObjEntrada;
import static controlador.Controlador.flujoObjSalida;
import static controlador.MainFlujo.usu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Alquiler;
import modelo.Protocolo;
import static modelo.Protocolo.ACTUALIZAR_ALQUILER;

/**
 *
 * @author Iván
 */
public class GestionAlquiler {
    public ArrayList<Alquiler> gestionListarAlquileres() {
		ArrayList<Alquiler> alqui=null;
		try {
                    flujoObjSalida.writeUTF(Protocolo.LISTAR_ALQUILERES);
                    flujoObjSalida.writeObject(alqui);
                    alqui = (ArrayList<Alquiler>) flujoObjEntrada.readObject();
                    
                } catch (ClassNotFoundException e) {
                        System.out.println("Error al obtener la clase al listar");   
                } catch (IOException e) {
                        System.out.println("Error de SQL al listar");
		}
        return alqui;	
    }
    public void gestionInsertarAlquiler(Alquiler alqui) {
        try {
                flujoObjSalida.writeUTF(Protocolo.INSERTAR_ALQUILER);		
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
    public void gestionBorrarAlquiler(int id) {
        try {
            flujoObjSalida.writeUTF(Protocolo.BORRAR_ALQUILER);
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
    public void gestionActualizarAlquiler(Alquiler alqui){
        try {
            flujoObjSalida.writeUTF(ACTUALIZAR_ALQUILER);
            flujoObjSalida.writeObject(alqui);
            flujoObjSalida.writeObject(alqui.getId());
            boolean actualizado = flujoObjEntrada.readBoolean();
            if (actualizado) {
			JOptionPane.showMessageDialog(null,"Se ha actualizado");
		} else {
			JOptionPane.showMessageDialog(null,"No se ha actualizado");
		}
        } catch (IOException ex) {
            Logger.getLogger(GestionAlquiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
