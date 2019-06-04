/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen07.LetraH;
import java.util.Scanner;

        
/**
 *
 * @author tux
 */
public class LetraH {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la H (un número mayor o igual a 3): ");
    int altura = Integer.parseInt(s.nextLine());
    
    if (altura <3) {
      System.out.println("La altura introducida no es correcta..");
      return;
    }
    
    System.out.print("Introduzca la anchura de la H (entre 3 y "+(altura*2)+"): ");
    int anchura = Integer.parseInt(s.nextLine());
    
    if ((anchura <3) || (anchura >(altura*2))) {
      System.out.println("La anchura introducida no es correcta.");
      return;
    }
    
    System.out.print("Introduzca la fila del palito horizontal (entre 2 y "+(altura-1)+"): ");
    int filaPalitoH = Integer.parseInt(s.nextLine());
    
    if ((filaPalitoH <2) || (filaPalitoH >=altura)) {
      System.out.println("La fila introducida no es correcta.");
      return;
    }
    
    System.out.println();
    for (int i=0; i<altura; i++) {
      System.out.print("*");
      for (int j=0; j<anchura-2; j++) {
        if ((i+1)==filaPalitoH) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("*");
      System.out.println();
    }
    
  }
}
