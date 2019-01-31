import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {
  
  // pruebas de ordenación de arraylist de enteros
  
  public static void main (String[] args) {
    ArrayList<Integer> conjuntoEnteros = new ArrayList<Integer>();
    
    for (int i=0; i<10; i++) {
        conjuntoEnteros.add((int)(Math.random()*100));
    }
    
    for (int entero: conjuntoEnteros) {
      System.out.print (entero +", ");
      
    } 
    
    Collections.sort(conjuntoEnteros,Collections.reverseOrder());
    System.out.println();
    
    for (int entero: conjuntoEnteros) {
      System.out.print (entero +", ");
      
    } 
    
  }
  
}
