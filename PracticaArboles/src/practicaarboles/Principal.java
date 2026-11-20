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
        Logic.ArbolBinario arbol = new Logic.ArbolBinario();
        if (args.length > 0) {
            try { for (String valor : args) arbol.insertarArbol(Integer.parseInt(valor), null); }
            catch (NumberFormatException error) { System.err.println("Usa argumentos enteros."); return; }
        } else {
            for (int i = 0; i < 5;) {
                String valor = JOptionPane.showInputDialog("Número " + (i + 1) + " de 5 (Cancelar para salir)");
                if (valor == null) return;
                try { arbol.insertarArbol(Integer.parseInt(valor.trim()), null); i++; }
                catch (NumberFormatException error) { JOptionPane.showMessageDialog(null, "Ingresa un entero válido."); }
            }
        }
        System.out.println("Recorrido ordenado:");
        arbol.reccorrer_en_orden(arbol.raiz);
        System.out.println();
    }   
}