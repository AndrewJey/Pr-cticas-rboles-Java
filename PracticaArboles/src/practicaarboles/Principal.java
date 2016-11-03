/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarboles;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Logic.ArbolBinario a= new Logic.ArbolBinario();
        a.insertarArbol(Integer.parseInt(JOptionPane.showInputDialog("")),null);
        a.insertarArbol(Integer.parseInt(JOptionPane.showInputDialog("")),null);
        a.insertarArbol(Integer.parseInt(JOptionPane.showInputDialog("")),null);
        a.insertarArbol(Integer.parseInt(JOptionPane.showInputDialog("")),null);
        a.insertarArbol(Integer.parseInt(JOptionPane.showInputDialog("")),null);
        System.out.println("Hijos Izquierdos");
        a.reccorrer_en_orden(a.raiz.hijoIzquierdo);
        System.out.println(" ");
        System.out.println("Hijos Derechos");
        a.reccorrer_en_orden(a.raiz.hijoDerecho);
        System.out.println(" ");
        System.out.println("Raiz");
        a.reccorrer_en_orden(a.raiz);
        System.out.println(" ");
    }   
}