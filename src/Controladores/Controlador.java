/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import static Controladores.MainFlujo.userOn;
import static Controladores.MainFlujo.usu;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;
import Modelos.Protocolo;
import Modelos.Usuario;
import Vistas.Login;

/**
 * @author Ivii
 */
public class Controlador implements Protocolo {

    static Socket skCliente;
    private boolean salir = false;
    public  String usuario = "";
    public  String pass = "";
    public static ObjectInputStream flujoObjEntrada;
    public static ObjectOutputStream flujoObjSalida;
    public static DataInputStream flujo_entrada;
    public static DataOutputStream flujo_salida;

    public Controlador() {
    }

    public void inicializarConexiones() {
        try {
            skCliente = new Socket("localhost",5000);
            flujoObjSalida = new ObjectOutputStream(skCliente.getOutputStream());
            flujoObjEntrada = new ObjectInputStream(skCliente.getInputStream());
            flujo_entrada=new DataInputStream(skCliente.getInputStream());
            flujo_salida=new DataOutputStream(skCliente.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean gestionLOG() {
        try {
            Login lg = new Login(null, true);
            lg.setVisible(true);
            usuario = lg.getUser();
            pass = lg.getPass();
            flujo_salida.writeUTF(LOG);
            //Le envio el usuario
            flujo_salida.writeUTF(usuario);
            //Le envio la contraseña
            flujo_salida.writeUTF(pass);
            //Espero confirmacion y la guardo en userOn
            userOn = flujo_entrada.readBoolean();
            if (userOn) {
                usu = (Usuario) flujoObjEntrada.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void gestionSalir() {
        try {
            flujoObjSalida.writeUTF(SALIR);
            System.exit(0);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al salir");
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
