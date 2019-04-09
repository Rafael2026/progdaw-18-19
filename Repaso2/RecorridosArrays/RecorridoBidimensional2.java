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
public class RecorridoBidimensional2 {
  public static void main (String[] args) {
    int filas=8;
    int columnas=8;
    int[][] vector = new int[filas][columnas];
    
    int [] contador  = new int[100];
    
    Scanner s = new Scanner(System.in);
    
    for (int i=0; i<filas; i++) {
      for (int j=0; j< columnas; j++) {
        vector[i][j] = (int)(Math.random()*100);
      }
    }
    
    for (int i=0; i<100; i++) {
      contador[i]=0;
    }
      
  
    
    System.out.println("Array completo:");
    for (int i=0; i<filas; i++) {
      for (int j=0; j< columnas; j++) {
        System.out.print(vector[i][j]+",");
      }
      System.out.println();
    }
    
    
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        contador[vector[i][j]]++;
      }
    }
    
    for (int i=0; i<100; i++) {
      if (contador[i]>0) {
        System.out.println("El número "+ i +" aparece "+contador[i]+ (contador[i]>1?" veces.":" vez."));
      }
    }
 
    
    
  }
}
