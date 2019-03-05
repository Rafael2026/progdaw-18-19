public class sumaVarios {
  public static void main (String[] args) {
    int acumulador = 0;
    int sumando;
    
    System.out.print("Introduzca el nº de números que quiere sumar: ");
    int numSumandos = Integer.parseInt(System.console().readLine());
    
    //for (int i=1; i<=numSumandos; i++) {
    for (int i=0; i<numSumandos; i++) {
      System.out.print("Introduzca el sumando nº " + (i+1) +": ");
      sumando = Integer.parseInt(System.console().readLine());
      acumulador += sumando;
    
    }
    System.out.print("La suma de los " + numSumandos + "números introducidos es: " + acumulador);
  }

}
