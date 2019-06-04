/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen09.FicheroAleatorio;

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
public class FicheroAleatorio {
  public static void main (String[] args) {
    if (args.length < 2) {
      System.out.println ("ERROR: Se esperan al menos 2 argumentos");
      return;
    }
    int tamanio = Integer.parseInt(args[0]);
    try {
      BufferedWriter miBufferDeEscritura = new BufferedWriter(new FileWriter(args[1]));
      
  
      
      for (int i=0; i<tamanio; i++){       
        miBufferDeEscritura.write((char)('a'+(int)(Math.random()*26)));
      }
      
      
      miBufferDeEscritura.close();
              
             
      
    } catch (FileNotFoundException fnfe) {
      System.out.println("No se encuentra el fichero");
    } catch (IOException ioe) {
      System.out.println("No se puede leer o escribir el fichero");
    }
    
  }
}
