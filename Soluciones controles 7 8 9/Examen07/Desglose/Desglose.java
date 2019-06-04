/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen07.Desglose;
import java.util.Scanner;
        
/**
 *
 * @author tux
 */
public class Desglose {
  public static void main (String[] args) {
    double[] monedasBilletes = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
    int[] numMonedasBilletes = new int[15];
    
    for (int i=0; i<15; i++) {
      numMonedasBilletes[i]=0;
    }
    
    double cantidad;
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca cantidad en Euros: ");
    
    cantidad = Double.parseDouble(s.nextLine());
    
    double cantidad0 = cantidad;
    

    int indice = 0;
    while ((cantidad > 0) && (indice < 15)) {
      while (cantidad >= monedasBilletes[indice]) {
        numMonedasBilletes[indice]++;
        cantidad -= monedasBilletes[indice];
        cantidad *= 100;
        cantidad = Math.round(cantidad);
        cantidad /= 100.0;
      }
      indice ++;
    }

    System.out.println("El desglose de "+cantidad0+" es:");
    for (int i=0; i<15; i++) {
      if (numMonedasBilletes[i]>0) {
        if (monedasBilletes[i]>2) {
          System.out.println(numMonedasBilletes[i] + " billetes de "+(int)monedasBilletes[i]+ "€");
        } else {
          if (monedasBilletes[i]>=1) {
            System.out.println(numMonedasBilletes[i] + " monedas de "+(int)monedasBilletes[i]+ "€");
          } else {
            System.out.println(numMonedasBilletes[i] + " monedas de "+monedasBilletes[i]+ "€");
          }
        }
        
      }
    }
    
    
    
  }
}
