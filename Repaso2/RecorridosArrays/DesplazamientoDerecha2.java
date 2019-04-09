/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecorridosArrays;

/**
 *
 * @author tux
 */
public class DesplazamientoDerecha2 {
  public static void main(String[] args) {
    int[] vector = new int[5];
    int[] vector2 = new int[5];
    
    for (int i=0; i<5; i++) {
      vector[i]=i+1;
    }
    
    
    for (int i=0; i<5; i++) {
      vector2[(i+3)%5] = vector[i];
    }
    
    
    
    
    for (int i=0; i<5; i++) {
      System.out.print(vector2[i]+" ");
    }
    
  }
}
