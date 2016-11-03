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
public class ArbolBinario {
  public Nodo raiz;
public ArbolBinario(){
    raiz=null;
    }
public void insertarArbol(int llave,Object valor){
        Nodo newNodo = new Nodo(llave);
        newNodo.valor = valor;
        if(raiz == null){
            raiz=newNodo;
        }else{
            Nodo temporal = raiz;
            while(temporal != null){
                newNodo.padre=temporal;
                if(newNodo.llave >= temporal.llave){
                temporal = temporal.hijoDerecho;
                }else{
                    temporal = temporal.hijoIzquierdo;
                }
            }
            if(newNodo.llave < newNodo.padre.llave){
                newNodo.padre.hijoIzquierdo = newNodo;
            }else{
            newNodo.padre.hijoDerecho = newNodo;
            }
        }
    }
    public void reccorrer_en_orden(Nodo x){
        if(x != null){
            reccorrer_en_orden(x.hijoIzquierdo);
            System.out.print(x.llave);
            reccorrer_en_orden(x.hijoDerecho);
        }
    }
}

