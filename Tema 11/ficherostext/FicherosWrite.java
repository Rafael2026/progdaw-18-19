/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherostext;
import java.io.*;
/**
 *
 * @author tux
 */
public class FicherosWrite {
  public static void main (String[] args) {
    try{
      BufferedWriter br = new BufferedWriter(new FileWriter("/home/tux/prueba2.txt"));
      br.write("Voy a ver si lo machaco");
      br.close();
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero");
    }
  }
}
