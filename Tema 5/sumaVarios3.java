public class sumaVarios2 {
  public static void main (String[] args) {
    int acumulador = 0;
    int sumando;
    

    do {
      System.out.print("Introduzca el sumando (1 para terminar): ");
      sumando = Integer.parseInt(System.console().readLine());
      if (sumando != 1) {
        acumulador += sumando;
      }      
    } while (sumando != 1);
    
    System.out.print("La suma de los números introducidos es: " + acumulador);
  }

}
