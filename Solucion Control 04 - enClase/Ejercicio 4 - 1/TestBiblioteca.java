/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class TestBiblioteca {
  public static void main (String[] args){
    Libro libro1 = new Libro(1,"Aprende Java con Ejercicios",2019);
    Revista revista1 = new Revista(2,"Muy interesante",2000,10);
    System.out.println(libro1);
    System.out.println(revista1);
    libro1.prestar();
    System.out.println(libro1);
    if (libro1.prestado()) {
      System.out.println("En efecto, el libro está prestado.");
    } else{
      System.out.println("En efecto, el libro NO está prestado.");
    }
      
  }
  
}
