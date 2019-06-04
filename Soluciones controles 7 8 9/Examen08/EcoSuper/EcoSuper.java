/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen08.EcoSuper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author tux
 */
public class EcoSuper {
  public static void main (String[] args) {
    ArrayList<String> misProductos = new ArrayList<String>();
    ArrayList<Integer> misCantidades = new ArrayList<Integer>();
    HashMap<String,Double> misPrecios = new HashMap<String,Double>();
    
    misPrecios.put("avena", 2.21);
    misPrecios.put("garbanzos", 2.39);
    misPrecios.put("tomate", 1.59);
    misPrecios.put("jenjibre", 3.13);
    misPrecios.put("quinoa", 4.50);
    misPrecios.put("guisantes", 1.60);
    
    
    
    
    Scanner s = new Scanner(System.in);
    
    String producto;
    
    do {
      System.out.print("Producto: ");
      producto = s.nextLine();
      if (misPrecios.get(producto)!= null) {
        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(s.nextLine());
        // buscar si está apuntado
        if (misProductos.indexOf(producto)!=-1) {
          misCantidades.set(misProductos.indexOf(producto), cantidad + misCantidades.get(misProductos.indexOf(producto)));
        } else {
          misProductos.add(producto);
          misCantidades.add(cantidad);
        }
      } 
    } while (!producto.equals("fin"));
    
    
    Double total=0.0;
    System.out.println("\nProducto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");
    for (int i=0; i<misProductos.size(); i++) {
      producto = misProductos.get(i);
      Double precio = misPrecios.get(producto);
      int cantidad = misCantidades.get(i);
      System.out.printf("%-8s %5.2f  %4d      %6.2f\n",producto,precio,cantidad,precio*cantidad);
      total += precio*cantidad;
    }
    
    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %.2f\n",total);
    
  }
  
}
