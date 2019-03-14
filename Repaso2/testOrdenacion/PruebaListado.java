/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOrdenacion;

/**
 *
 * @author tux
 */
public class PruebaListado {
  public static void main (String[] args) {
    Listado miListado = new Listado();
    
    miListado.aniadir(new Persona("2","Persona2"));
    miListado.aniadir(new Persona("1","Persona1"));
    miListado.aniadir(new Persona("4","Persona4"));
    miListado.aniadir(new Persona("3","Persona3"));
    
    System.out.println(miListado);
    
    miListado.ordenar();
    
    System.out.println(miListado);
    
  }
}
