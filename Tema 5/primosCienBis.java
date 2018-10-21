public class primosCienBis {
  public static void main (String[] args) {
    boolean esPrimo;
    int contadorPrimos=1;
    

    System.out.println (2);    
    
    for (int i=3; i<=100; i+=2) {
      esPrimo = true;     
      for (int j=3; (j<=(i/2)) && esPrimo; j+=2) {
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
