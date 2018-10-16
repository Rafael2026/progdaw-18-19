public class adivinaNumeroBis {
  public static void main (String[] args) {
    int numeroSecreto = 31;
    
    int valorInferior=0, valorSuperior=0;
    boolean okValorInferior=false, okValorSuperior=false;
    
    int intento;
    
    do {
      System.out.print("Dime un número"); 
      if (okValorInferior) {
          System.out.print (" superior a: "+valorInferior);
      }
      if (okValorSuperior) {
          System.out.print (" inferior a: "+valorSuperior);
      }
      
      System.out.print(": ");
      
      intento = Integer.parseInt(System.console().readLine());
      
      if (numeroSecreto < intento) {
        if (okValorSuperior == false) {
            okValorSuperior = true;
            valorSuperior = intento;          
        } else if (valorSuperior > intento) {
            valorSuperior = intento;
        }
        System.out.println ("El número secreto es menor.");
      } else if (numeroSecreto > intento) {
        if (okValorInferior == false) {
            okValorInferior = true;
            valorInferior = intento;          
        } else if (valorInferior < intento) {
            valorInferior = intento;
        }
        System.out.println ("El número secreto es mayor.");
      }     
    } while (intento != numeroSecreto);
    
    System.out.println ("Número adinvinado.");
    
    
    
  }
}
