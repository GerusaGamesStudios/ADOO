/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyentes;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author gerusagames
 */
public class OyenteSuper implements ActionListener,ListSelectionListener{
    public void print(Object c){
        System.out.println(c);
    }
    //CUANDO SE HACE CLICK EN UN BOTON
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click");
    }
    //CUANDO SE SELECCIONA UN ELEMENTO DE LA LISTA
     @Override
    public void valueChanged(ListSelectionEvent e) {
        
    }
    
    
    
    
    
    
    //METODOS PARA REGISTRAR NUEVOS ELEMENTOS A ESTE OYENTE
    
    
    public void registrarBotonNuevo(JButton b){
        System.out.println("BotonRegistrado");
        b.addActionListener(this);
    }
    public JList getJlist(JFrame j){
        Component[] comp = j.getContentPane().getComponents();
        for(Component c:comp){
            if(c instanceof JList){
                return (JList) c;
            }
        }
        return null;
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
    public void registrarJList(JList j){
        j.addListSelectionListener(this);
    }
    public void registrarTodosLosJlist(JFrame j){
        Component[] components = j.getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JList) {
                ((JList) component).addListSelectionListener(this);
                System.out.println("Jlist registrado");
            }
        }
    }
    
}
