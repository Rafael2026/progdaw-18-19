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
public class ContarPalabras2 {
   public static void main(String[] args){
     int cantidad=8;
     String[] palabras = new String[cantidad];
     int[] contador = new int[cantidad];
   
     
     for (int i=0; i<cantidad; i++) {
       contador[i] = 0;
     }
     
     Scanner s = new Scanner(System.in);
     
     for (int i=0; i<cantidad; i++) {
       System.out.print("Introduzca palabra "+(i+1)+": ");
       palabras[i] = s.nextLine();
     }
     
     for (int i=0; i<cantidad; i++) {
       int posEncontrada = encuentraPalabra(palabras[i],palabras,cantidad);
       // es seguro que ha encontrado la palabra
       contador[posEncontrada]++;
     }
     
     for (int i=0; i<cantidad; i++) {
       if (contador[i]>0) {
         System.out.println("La palabra '"+palabras[i]+"' se ha dicho "+contador[i]+(contador[i]>1?" veces.":" vez."));
       }
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
