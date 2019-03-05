/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author tux
 */
public class Libro extends Publicacion implements Prestable {
  boolean prestado;
  
  public Libro (int codigoIn, String tituloIn, int anioIn){
    super(codigoIn,tituloIn,anioIn);
    this.prestado = false;
  }
  
  @Override
  public String toString() {
    String salida = "LIBRO:\n";
    salida += super.toString();
    salida += "¿Prestado? -> ";
    if (this.prestado) {
      salida += "PRESTADO";
    } else {
      salida += "EN BLIBLIOTECA";
    }
    salida +="\n";
    return salida;
  }
  
  public void prestar(){
    this.prestado = true;
  }
  
  public void devolver(){
    this.prestado = false;
  }
  
  public boolean prestado(){
    return this.prestado;
  }
  
}
