package biblioArraysOneDimEnteros;

public class manejoArraysOneDimEnteros {
  public static int[] generaArrayInt (int tama, int min, int max) {
    int[] array;
    array = new int[tama];
    
    if (max < min) {
      int aux = min;
      min= max;
      max = aux;
    }
    
    for (int i=0; i<tama; i++) {
      array[i] =  min + (int)(Math.random()*(max-min+1));
    }
    
    return array;
  }
  
  public static int minimoArrayInt (int [] array, int tama) {
    int minimo=0;
    
    if (tama>0) {
      minimo = array[0];
    }
    for (int i=1; i<tama; i++) {
      if (array[i] < minimo) {
        minimo = array[i];
      }
    }
    return minimo;
  }
  
  public static int maximoArrayInt (int [] array, int tama) {
    int maximo=0;
    
    if (tama>0) {
      maximo = array[0];
    }
    for (int i=1; i<tama; i++) {
      if (array[i] > maximo) {
        maximo = array[i];
      }
    }
    return maximo;
  }
  
  public static int mediaArrayInt (int [] array, int tama) {
    float media=0;
    
    for (int i=0; i<tama; i++) {
       media += array[i];
    }
    if (tama > 0) {
      media /=tama;
    }
    
    return (int)media;
  }
  
  public static boolean estaEnArrayInt (int candidato, int [] array, int tama) {
    boolean encontrado = false;
    
    for (int i=0; (i<tama) && !encontrado; i++) {
       if (candidato == array[i]) {
         encontrado = true;
       }
    }
    
    return encontrado;
  }
  
  public static int posicionEnArrayInt (int candidato, int [] array, int tama) {
    int posicion=-1;
    
    for (int i=0; (i<tama) && (posicion==-1); i++) {
      if (candidato == array[i]) {
        posicion=i;
      }
    }
    return posicion;
  }
  
  public static void volteaArrayInt (int [] array, int tama) {
    int aux;
    
    for (int i=0; i<tama/2; i++) {
      aux = array[i];
      array[i] = array[tama-i-1];
      array [tama-i-1] = aux;
    }
  }
  
  
}
