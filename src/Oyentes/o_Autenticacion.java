/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyentes;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author gerusagames
 */
public class o_Autenticacion extends OyenteSuper {
    //AL DAR CLICK A BOTON
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        String str = btn.getText();
        
        if(null != str)switch (str) {
            case "Registrar":
                print("Registrar presionado");
                
                break;
            case "Iniciar Sesión":
                print("Iniciar sesion  presionado");

                break;
            default:
                break;
        }
    }

}
