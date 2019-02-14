public class PruebaPalotes {
  
  
  public static void main (String[] args) {
    int x;
    String conversion;
    do {
      System.out.print("Dame número :");
      x = Integer.parseInt(System.console().readLine());
      conversion = Palotes.parsePalotes(x);
    
      System.out.println("El nº "+x+" es, en formato palotes:");
      System.out.println(conversion);
      
      int reconversion = Palotes.parseInt(conversion);
      System.out.println("Al deshacer la conversión, se obtiene: "+reconversion);
    
  } while (x>1);
  }
}
