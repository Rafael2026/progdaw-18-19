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
public class Elemento {
  private String producto;
  private float precio;
  private int cantidad;
  
  public Elemento (String productoIn, float precioIn, int cantidadIn) {
    this.producto = productoIn;
    this.precio = precioIn;
    this.cantidad = cantidadIn;
  }
  
  public String toString() {
    String salida;
    salida = this.producto;
    salida += " PVP: " + this.precio;
    salida += " Cantidad: " + this.cantidad;
    salida += " Subtotal: "+ String.format("%.2f",this.precio*this.cantidad);
    return salida;
  }
  
  public float getSubtotal() {
    return (this.precio*this.cantidad);
  }
}
