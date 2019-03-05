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
public class Revista extends Publicacion {
  private int numero;
  
  public Revista (int codigoIn, String tituloIn, int anioIn, int numeroIn){
    super(codigoIn,tituloIn,anioIn);
    this.numero = numeroIn;
  }
  
  @Override
  public String toString(){
    String salida = "REVISTA:\n";
    salida += super.toString();
    salida += "Número: "+this.numero+"\n";
    return salida;
  }
  
}
