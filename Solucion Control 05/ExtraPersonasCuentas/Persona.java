package Examen05.ExtraPersonasCuentas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author tux
 */
public class Persona {
  private String DNI;
  private ArrayList<Cuenta> misCuentas;
  
  public Persona (String DNI) {
    this.DNI = DNI;
    this.misCuentas = new ArrayList<Cuenta>();
  }
  
  public boolean aniadirCuenta (Cuenta unaCuenta){
    /* en caso de tener ya 3 cuentas, devolveremos false, indicando que no se ha añadido */
    if (this.misCuentas.size() >=3) {
      return false;
    }
    this.misCuentas.add(unaCuenta);
    return true;
  }
  
  public boolean esMorosa () {
    for (Cuenta c: this.misCuentas){
      if (c.dameSaldoDisponible()<0) {
        return true;
      }
    }
    return false;
  }
  
  public Cuenta obtenerCuenta (int posicionOrdinal) {
    if ((posicionOrdinal>0) && (posicionOrdinal<=this.misCuentas.size())) {
      return this.misCuentas.get(posicionOrdinal-1);
    }
    return null;
  }
}
