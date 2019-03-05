public class adivinaIntentos {
  public static void main (String[] args) {
    int numeroSecreto = 4567;
    int maxIntentos = 5;
    int intento;
    int contador = 0;
    boolean adivinado = false;
    
    /* este programa pregunta hasta 5 veces por el número secreto, dejando de preguntar
     * si se adivina antes */
    do {
      System.out.print("Introduzca el nº secreto ("+ (maxIntentos-contador) +"): ");
      intento = Integer.parseInt(System.console().readLine());
      // comprobar si hemos adivinado el nº
      if (intento == numeroSecreto) {
          adivinado = true;
      }
      contador ++;
    } while ((adivinado == false) && (contador < maxIntentos));
    // salimos del bucle cuando no se cumpla la condición
    // es decir, cuando se haya adivinado o contador alcance el tope
  
    if (adivinado) {
      System.out.println("Número secreto adivinado.");
    } else {
      System.out.println("Agotaste los intentos y no lo adivinaste.");
    }
    
  
  
  
  }
}
