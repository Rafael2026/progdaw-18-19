/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOrdenacion;
import java.util.Comparator;
/**
 *
 * @author tux
 */
public class Persona implements Comparable<Persona> {
  private String DNI;
  private String Nombre;
  
  public Persona (String inDNI, String inNombre) {
    this.DNI = inDNI;
    this.Nombre = inNombre;
  }
  
  public String getDNI () {
    return this.DNI;
  }
  
  public String getNombre () {
    return this.Nombre;
  }
  
  public String toString() {
    return "DNI "+this.DNI + "\nNombre: "+this.Nombre+"\n";
  }
  
  @Override
  public int compareTo(Persona p){
    return this.DNI.compareTo(p.getDNI());
  }
  
  
  
 
  
 
          
          
  
}
