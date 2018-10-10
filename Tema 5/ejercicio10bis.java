public class ejercicio10bis {
  public static void main (String[] args) {
    double acumulador = 0;
    double valor;
    int conteo = 0;
    double media;
    
    System.out.print("Introduce un valor (negativo para terminar): ");
    valor = Integer.parseInt(System.console().readLine());
    
    while (valor >=0) {
      acumulador += valor;
      conteo++;
      System.out.print("Introduce un valor (negativo para terminar): ");
      valor = Integer.parseInt(System.console().readLine());
    } 
    
    media = acumulador / conteo;
    System.out.println("La media de los valores introducidos es: "+media);
  
  }
}
