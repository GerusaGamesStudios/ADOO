/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyentes;

import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author gerusagames
 */
public class o_Menu  extends OyenteSuper{
    //VARIABLES LOCALES
    int selectedIndex = 0;
    
    //AL DAR CLICK A BOTON
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        String str = btn.getText();
        
        if(null != str)switch (str) {
            case "Añadir":
                print("añadir presionado");
                
                break;
            case "Eliminar":
                print("Eliminar presionado");

                break;
            case "Descripción":
                print("Descripción presionado");

                break;
            case "Ordenar Pedido":
                print("Ordenar Pedido Presionado");
                
                break;
            default:
                break;
        }
    }
    //AL SELECCIONAR ITEMS EN LA LISTA
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(!e.getValueIsAdjusting()){
            //IMPLEMENTAR
             JList list = (JList) e.getSource();
             selectedIndex = list.getSelectedIndex();
             print(selectedIndex);
           
        }
    }
}
