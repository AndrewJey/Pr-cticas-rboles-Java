/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author estudiante
 */
public class Nodo {
  public Nodo padre;//Nodo padre
  public Nodo hijoDerecho;
  public Nodo hijoIzquierdo;
  public int llave;
  public Object valor;

    public Nodo(int llave) {
        this.llave=llave;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
        this.padre=null;
        this.valor=null;
    } 
}