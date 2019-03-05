/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class ParejasDeSinonimos {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    HashMap<String,String> miDiccionario = new HashMap<String,String>();
    int opcion = 0;
    do {
      String pal1;
      String pal2;
      System.out.println("MENU: Seleccione opción:");
      System.out.println("1.- Dar de alta pareja.");
      System.out.println("2.- Dar de baja pareja.");
      System.out.println("3.- Encadenar sinonimos.");
      System.out.println("0.- SALIR.");
      opcion = Integer.parseInt(s.nextLine());
      switch (opcion) {
        case 1:
          System.out.print("Indique palabra 1: ");
          pal1 = s.nextLine();
          System.out.print("Indique palabra 2: ");
          pal2 = s.nextLine();
          altaPareja(miDiccionario,pal1,pal2);
          break;
        case 2:
          System.out.print("Indique palabra 1: ");
          pal1 = s.nextLine();
          bajaPareja(miDiccionario,pal1);
          break;
        case 3:
          System.out.print("Indique palabra 1: ");
          pal1 = s.nextLine();
          cadenaSinonimos(miDiccionario,pal1);
          break;
        default:       
      }
    } while (opcion != 0);
    
  }
  
    
  public static void altaPareja (HashMap<String,String> diccionario, String pal1, String pal2) {
    Scanner s = new Scanner(System.in);
    if (diccionario.containsKey(pal1)) {
      System.out.print("La palabra '"+pal1+"' ya está en el diccionario. ¿Actualizar sinónimo? (s/n)");
      String opcion = s.nextLine();
      if (opcion.charAt(0)=='s') {
        diccionario.put(pal1,pal2);
      }
    } else {
      diccionario.put(pal1,pal2);
    }
  }
  
  public static void bajaPareja (HashMap<String,String> diccionario, String pal1) {
    diccionario.remove(pal1);
  }
  
  public static void cadenaSinonimos (HashMap<String,String> diccionario, String pal1) {
    ArrayList<String> sinonimos = new ArrayList<String>();
    
    System.out.print(pal1+", ");
    String clave = pal1;
    sinonimos.add(pal1);
    while ((diccionario.get(clave)!=null) && (!sinonimos.contains(diccionario.get(clave)))) {
      System.out.print(diccionario.get(clave)+", ");
      sinonimos.add(diccionario.get(clave));
      clave = diccionario.get(clave);
    }
    System.out.println();
    
  }
}
