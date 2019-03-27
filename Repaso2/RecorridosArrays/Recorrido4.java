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
public class Recorrido4 {
  public static void main (String[] args) {
    int[] miArray = new int[12];
    
    // recorrido en 4 tramos de 3 casillas cada uno
    
    for (int i=0; i<4; i++) {
      for (int j=0; j<3; j++) {
        miArray[i*3+j] = (int)(Math.random()*100);
      }
    }
    
    
    for (int i=0; i<4; i++) {
      for (int j=0; j<3; j++) {
        System.out.print(miArray[i*3+j]+"-");
      }
    }
    
    System.out.println();
    
    for (int i=0; i<4; i++) {
      for (int j=2; j>=0; j--) {
        System.out.print(miArray[i*3+j]+"-");
      }
    }
    
    System.out.println();
    
    for (int i=3; i>=0; i--) {
      for (int j=0; j<3; j++) {
        System.out.print(miArray[i*3+j]+"-");
      }
    }
    
    System.out.println();
    
    int posFinal=11;
    for (int i=0; i<6; i++){
      System.out.print(miArray[i]+"-");
      System.out.print(miArray[posFinal]+"-");
      posFinal--;
    }
    
    System.out.println();
    
    for (int i=0; i<12; i+=2) {
      System.out.print(miArray[i]+"-");
    }
    for (int i=1; i<12; i+=2) {
      System.out.print(miArray[i]+"-");
    }
    
    System.out.println();
    
    
    
  }
}
