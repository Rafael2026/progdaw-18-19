/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen06.EncriptadoCesar;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class EncriptadoCesar2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int opcion;
    String entrada;
    String resultado;
    
    do {
      System.out.println("Elija una opción:");
      System.out.println("1.- Encriptar mensaje");
      System.out.println("2.- Desencriptar mensaje");
      System.out.println("0.- SALIR");
      
      opcion = Integer.parseInt(s.nextLine());
      switch (opcion) {
        case 1:
          System.out.print("Introduzca la frase: ");
          entrada = s.nextLine();
          resultado = encriptar(entrada);
          System.out.println("La frase encriptada es: "+resultado);
          break;
        case 2:
          System.out.print("Introduzca la frase encriptada: ");
          entrada = s.nextLine();
          resultado = desencriptar(entrada);
          System.out.println("La frase desencriptada es: "+resultado);
          break;
        default:
      }
      
    } while (opcion != 0);
  }
  
  public static String encriptar(String entrada){
    String resultado = "";
    resultado = desplazar (entrada,3);
    
    return resultado;
  }
  
  public static String desencriptar (String entrada) {
    String resultado = "";
    resultado = desplazar (entrada, -3);
    return resultado;
  }
  
  public static String desplazar (String entrada, int desplazamiento) {
    String resultado = "";
    int tamanio = 26;
    int ascii;
    int asciibase= (int)('A');
    int posicion;
    
    entrada = entrada.toUpperCase();
    for (int i=0; i<entrada.length(); i++) {
      ascii = (int)(entrada.charAt(i));
      if ((ascii >= asciibase) && (ascii <= (asciibase+tamanio))) {
        ascii = asciibase + (ascii-asciibase+desplazamiento+tamanio)%tamanio;
        resultado += Character.toString((char)ascii);
      } else {
        resultado += Character.toString(entrada.charAt(i));
      }
        
    }
    
    return resultado;
  }
}
