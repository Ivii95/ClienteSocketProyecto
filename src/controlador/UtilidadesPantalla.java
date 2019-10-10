/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author DisenoWeb
 */
public class UtilidadesPantalla {

    public static void resolucionPantalla(JFrame aThis) {
        aThis.setLocationRelativeTo(null);
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        if (ancho < 1367 || alto < 769) {
            aThis.setExtendedState(JFrame.MAXIMIZED_BOTH);
            aThis.setUndecorated(true);
        }
    }

    public static URL obtenerUrlAyuda() {
        URL hsURL = null;
        try {
            File fichero = new java.io.File("lib" + File.separator + "help" + java.io.File.separator + "help.hs");
            hsURL = fichero.toURI().toURL();
        } catch (MalformedURLException ex) {
            Logger.getLogger(UtilidadesPantalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hsURL;
    }

}
