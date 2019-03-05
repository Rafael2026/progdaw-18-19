public class adivinaNumero {
  public static void main (String[] args) {
    int numeroSecreto = 31;
    
    int intento;
    
    do {
      System.out.print("Dime un número: "); 
      intento = Integer.parseInt(System.console().readLine());
      
      if (numeroSecreto < intento) {
        System.out.println ("El número secreto es menor.");
      } else if (numeroSecreto > intento) {
        System.out.println ("El número secreto es mayor.");
      }     
    } while (intento != numeroSecreto);
    
    System.out.println ("Número adinvinado.");
    
    
    
  }
}
