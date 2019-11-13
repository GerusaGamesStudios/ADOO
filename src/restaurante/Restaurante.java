/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;
import Oyentes.*;
import views.*;
/**
 *
 * @author gerusagames
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        o_Menu oyenteMenu = new o_Menu();
        GUI_Menu menu = new GUI_Menu(oyenteMenu);
        menu.setVisible(true);
        System.out.println("hola");
    }
    
}
