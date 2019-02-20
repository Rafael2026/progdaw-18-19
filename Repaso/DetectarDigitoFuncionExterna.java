public class DetectarDigitoFuncionExterna {
  
  public static void main(String[] args) {
    int[] numeros = new int[10];
    int digito;
    
    for (int i=0; i<10; i++) {
      System.out.print("Introduzca valor posición "+i+": ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.print("Introduzca el dígito que quiere detectar: ");
    digito = Integer.parseInt(System.console().readLine());
    
    for (int i=0; i<10; i++) {
      if (ProcesoMatematico.detectarDigito(numeros[i],digito)) {
        System.out.println(numeros[i]);
      }  
    }   
    
  }
  
  
  
}
