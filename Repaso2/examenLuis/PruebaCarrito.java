/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenLuis;

/**
 *
 * @author tux
 */
public class PruebaCarrito {
  public static void main(String[] args) {
    Carrito miCarro = new Carrito();
    Carrito carroDeDavid = new Carrito();
    
    miCarro.agrega(new Elemento("Sopa de pollo",(float)1.05,2));
    
    carroDeDavid.agrega(new Elemento("Sopa de pollo",(float)1.05,2));
    carroDeDavid.agrega(new Elemento("Sopa de pollo",(float)1.05,3));
    
    System.out.println(miCarro);
   
    
    System.out.print("Hay " + miCarro.numeroDeElementos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + miCarro.importeTotal() + " euros");
    
    System.out.println(carroDeDavid);
    
    System.out.print("Hay " + carroDeDavid.numeroDeElementos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + carroDeDavid.importeTotal() + " euros");
  }
}
