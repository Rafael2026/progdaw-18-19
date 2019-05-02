/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen05.PaisRegionMunicipio;
import java.util.ArrayList;
/**
 *
 * @author tux
 */
public class Pais {
  private String nombre;
  private ArrayList<Region> regiones;
  
  public Pais (String name) {
    this.nombre = name;
    this.regiones = new ArrayList<Region>();
  }
  
  public String getNombre (){
    return this.nombre;
  }
  
  public void addRegion (Region r) {
    this.regiones.add(r);
  }
  
  public Region getRegion (String nombre) {
    for (Region r : this.regiones) {
      if (r.getNombre().equals(nombre)) {
        return r;
      }    
    }
    return null;
  }
  
  public int getPoblacion(){
    int resultado = 0;
    for (Region r: this.regiones) {
      resultado += r.getPoblacion();
    }
    return resultado;
  }
  
  public int getExtension(){
    int resultado = 0;
    for (Region r: this.regiones) {
      resultado += r.getExtension();
    }
    return resultado;
  }
  
  public String toString () {
    String resultado = "País: " + this.nombre +"\n";

    if (this.regiones.size() == 0) {
      resultado += "No tiene regiones registradas.\n";
      return resultado;
    }
    resultado += "Extensión TOTAL: " + this.getExtension() +"\n";
    resultado += "Población TOTAL: " + this.getPoblacion() + "\n";
    resultado += "====================\n";
    for (Region r: this.regiones) {
      resultado += r.toString();
      resultado += "====================\n";
    }
    return resultado;
  }
}
