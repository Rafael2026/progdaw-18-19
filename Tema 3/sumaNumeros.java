public class sumaNumeros{
  public static void main (String[] args) {
    int numero1;
    int numero2;
    int resultado;
    
    String lineaDeEntrada;
    
    System.out.println ("Introduzca el primer sumando:");
    lineaDeEntrada = System.console().readLine();
    numero1 = Integer.parseInt(lineaDeEntrada);
    
    System.out.println ("Introduzca el primer sumando:");
    lineaDeEntrada = System.console().readLine();
    numero2 = Integer.parseInt(lineaDeEntrada);
    
    
    resultado = numero1 + numero2;
    
    System.out.printf("%d + %d = %d\n",numero1,numero2,resultado);
    
    
    
    
  }
}
