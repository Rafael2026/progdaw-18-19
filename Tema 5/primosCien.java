public class primosCien {
  public static void main (String[] args) {
    boolean esPrimo;
    int contadorPrimos=0;
    
    for (int i=2; i<=100; i++) {
     
      esPrimo = true;
      
      for (int j=2; (j<=(i/2)) && esPrimo; j++) {
      //for (int j=2; (j<i) && esPrimo; j++) {
        if ((i%j) == 0) {
          esPrimo = false;        
        }
      }
      
      if (esPrimo) {
          System.out.println (i);
          contadorPrimos++;
      }
    }
    System.out.println("He encontrado "+contadorPrimos+" primos");
  }
}
