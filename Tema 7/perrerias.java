public class perrerias {
  public static void main(String[] args) {
    // alguna que otra manipulación de arrays
    int tamanio = 6;
    int[] vector = new int[tamanio];
    
    // rellenado de datos del array
    System.out.println("Datos para el array: ");
    for (int i=0; i<tamanio; i++) {
      System.out.print("Introduzca el valor de la posición nº "+(i+1)+": ");
      vector[i] = Integer.parseInt(System.console().readLine());
      
    }
    
    // presentación por pantalla del contenido del array
    System.out.println("");
    System.out.println("El contenido del array es el siguiente:");
    for (int i=0; i<tamanio; i++) {
      System.out.printf("%5d ",i);
    }
    System.out.println("");
    for (int i=0; i<tamanio; i++) {
      System.out.printf("%5d ",vector[i]);
    }
    
    System.out.println("");
    System.out.println("");
    System.out.println("El contenido del array, recorrido a la inversa, es el siguiente:");
    for (int i=tamanio-1; i>=0; i--) {
      System.out.printf("%5d ",i);
    }
    
    System.out.println("");
    for (int i=tamanio-1; i>=0; i--) {
      System.out.printf("%5d ",vector[i]);
    }
    
    // invertir array
    int aux;
    for (int i=0; i<tamanio/2; i++) {
      aux = vector[i];
      vector[i]=vector[tamanio-1-i];
      vector[tamanio-1-i]=aux;
    }
    System.out.println("");
    System.out.println("");
    System.out.println("El contenido del array, tras la inversión, es el siguiente:");
    for (int i=0; i<tamanio; i++) {
      System.out.printf("%5d ",i);
    }
    System.out.println("");
    for (int i=0; i<tamanio; i++) {
      System.out.printf("%5d ",vector[i]);
    }
    
  }
}
