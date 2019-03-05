public class ejercicio10 {
  public static void main (String[] args) {
    double acumulador = 0;
    double valor;
    int conteo = 0;
    double media;
    
    do {
        System.out.print("Introduce un valor (negativo para terminar): ");
        valor = Integer.parseInt(System.console().readLine());
        if (valor >=0) {
            acumulador += valor;
            conteo++;
        }
    } while (valor >= 0);
    
    media = acumulador / conteo;
    System.out.println("La media de los valores introducidos es: "+media);
  
  }
}
