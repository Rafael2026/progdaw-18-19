/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen05.AgendaContactos;
import java.util.Scanner;

/**
 *
 * @author tux
 */
public class PruebaAgenda {
  public static void main (String[] args) {
    Agenda miAgenda = new Agenda("Agenda de contactos personal");
    
    int opcion;
    do {
      opcion = menu();
      switch (opcion) {
        case 1:
          procesarAlta(miAgenda);
          break;
        case 2:
          procesarBaja(miAgenda);
          break;
        case 3:
          procesarVerTelefono(miAgenda);
          break;
        case 4:
          System.out.println(miAgenda);
          break;
        default:
      }
    } while (opcion != 0);
    
  }
  
  public static int menu() {
    Scanner s = new Scanner(System.in);
    System.out.println("Indique qué desea hacer:");
    System.out.println("1.- Alta/Modificación de contacto");
    System.out.println("2.- Baja de contacto");
    System.out.println("3.- Consultar teléfono de contacto");
    System.out.println("4.- Mostrar agenda entera");
    System.out.println("0.- SALIR");
    return Integer.parseInt(s.next());
  }
  
  public static void procesarAlta (Agenda miAgenda) {
    Scanner s = new Scanner(System.in);
    System.out.print("Indique nombre del contacto: ");
    String name = s.next();
    System.out.print("Indique teléfono del contacto: ");
    long number = Long.parseLong(s.next());
    if (miAgenda.verSiEstaContacto(name)) {
      System.out.print("El contacto existe. ¿Actualizar? (S/N) ");
      String opcion = s.next().toUpperCase();
      if (opcion.equals("S")) {
        miAgenda.altaContacto(name, number);
      }
    } else {
      miAgenda.altaContacto(name, number);
    }
  }
  
  public static void procesarBaja (Agenda miAgenda) {
    Scanner s = new Scanner(System.in);
    System.out.print("Indique nombre del contacto: ");
    String name = s.next();
    miAgenda.bajaContacto(name);
  }
  
  public static void procesarVerTelefono (Agenda miAgenda) {
    Scanner s = new Scanner(System.in);
    System.out.print("Indique nombre del contacto: ");
    String name = s.next();
    long number = miAgenda.getTelefono(name);
    if (number == -1) {
      System.out.println("El contacto no existe.");
    } else {
      System.out.println("Teléfono: "+number);
    }
  }
}
