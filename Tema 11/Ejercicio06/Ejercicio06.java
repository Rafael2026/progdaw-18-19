/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio06;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author tux
 */
public class Ejercicio06 {
  public static void main (String[] args) {
    if (args.length <2) {
      System.out.println("El programa espera como argumentos: <nombre_fich> <palabra>");
      return;
    }
    
    String nombreFichero = args[0];
    String palabraABuscar = args[1];
    
    try {
      BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
      
      int contador = 0;
      
      String linea = "";
      while (linea != null) {
        linea = br.readLine();
        if (linea != null) {
          contador += buscarPalabraEnLinea(linea,palabraABuscar);
        }
      }
      br.close();
          
      System.out.println("La palabra '"+palabraABuscar+"' aparece "+contador+" veces en el fichero "+nombreFichero);
      
    } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
      System.out.println("No se encuentra el fichero "+nombreFichero);
    } catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
      System.out.println("No se puede leer el fichero malaga.txt");
    }
    
  }
  
  public static int buscarPalabraEnLinea (String unaLinea, String palabra) {
    int contador = 0;
    int posicDondeEmpieza;
    do {
      posicDondeEmpieza = unaLinea.indexOf(palabra);
      if (posicDondeEmpieza!= -1) {
        contador ++;
        unaLinea = unaLinea.substring(posicDondeEmpieza+palabra.length());
      }      
    } while (posicDondeEmpieza != -1);
    return contador;
  }
}
