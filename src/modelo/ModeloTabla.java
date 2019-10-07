/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivan9
 */
public class ModeloTabla extends DefaultTableModel{
    public boolean isCellEditable(int row,int columm){
        return false;
    }
}
