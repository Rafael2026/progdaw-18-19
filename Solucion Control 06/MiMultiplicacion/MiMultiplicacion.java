/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen06.MiMultiplicacion;
import java.util.Scanner;

/**
 *
 * @author tux
 */
public class MiMultiplicacion {
  public static void main (String[] args) {
    int a, b, c;
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca los dos números: ");
    a = Integer.parseInt(s.next());
    b = Integer.parseInt(s.next());
    
    c = miMultiplicacion(a,b);
    
    System.out.println (a +" x " + b + " = " + c);
    
    
  }
  
  public static int miMultiplicacion (int a, int b) {
    int resultado=0;
    int acarreo=0;
    int factor10 = 1;
    
    
    resultado = ((a%10) * (b % 10))%10;
    
    a = a / 10;
    b = b / 10;
    
    
    
    while ((a !=0) && (b != 0)) {
     factor10 = factor10*10;
     resultado = (((a%10) * (b % 10))%10)*factor10+resultado;
    
      a = a / 10;
      b = b / 10;
    }
    if (a > 0) {
      resultado = a*factor10*10 + resultado;
      return resultado;
    }
    if (b > 0) {  
      resultado = b*factor10*10 + resultado;
      return resultado;
    }
            
    return resultado;
  }
  
}
