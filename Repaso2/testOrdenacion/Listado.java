/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOrdenacion;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author tux
 */
public class Listado {
  private ArrayList<Persona> listado;
  
  public Listado () {
    this.listado = new ArrayList<Persona>();
  }
  
  public void aniadir(Persona p) {
    this.listado.add(p);
  }
  
  public String toString() {
    String salida = "";
    for (Persona p: this.listado) {
      salida += "DNI: " + p.getDNI() +"\nNombre: "+p.getNombre()+"\n\n";
    }
    
    return salida;
  }
  
  /*
  public void ordenar() {
    Collections.sort(this.listado);
  }
  
  
  */
  
  /*
  public void ordenar() {
    
    this.listado.sort((o1, o2) -> {
      return ((Persona)o2).compareTo((Persona)o1);
      //return 0; //To change body of generated lambdas, choose Tools | Templates.
    });
    
  }
*/
  
 public void ordenar() {
    
    this.listado.sort(new ComparadorPersona());
    
  }
  
}
