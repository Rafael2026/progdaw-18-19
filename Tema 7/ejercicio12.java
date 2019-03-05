public class ejercicio12 {
  public static void main (String[] args) {
    int[] vector = new int[10];
    
    // petición de números por teclado
    System.out.println("Vamos a rellenar el vector:");
    for (int i = 0; i<10; i++) {
      System.out.print ("Indique valor posición "+(i+1)+": ");
      vector[i] = Integer.parseInt(System.console().readLine());
    }
    
    // mostrar el array
    System.out.println("");
    System.out.println("El vector introducido es:");
    for (int i = 0; i<10; i++) {
      System.out.printf ("%5d",i);
    }
    System.out.println("");
    for (int i = 0; i<10; i++) {
      System.out.printf ("%5d",vector[i]);
    }
    
    int posInicial;
    int posFinal;
    
    do {
      System.out.println("");
      System.out.print("Introduzca la posición \"inicial\": ");
      posInicial = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca la posición \"final\": ");
      posFinal = Integer.parseInt(System.console().readLine());
      if (!((0<=posInicial) && (posInicial<posFinal) && (posFinal <= 9))) {
        System.out.println("Datos incorrectos.");
      }
    } while (!((0<=posInicial) && (posInicial<posFinal) && (posFinal <= 9)));
    
    int aux = vector[posInicial];
    
    for (int i=posInicial; i>0; i--) {
      vector[i] = vector[i-1];      
    }
    
    // mostrar el array
    System.out.println("");
    System.out.println("El vector desplazado es:");
    for (int i = 0; i<10; i++) {
      System.out.printf ("%5d",i);
    }
    System.out.println("");
    for (int i = 0; i<10; i++) {
      System.out.printf ("%5d",vector[i]);
    }
    
  }
}
