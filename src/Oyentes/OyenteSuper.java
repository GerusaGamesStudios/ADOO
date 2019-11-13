/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyentes;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author gerusagames
 */
public class OyenteSuper implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click");
    }
    
    public void registrarBotonNuevo(JButton b){
        System.out.println("BotonRegistrado");
        b.addActionListener(this);
    }
    public ArrayList<JTextField> obtenerTodosLosTextFields(JFrame j){
        Component[] comp = j.getContentPane().getComponents();
        ArrayList<JTextField> tf = new ArrayList<>();
        for(Component c : comp){
            if(c instanceof JTextField){
                tf.add((JTextField) c);
            }
        }
        return tf;
    }
    
    public void registrarTodosLosBotonesDelFrame(JFrame j){
        Component[] components = j.getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JButton) {
                this.registrarBotonNuevo((JButton) component);
            }
        }
    }
}
