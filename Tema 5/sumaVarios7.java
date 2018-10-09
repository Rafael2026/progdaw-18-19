public class sumaVarios7 {
  public static void main (String[] args) {
    int acumulador = 0;
    int sumando;
    int contador = 0;

    do {
      System.out.print("Introduzca el sumando (0 para terminar): ");
      sumando = Integer.parseInt(System.console().readLine());
      acumulador += sumando;
      contador ++;
    } while (sumando != 0);
    
    System.out.print("La suma de los "+(contador-1)+" números introducidos es: " + acumulador);
  }

}
