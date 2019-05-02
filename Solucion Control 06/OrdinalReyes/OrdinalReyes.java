/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen06.OrdinalReyes;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class OrdinalReyes {
  public static void main(String[] args){
    int max=5;
    
    Scanner s = new Scanner (System.in);
    String aux;
    
    
    System.out.print("Introduzca la cantidad de reyes a procesar: ");
    max = Integer.parseInt(s.nextLine());
    
    String[] reyes = new String[max];
    String[] reyesOrd = new String[max];
    
    for (int i=0; i<max; i++) {
      System.out.print("Introduzca nombre de rey: ");
      reyes[i] = s.nextLine();
    }
    
    for (int i=0; i<max; i++) {
      int contador=0;
      for (int j=0; j<i; j++) {
        if (reyes[i].equals(reyes[j])) {
          contador++;
        }
      }
      reyesOrd[i] = reyes[i] + " " + (contador+1);
    }
    
    for (int i=0; i<max; i++) {
      System.out.println(reyesOrd[i]);
    }
    
    
  }
}
