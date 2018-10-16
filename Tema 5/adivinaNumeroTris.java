public class adivinaNumeroTris {
  public static void main (String[] args) {
    int numeroSecreto = 31;
    
    int valorInferior=0, valorSuperior=100;
    
    int intento;
    
    do {
      System.out.print("Dime un número superior a: "+valorInferior+" e inferior a:"+valorSuperior+":");
      
      intento = Integer.parseInt(System.console().readLine());
      
      if (numeroSecreto < intento) {
        if (valorSuperior > intento) {
            valorSuperior = intento;
        }
        System.out.println ("El número secreto es menor.");
      } else if (numeroSecreto > intento) {
        if (valorInferior < intento) {
            valorInferior = intento;
        }
        System.out.println ("El número secreto es mayor.");
      }     
    } while (intento != numeroSecreto);
    
    System.out.println ("Número adinvinado.");
    
    
    
  }
}
