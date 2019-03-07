/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDudas;

/**
 *
 * @author tux
 */
public class MiEntero {
  private int valor;
  
  public MiEntero (int value){
    this.valor = value;
  }
  
  public int getValor() {
    return this.valor;
  }
  
  public void setValor(int value) {
    this.valor = value;
  }
  
  @Override
  /*
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final MiEntero other = (MiEntero) obj;
    if (this.valor != other.valor) {
      return false;
    }
    return true;
  }
*/
  
  public boolean equals (Object x){
    if (this.valor == ((MiEntero)x).getValor()) {
      return true;
    } else {
      return false;
    }
  }
  
  @Override
  public String toString () {
    String resultado = "" + this.valor;
    return resultado;
  }
  
}
