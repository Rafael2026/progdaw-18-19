public class ejercicio19bis {
  public static void main (String[] args) {
    int altura;
    String simbolo;
    
    System.out.print("Dame la altura de la pirámide: ");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Escribe el carácter con el que la dibuje: ");
    simbolo = System.console().readLine();
    
    // bucle para pintar cada linea
    for (int i=1; i<=altura; i++) {
      // bucle para pintar los espacios en blanco
      for (int j=1; j<=(altura-i); j++) {
          System.out.print(" ");        
      }
      
      //bucle para pintar los caracteres de la pirámide
      for (int j=1; j<=(2*i-1); j++) {
          System.out.print(simbolo);        
      }
      
      System.out.println(""); 
    }
  }
  
}
