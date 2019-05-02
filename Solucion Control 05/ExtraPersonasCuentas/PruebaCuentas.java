/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen05.ExtraPersonasCuentas;

/**
 *
 * @author tux
 */
public class PruebaCuentas {
  public static void main(String[] args) {
    Persona yo = new Persona("12345678A");
    
    yo.aniadirCuenta(new Cuenta(1000,0));
    yo.aniadirCuenta(new Cuenta(2000,700));
    
    yo.obtenerCuenta(1).abono(1100);
    yo.obtenerCuenta(2).recibo(750);
    
    if (yo.esMorosa()) {
      System.out.println("Soy moroso");
      System.out.println(yo.obtenerCuenta(1).dameSaldoDisponible());
      System.out.println(yo.obtenerCuenta(2).dameSaldoDisponible());
    } else {
      System.out.println("NO soy moroso");
      System.out.println(yo.obtenerCuenta(1).dameSaldoDisponible());
      System.out.println(yo.obtenerCuenta(2).dameSaldoDisponible());
    }
    
    yo.obtenerCuenta(2).transferencia(yo.obtenerCuenta(1), 100);
    
    /*
    Cuenta cuentaorigen = yo.obtenerCuenta(1);
    Cuenta cuentadestino = yo.obtenerCuenta(2);
    cuentadestino.transferencia(cuentaorigen, 100);
    */
    
    if (yo.esMorosa()) {
      System.out.println("Soy moroso");
      System.out.println(yo.obtenerCuenta(1).dameSaldoDisponible());
      System.out.println(yo.obtenerCuenta(2).dameSaldoDisponible());
    } else {
      System.out.println("NO soy moroso");
      System.out.println(yo.obtenerCuenta(1).dameSaldoDisponible());
      System.out.println(yo.obtenerCuenta(2).dameSaldoDisponible());
    }
  }
}
