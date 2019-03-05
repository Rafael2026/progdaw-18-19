public class DetectarDigito {
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
      int numAux = numeros[i];
      boolean encontrado = false;
      do{
        
        int unidades = numAux % 10 ;
        numAux = numAux / 10;
        if (unidades == digito){
          encontrado = true;
        }        
      } while((numAux) >0 && (!encontrado));
      
      if (encontrado) {
        System.out.println(numeros[i]);
      }  
         
          
      
    }   
    
  }  
}
