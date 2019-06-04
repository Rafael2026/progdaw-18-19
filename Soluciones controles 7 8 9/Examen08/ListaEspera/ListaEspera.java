/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen08.ListaEspera;
import java.util.ArrayList;

/**
 *
 * @author tux
 */
public class ListaEspera {
  private ArrayList<String> pacientes;
  
  public ListaEspera () {
    this.pacientes = new ArrayList<String>();
  }
  
  public void llegaPaciente (String nombre) {
    this.pacientes.add(nombre);
  }
  
  public String siguientePaciente () {
    if (this.cuantosQuedan()>0) {
      String siguiente = this.pacientes.get(0);
      this.pacientes.remove(0);
      return siguiente;
    }
    return null;
  }
  
  public int cuantosQuedan() {
    return this.pacientes.size();
  }
          
}
