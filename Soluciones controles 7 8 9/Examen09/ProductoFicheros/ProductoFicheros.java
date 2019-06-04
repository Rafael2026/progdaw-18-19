/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen09.ProductoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author tux
 */
public class ProductoFicheros {
  public static void main (String[] args) {
    if (args.length < 3) {
      System.out.println ("ERROR: Se esperan al menos 3 argumentos");
      return;
    }
    try {
      BufferedReader miBufferDeLectura1 = new BufferedReader(new FileReader(args[0]));
      BufferedReader miBufferDeLectura2 = new BufferedReader(new FileReader(args[1]));
      BufferedWriter miBufferDeEscritura = new BufferedWriter(new FileWriter(args[2]));
      
      String linea1, linea2, linea3;
      
      linea1 = miBufferDeLectura1.readLine();
      linea2 = miBufferDeLectura2.readLine();
      
      while ((linea1 != null) && (linea2 != null)) {
        int numero1 = Integer.parseInt(linea1);
        int numero2 = Integer.parseInt(linea2);
        int numero3 = numero1 * numero2;
        miBufferDeEscritura.write(Integer.toString(numero3)+"\n");
        
        linea1 = miBufferDeLectura1.readLine();
        linea2 = miBufferDeLectura2.readLine();
      }
      miBufferDeEscritura.close();
              
             
      
    } catch (FileNotFoundException fnfe) {
      System.out.println("No se encuentra el fichero");
    } catch (IOException ioe) {
      System.out.println("No se puede leer o escribir el fichero");
    }
    
  }
}
