/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDudas;
import java.util.ArrayList;
/**
 *
 * @author tux
 */
public class ArrayListDeString {
  @SuppressWarnings("empty-statement")
  public static void main (String[] args) {
    ArrayList<String> ListaPalabras = new ArrayList<String>();
    ArrayList<Integer> ListaEnteros = new ArrayList<Integer>();
    ArrayList<MiEntero> ListaMisEnteros = new ArrayList<MiEntero>();
    
    ListaPalabras.add("hola");
    ListaPalabras.add("hola");
    ListaPalabras.add("hola2");
    ListaPalabras.add("hola");
    ListaPalabras.add("hola3");
    
    ListaEnteros.add(1);
    ListaEnteros.add(1);
    ListaEnteros.add(3);
    ListaEnteros.add(1);
    ListaEnteros.add(6);
    ListaEnteros.add(1);
    
    ListaMisEnteros.add(new MiEntero(1));
    ListaMisEnteros.add(new MiEntero(1));
    ListaMisEnteros.add(new MiEntero(3));
    ListaMisEnteros.add(new MiEntero(1));
    ListaMisEnteros.add(new MiEntero(8));
    ListaMisEnteros.add(new MiEntero(8));
    ListaMisEnteros.add(new MiEntero(1));
    
    System.out.println(ListaPalabras);
    System.out.println(ListaEnteros);
    System.out.println(ListaMisEnteros);
    
    while (ListaPalabras.remove("hola"));
      
    while (ListaEnteros.remove((Integer)(1)));
    
    while (ListaMisEnteros.remove(new MiEntero(1)));

    System.out.println(ListaPalabras);
    System.out.println(ListaEnteros);
    System.out.println(ListaMisEnteros);
    
    ListaPalabras.remove(1);
    ListaEnteros.remove(1);
    ListaMisEnteros.remove(1);
    
  
    System.out.println(ListaPalabras);
    System.out.println(ListaEnteros);
    System.out.println(ListaMisEnteros);
    
  }
  
}
