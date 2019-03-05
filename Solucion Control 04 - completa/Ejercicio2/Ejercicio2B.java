//import java.util.HashMap;
import java.util.*;

public class Ejercicio2B {
  public static void main (String[] args) {
    HashMap <String, String> misFrases = new HashMap <String, String>();
    
    int opcion = 0;
    
    do {
      System.out.println("\n\nMenú Frases por palabra:");
      System.out.println("1.- Mostrar frase correspondiente a una palabra.");
      System.out.println("2.- Borrar una palabra y su frase correspondiente.");
      System.out.println("3.- Mostrar por pantalla todas las palabras y frases asociadas.");
      System.out.println("0.- Salir.");
      System.out.print("--> Indique opción: ");
      
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
        case 1:
          MostrarFrase(misFrases);
          break;
        case 2:
          BorrarPalabraFrase(misFrases);
          break;
        case 3:
          ListarDiccionarioFrases(misFrases);
          break;
        default:
      }
      
      
    } while (opcion != 0);
    
  }
  
  
  public static void MostrarFrase (HashMap<String,String> misFrases) {
    System.out.print("Indique la palabra: ");
    String palabra = System.console().readLine();
    if (misFrases.containsKey(palabra)) {
      System.out.println("FRASE: '"+misFrases.get(palabra)+"'");
    } else {
      System.out.println("No existe una frase para esa palabra. Escriba a continuación la frase: ");
      String frase = System.console().readLine();
      misFrases.put(palabra,frase);
    }
    
  }
  
  public static void BorrarPalabraFrase (HashMap<String,String> misFrases) {
    System.out.print("Indique la palabra: ");
    String palabra = System.console().readLine();
    misFrases.remove(palabra);
  }
  
  public static void ListarDiccionarioFrases (HashMap<String,String> misFrases) {
    System.out.println();
    for (Map.Entry pareja: misFrases.entrySet()) {
      System.out.print(pareja.getKey()+" --> "+pareja.getValue()+"\n");
    }
  }
  
}
