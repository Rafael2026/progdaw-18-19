public class perreria2 {
  public static void main(String[] args) {
    int tamanio = 10;
    int[] vector = new int[tamanio];
    
    // relleno aleatorio
    
    for (int i=0; i<tamanio; i++) {
      vector[i] = (int)(Math.random()*100)+1;
    }
    
    // presentación del vector
    for (int i=0; i<tamanio; i++) {
      System.out.printf("%4d",i);
    }
    System.out.printf("\n");
    for (int i=0; i<tamanio; i++) {
      System.out.printf("%4d",vector[i]);
    }
    System.out.printf("\n\n");
    
    // desplazamiento en n posiciones a la derecha
    int desplazamiento = 3;
    for (int j=0; j<desplazamiento; j++) {
      int aux = vector[tamanio-1];
      for (int i=tamanio-1; i>0; i--) {
        vector[i] = vector[i-1];
      }
      vector[0]=aux;
    }
    
    // presentación del vector
    for (int i=0; i<tamanio; i++) {
      System.out.printf("%4d",i);
    }
    System.out.printf("\n");
    for (int i=0; i<tamanio; i++) {
      System.out.printf("%4d",vector[i]);
    }
    System.out.printf("\n\n");
    
  }
}
