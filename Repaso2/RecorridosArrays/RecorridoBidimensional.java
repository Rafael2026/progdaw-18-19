/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecorridosArrays;
import java.util.Scanner;

/**
 *
 * @author tux
 */
public class RecorridoBidimensional {
  public static void main (String[] args) {
    int[][] vector = new int[5][5];
    Scanner s = new Scanner(System.in);
    
    for (int i=0; i<5; i++) {
      for (int j=0; j< 5; j++) {
        vector[i][j] = (int)(Math.random()*100);
      }
    }
    
    System.out.print("Introduzca fila: ");
    int fila = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca columna: ");
    int columna = Integer.parseInt(s.nextLine());

    
    System.out.println("Array completo:");
    for (int i=0; i<5; i++) {
      for (int j=0; j< 5; j++) {
        System.out.print(vector[i][j]+",");
      }
      System.out.println();
    }
    
    System.out.println("Subarray");
    for (int i=0; i<=fila; i++) {
      for (int j=0; j<=columna; j++) {
        System.out.print(vector[i][j]+",");
      }
      System.out.println();
    }
    
    
  }
}
