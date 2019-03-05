/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class ColaDelSuper {
  public static void main(String[] args) {
    ArrayList<Persona> Cola = new ArrayList<Persona>();
    int opcion = 0;
    Scanner s = new Scanner(System.in);
    do {
      System.out.println();
      System.out.println("Elija opción:");
      System.out.println("1.- Llegada a cola");
      System.out.println("2.- Atender cola");
      System.out.println("3.- Gente en cola");
      System.out.println("0.- SALIR");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
        case 1:
          LlegadaACola(Cola);
          break;
        case 2:
          AtenderCola(Cola);
          break;
        case 3:
          VerCola(Cola);
          break;
        default:
      }
      
      
    } while (opcion != 0);
    
  }
  
  public static void LlegadaACola(ArrayList<Persona> c) {
    Scanner ss = new Scanner(System.in);
    String nuevoNombre;
    String nuevoDNI;
    System.out.print("Dime el nombre de la persona: ");
    nuevoNombre = ss.nextLine();
    System.out.print("Dime el DNI: ");
    nuevoDNI = ss.nextLine();
     
    c.add(new Persona (nuevoNombre,nuevoDNI));
  }
  
  public static void AtenderCola (ArrayList<Persona> c) {
    if (c.size()>0) {
      System.out.println("Atendido: "+c.get(0).getNombre());
      c.remove(0);
    } else {
      System.out.println("No hay nadie en cola.");
    }
  }
  
  public static void VerCola (ArrayList<Persona> c) {
    System.out.println("La cola está formada por:");
    for (Persona p : c) {
      System.out.println(p.getNombre());
    }
  }
  
}
