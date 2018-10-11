public class ejercicio20bis {
  public static void main (String[] args) {
    int altura;
    String simbolo;
    
    System.out.print("Dame la altura de la pirámide: ");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Escribe el carácter con el que la dibuje: ");
    simbolo = System.console().readLine();
    
       
    // bucle para pintar cada linea
    int contadorEspacios = altura - 1;
    int anchoPiramide = 1;
    
    // pinta la primera línea
    if (altura >=1) {
      // bucle para pintar los espacios en blanco
      for (int j=1; j<=contadorEspacios; j++) {
          System.out.print(" ");        
      }
      System.out.print(simbolo);
      System.out.println("");  
      contadorEspacios --;
      anchoPiramide+=2; 
    }
    
    //pintamos las lineas intermedias
    for (int i=2; i<=altura-1; i++) {
      // bucle para pintar los espacios en blanco
      for (int j=1; j<=contadorEspacios; j++) {
          System.out.print(" ");        
      }

      System.out.print(simbolo);
        
      //bucle para pintar los huecos interiores de la pirámide
      for (int j=1; j<=anchoPiramide-2; j++) {
          System.out.print(" ");        
      }
      
      System.out.print(simbolo);

      System.out.println(""); 
      contadorEspacios--;
      anchoPiramide+=2;   
    }
    
    //pintamos la última linea
    if (altura >1) {    
      for (int j=1; j<=anchoPiramide; j++) {
        System.out.print(simbolo);        
      }
    }
  }
  
}
