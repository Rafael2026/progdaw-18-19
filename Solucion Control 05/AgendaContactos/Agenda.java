/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen05.AgendaContactos;
import java.util.HashMap;
import java.util.Map;
        
/**
 *
 * @author tux
 */
public class Agenda {
  private String nombre;
  private HashMap<String,Long> agenda;
  
  public Agenda (String name) {
    this.nombre = name;
    this.agenda = new HashMap<String,Long>();
  }
  
  public boolean verSiEstaContacto (String name){
    return this.agenda.containsKey(name);
  }
  
  public void altaContacto (String name, long number) {
      this.agenda.put(name, number);
  }
  
  /*
  public boolean modificaContacto (String name, long number) {
    if (this.verSiEstaContacto(name)) {
      this.agenda.replace(name, number);
      return true;
    }
    return false;
  }
  */
  
  public void bajaContacto(String name) {
    this.agenda.remove(name);
  }
  
  public long getTelefono (String name){
    Long telefono;
    telefono = this.agenda.get(name);
    if (telefono == null) {
      return -1;
    }
    return (long) telefono;
  }
  
  public String toString () {
    String resultado = "Nombre de la agenda: " + this.nombre + "\n";
    for (Map.Entry pareja: this.agenda.entrySet()){
      resultado += "=======================================\n";
      resultado += "Nombre: "+pareja.getKey()+"\n";
      resultado += "Teléfono: "+pareja.getValue()+"\n";
      resultado += "=======================================\n";
    }
    return resultado;
  }
  
}
