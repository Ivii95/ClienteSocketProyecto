/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    private static final char[] CONSTS_HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String encriptaEnMD5(String stringAEncriptar) {
        try {
            MessageDigest msgd = MessageDigest.getInstance("MD5");
            byte[] bytes = msgd.digest(stringAEncriptar.getBytes());
            StringBuilder strbCadenaMD5 = new StringBuilder(2 * bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                int bajo = (int) (bytes[i] & 0x0f);
                int alto = (int) ((bytes[i] & 0xf0) >> 4);
                strbCadenaMD5.append(CONSTS_HEX[alto]);
                strbCadenaMD5.append(CONSTS_HEX[bajo]);
            }
            return strbCadenaMD5.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
