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
public class DesplazamientoDerecha {
  public static void main(String[] args) {
    int[] vector = new int[5];
    
    for (int i=0; i<5; i++) {
      vector[i]=i+1;
    }
    
    int aux = vector[5-1];
    
    for (int i=5-2; i>=0; i--) {
      vector[i+1] = vector [i];
    }
    vector[0] = aux;
    
    aux = vector[5-1];
    for (int i=5-1; i>=1; i--) {
      vector[i] = vector [i-1];
    }
    vector[0] = aux;
    
    for (int i=0; i<5; i++) {
      System.out.print(vector[i]+" ");
    }
    
  }
}
