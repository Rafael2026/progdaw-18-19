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
public class Recorrido2 {
  public static void main(String[] args) {
    int [][] arrayBid = new int[5][6];
    
    int fila=0;
    int columna=0;
    
    for (int i=0; i<5*6; i++) {
      arrayBid[fila][columna] = i;
      System.out.print(arrayBid[fila][columna]+"-");
      columna++;
      if (columna>=6) {
        columna = 0;
        fila++;
        System.out.println();
      }
    }
    
    
  }
}
