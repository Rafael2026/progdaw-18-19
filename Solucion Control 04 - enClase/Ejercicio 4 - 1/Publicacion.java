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
public abstract class Publicacion {
  private int codigo;
  private String titulo;
  private int anio;
  
  public Publicacion (int codigoIn, String tituloIn, int anioIn) {
    this.codigo = codigoIn;
    this.titulo = tituloIn;
    this.anio = anioIn;
  }
  
  public String toString (){
    String salida = "";
    salida += "Código: " + this.codigo +"\n";
    salida += "Título: " + this.titulo +"\n";
    salida += "Año de publicación: " + this.anio +"\n";    
    return salida;
  }
  
  public int getCodigo () {
    return this.codigo;
  }
  
  public int getAnioPublicacion () {
    return this.anio;
  }
}
