/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen07.MenuOpciones;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class MenuOpciones {
  public static void main (String[] args) {
    int opcion;
    
    opcion = menu();
    while (opcion != 3) {
      switch (opcion) {
        case 1:
          TablaMultiplicar();
          break;
        case 2:
          MayusculasMinusculas();
          break;
        default:
      }
      opcion = menu();
    }
    
  }
  
  public static int menu () {
    Scanner s = new Scanner(System.in);
    System.out.println("1.- Tabla de multiplicar");
    System.out.println("2.- Mayúsculas/minúsculas");
    System.out.println("3.- Salir");
    System.out.print("Indique qué desea: ");
    return Integer.parseInt(s.nextLine());
  }
  
  public static void TablaMultiplicar() {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println(GeneraTabla(numero));
  }
  
  public static void MayusculasMinusculas() {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un texto: ");
    String texto = s.nextLine();
    System.out.println(AlteraCadena(texto));
    System.out.println();
  }
  
  public static String GeneraTabla(int x) {
    String resultado = "";
    for (int i=1; i<=10; i++) {
      resultado += x + " x " + i + " = " + (x*i) + "\n";
    }
    
    return resultado;
  }
  
  public static String AlteraCadena (String s) {
    String resultado = "";
    
    for (int i=0; i<s.length(); i++) {
      if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) {
        resultado += (char)((int)'a'+ (int)s.charAt(i)-(int)'A');
      } else if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) {
        resultado += (char)((int)'A'+ (int)s.charAt(i)-(int)'a');
      } else if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9')) {
        resultado += '.';
      } else {
        resultado += s.charAt(i);
      }
    }
    return resultado;
  }
}
