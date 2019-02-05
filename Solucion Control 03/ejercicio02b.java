import libreriaArrays.*;

public class ejercicio02b {
  public static void main (String[] args) {
    int[] patata = {7,87,752,67,77,47,675,675,812};
    int[] sinSietes = libreriaArrays.paqueteArrays.filtraSin7 (patata);
    
    for (int i=0; i<sinSietes.length; i++) {
      System.out.print(sinSietes[i]+",");
    }
    
  }
  
  
}


