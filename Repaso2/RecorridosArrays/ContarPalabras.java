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
public class ContarPalabras {
   public static void main(String[] args){
     int cantidad=8;
     String[] palabras = new String[cantidad];
     String[] palabrasContadas = new String[cantidad];
     int[] contador = new int[cantidad];
     int tope = 0;
     
     Scanner s = new Scanner(System.in);
     
     for (int i=0; i<cantidad; i++) {
       System.out.print("Introduzca palabra "+(i+1)+": ");
       palabras[i] = s.nextLine();
     }
     
     for (int i=0; i<cantidad; i++) {
       int posEncontrada = encuentraPalabra(palabras[i],palabrasContadas,tope);
       if (posEncontrada!= -1) {
         contador[posEncontrada]++;
       } else {
         palabrasContadas[tope] = palabras[i];
         contador[tope] = 1;         
         tope++;
       }
        
     }
     
     for (int i=0; i<tope; i++) {
       System.out.println("La palabra '"+palabrasContadas[i]+"' se ha dicho "+contador[i]+(contador[i]>1?" veces.":" vez."));
     }
   }
   
   public static int encuentraPalabra(String miPalabra, String[] arrayPalabras, int cantidad) {
     int posicion = -1;
     for (int i=0; (i<cantidad) && (posicion == -1); i++) {
       if (miPalabra.equals(arrayPalabras[i])) {
         posicion = i;
       }
     }
     return posicion;
   }
}
