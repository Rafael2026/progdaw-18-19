/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen05.Memoria;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author tux
 */
public class MemoriaPalabras {
  private String nombre;
  private ArrayList<String> memoria;
  
  public MemoriaPalabras (String name) {
    this.nombre = name;
    this.memoria = new ArrayList<String>();
  }
  
  public void memorizar (String word) {
    this.memoria.add(word);
  }
  
  public void invertir () {
    Collections.reverse(memoria);
  }
  
  public String toString () {
    String resultado = "";
    int i=0;
    for (String s: this.memoria) {
      i++;
      resultado += s;             
      if (i<this.memoria.size()) {
        resultado +=", ";
      } else {
        resultado +=".\n";
      }
    }
    return resultado;
  }
}
