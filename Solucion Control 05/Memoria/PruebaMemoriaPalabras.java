/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen05.Memoria;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class PruebaMemoriaPalabras {
  public static void main (String[] args) {
    MemoriaPalabras m = new MemoriaPalabras("Memoria loca");
    Scanner s = new Scanner(System.in);
    String palabra;
    
    System.out.print("Indique palabras (palabra vacía para salir): ");
    
    do {
      palabra = s.next();
      if (!palabra.equals("0")) {
        m.memorizar(palabra);
        System.out.println(m);
      }
    } while (!palabra.equals("0"));
    m.invertir();
    System.out.println(m);
  }
}
