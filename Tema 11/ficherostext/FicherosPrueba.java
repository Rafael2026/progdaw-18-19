package ficherosprueba;

/**
 *
 * @author Lorena Moyano Montes
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

public class FicherosPrueba {

  public static void main(String[] args) {
    HashMap<String, String> diccionario = new HashMap<String, String>();

    try {
      BufferedReader br1 = new BufferedReader(new FileReader("/home/tux/espanol.txt"));
      BufferedReader br2 = new BufferedReader(new FileReader("/home/tux/ingles.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter("/home/tux/diccionario.txt"));

      String linea1 = "";
      String linea2 = "";

      while ((linea1 != null) || (linea2 != null)) {
        linea1 = br1.readLine();
        linea2 = br2.readLine();
        /*
        if (linea1 != null) {
          bw.write(linea1 + "\n");
        }
        if (linea2 != null) {
          bw.write(linea2 + "\n");
        }
        */
        if (linea1 != null && linea2 !=null) {
          diccionario.put(linea1, linea2);
        }

      }
      br1.close();
      br2.close();
      //bw.close();

    
      
      for (Map.Entry pareja : diccionario.entrySet()) {
        bw.write(pareja.getKey() + ": ");
        bw.write(pareja.getValue()+"\n");
      }
      
      bw.close();
      
    } catch (IOException ioe) {
      System.out.println("No se ha podido cargar la palabra.");
      System.err.println(ioe.getMessage());
    }

  }

}
