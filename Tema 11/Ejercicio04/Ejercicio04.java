/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author tux
 */
public class Ejercicio04 {
  public static void main (String[] args) {
    
    if (args.length == 0) {
      System.out.println("Debe especificar el fichero que quiere ordenar.");
      return;
    }
    String nombreFichero = args[0];
    ArrayList<String> palabras = new ArrayList<String>();
    
    try {
      BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
      String linea = "";
      
      while (linea != null) {
        if (!linea.equals("")) {
          palabras.add(linea);
        }
        linea = br.readLine();
      }
      br.close();
    } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
      System.out.println("No se encuentra el fichero "+nombreFichero);
    } catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
      System.out.println("No se puede leer el fichero "+nombreFichero);
    }
    
    if (palabras.size()>0) {
      Collections.sort(palabras);
    }
    
    int posicionPunto = nombreFichero.indexOf('.');
    String nombreFichero2 = nombreFichero.substring(0, posicionPunto);
    nombreFichero2 += "_sort";
    nombreFichero2 += nombreFichero.substring(posicionPunto);
    
    
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero2));
      
      for (String palabra: palabras) {
        bw.write(palabra+"\n");
      }
      bw.close();
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero "+nombreFichero2);
    }   
    
            
    
  }
}
