public class prueba1 {

  public static void main (String[] args) {
    int[] elementos = new int[6];
    
    // pedir datos por teclado
    for (int i=0; i<6; i++) {
      System.out.print("Valor posicion "+i+": ");
      elementos[i] = Integer.parseInt(System.console().readLine());
    }
    
    // presentar los valores por pantalla
    System.out.println();
    System.out.print("Valores introducidos: ");
    mostrarArray(elementos);
    /*
    for (int i=0; i<6; i++) {
      System.out.print(elementos[i]);
      if (i<5) {
        System.out.print(", ");
      }
    }
    */
    
    // calcular la media
    
    float media = 0;
    for (int i=0; i<6; i++) {
      media += elementos[i];
    }
    media /= 6.0;
    
    System.out.println();
    System.out.print("La media de los valores ");
    mostrarArray(elementos);
    /*
    for (int i=0; i<6; i++) {
      System.out.print(elementos[i]);
      if (i<5) {
        System.out.print(", ");
      }
    }
    */
    System.out.print(" es: "+media);
    
  }
  
  /* FUNCIONES */
  
  public static void mostrarArray (int[] vector) {
    for (int i=0; i<6; i++) {
      System.out.print(vector[i]);
      if (i<5) {
        System.out.print(", ");
      }
    }
    
  }
  
}
