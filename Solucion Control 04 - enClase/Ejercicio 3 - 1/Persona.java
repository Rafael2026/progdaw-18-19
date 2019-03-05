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
public class Persona {
  private String nombre;
  private String dni;
  
  public Persona (String nombreIn, String dniIn) {
    this.nombre = nombreIn;
    this.dni = dniIn;
  }
  
  public String getNombre (){
    return this.nombre;
  }
  
}
