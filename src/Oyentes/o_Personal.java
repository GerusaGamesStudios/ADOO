/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyentes;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import views.*;
/**
 *
 * @author gerusagames
 */
public class o_Personal extends OyenteSuper{
     //AL DAR CLICK A BOTON
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton)e.getSource();
        String str = btn.getText();
        
        if(null != str)switch (str) {
            case "Añadir Personal":
                print("añadir presionado");
                
                break;
            case "Visualizar Personal":
                print("Visualizar Presinado");
                GUI_VisualizarPersonal vp = new GUI_VisualizarPersonal(this);
                vp.setVisible(true);
                break;
            case "Eliminar":
                print("Eliminar");
                break;
            default:
                break;
        }
    }
}
