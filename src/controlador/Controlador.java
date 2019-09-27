/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;

/**
 * @author Ivii
 */
public class Controlador implements Protocolo{
    private static Socket skCliente;
    boolean userOn=false;
    private boolean salir=false;
    public static Usuario usu;
    public static String usuario="";
    public static String pass="";
    public static ObjectInputStream flujoObjEntrada;
    public static ObjectOutputStream flujoObjSalida;
    public Controlador(){
        inicializarConexiones();
        do{
            gestionLOG();
        } while (!userOn);
    }
    public void inicializarConexiones() {
		try {
			skCliente = new Socket("localhost",2000);
			flujoObjSalida = new ObjectOutputStream(skCliente.getOutputStream());
			flujoObjEntrada = new ObjectInputStream(skCliente.getInputStream());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public void gestionLOG(){
	try {
            Login lg=new Login(null, true);
            lg.setVisible(true);
		usuario=lg.getUser();
		pass=lg.getPass();
		
	flujoObjSalida.writeUTF(LOG);	
	//Le envio el usuario
        flujoObjSalida.writeUTF(usuario);
        //Le envio la contraseña
        flujoObjSalida.writeUTF(pass);
        //Espero confirmacion y la guardo en userOn
        userOn = flujoObjEntrada.readBoolean();
        if(userOn) {
			usu=(Usuario)flujoObjEntrada.readObject();
			JOptionPane.showMessageDialog(null, "Usuario logeado");	
        }
        } catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} 
    }
    public ArrayList<Usuario> gestionListarUsuarios() {
		ArrayList<Usuario> usus=null;
		try {
                    
                    flujoObjSalida.writeUTF(LISTAR_USUARIOS);
                    flujoObjSalida.writeObject(usu);
                    usus = (ArrayList<Usuario>) flujoObjEntrada.readObject();
                    
                } catch (ClassNotFoundException e) {
                        System.out.println("Error en al obtener la clase al listar");   
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
    public void gestionSalir() {
        try {
            flujoObjSalida.writeUTF(SALIR);
            System.exit(0);
	} catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error al salir");
        }
						
    }
    public void startReport(){
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

