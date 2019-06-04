/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Examen07.Ocurrencias;

/**
 *
 * @author tux
 */
public class Ocurrencias {
  public static void main (String[] args) {
    System.out.println("ocurrencias(1, 10) -> " +ocurrencias(1, 10));
    System.out.println("ocurrencias(8, 4672) -> " +ocurrencias(8, 4672));
    System.out.println("ocurrencias(5, 25153) -> "+ocurrencias(5, 25153));
    System.out.println("ocurrencias(1, 123456) -> " + ocurrencias(2, 123456));
    System.out.println("ocurrencias(1, {714, 81, 9, 11}) -> " + ocurrencias(1, new int[]{714, 81, 9, 11}));
    System.out.println("ocurrencias(4, {42, 13, 12345, 4}) -> " + ocurrencias(4, new int[] {42, 13, 12345, 4}));
    System.out.println("ocurrencias(6, {6, 66, 666}) -> " + ocurrencias(6, new int[] {6, 66, 666}));
    System.out.println("ocurrencias(1, {10, 10, 10}) -> " + ocurrencias(1, new int[] {10, 10, 10}));
    
  }
  
  public static int ocurrencias (int digito, int n) {
    int resultado = 0;
    int d;
    
    if ((n==0) && (digito == 0)) {
      return 1;
    }
    
    while (n >0) {
      d = n % 10;
      n = n/10;
      if (d==digito) {
        resultado++;
      }
    }
    
    
    return resultado;
  }
  
  public static int ocurrencias (int digito, int[] a) {
    int resultado = 0;
    
    for (int i=0; i<a.length; i++) {
      resultado += ocurrencias(digito,a[i]);
    }
        
    return resultado;
  }
}
