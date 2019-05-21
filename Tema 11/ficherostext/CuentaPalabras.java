/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherostext;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tux
 */
public class CuentaPalabras {
  public static void main (String[] args) {
    try {
      BufferedReader miBufferDeLectura = new BufferedReader(new FileReader(args[0]));
      
      String linea="";
      
      int contador = 0;
      
      linea = miBufferDeLectura.readLine();
      while (linea != null) {
        contador += cuentaPalabrasEnLinea(linea);
        linea = miBufferDeLectura.readLine();
      }
      System.out.println("Cuento: "+contador+"\n");
    } catch (FileNotFoundException fnfe) {
      System.out.println("No se encuentra el fichero");
    } catch (IOException ioe) {
      System.out.println("No se puede leer el fichero");
    }
  }
  
  public static int cuentaPalabrasEnLinea (String linea) {
    int contador = 0;
    
    linea = linea.trim();
    
    while (!linea.equals("")) {
      contador ++;
      
      int posicionEspacio = linea.indexOf(' ');
      
      if (posicionEspacio == -1) {
        linea = "";
      } else {
        linea = linea.substring(posicionEspacio);
        linea = linea.trim();
      }
      
      
    }
    
    return contador;
  }
}
