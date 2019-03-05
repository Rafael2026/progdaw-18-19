import java.util.*;

public class PruebaDiccionario {
  public static void main (String[] args) {
    HashMap <String,String> diccionario = new HashMap <String,String>();
    
    diccionario.put("Hola","Hello");
    diccionario.put("Perro","Dog");
    diccionario.put("Gato","Cat");
    diccionario.put("Avión","Plane");
    diccionario.put("Ascensor","Elevator");
    
    
    
    // System.out.println(diccionario);
    
    String capturaTeclado;
    
    do {
      System.out.print ("Introduzca palabra en castellano (\"exit\" para salir): ");
      capturaTeclado = System.console().readLine();
      if (!capturaTeclado.equals("exit")) {
        if (diccionario.containsKey(capturaTeclado)) {
          System.out.println(capturaTeclado+": "+diccionario.get(capturaTeclado));
        } else {
          System.out.println("Entrada inexistente: "+capturaTeclado);
        }
        
      }
    } while (!capturaTeclado.equals("exit"));
    
  }
}
