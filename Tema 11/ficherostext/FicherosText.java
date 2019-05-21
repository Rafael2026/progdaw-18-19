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
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tux
 */
public class FicherosText {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<String> palabras = new ArrayList<String>();
    
    try {
      // TODO code application logic here
      BufferedReader br = new BufferedReader(new FileReader("/home/tux/prueba.txt"));
      String linea = "";
      /*
      while (linea != null) {
        linea = br.readLine();
        if (linea != null) {
          palabras.add(linea);
        }
      }
      */
      
      while (linea != null) {
        palabras.add(linea);
        linea = br.readLine();
      }
      palabras.remove(0);    
   
      
      br.close();
      
    } catch (FileNotFoundException ex) {
      Logger.getLogger(FicherosText.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(FicherosText.class.getName()).log(Level.SEVERE, null, ex);
      
    }
    
    Collections.sort(palabras);

    for (String unaPalabra: palabras) {
      System.out.print(unaPalabra + " -- ");
    }
    
  }
  
}
