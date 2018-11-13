public class ejemploForEach {
  public static void main (String[] args) {
    int[] vector = new int[6];
    
    for (int i=0; i<6; i++) {
      System.out.println("Introduce un dato: ");
      vector[i]= Integer.parseInt(System.console().readLine());      
    }
    
    System.out.println();
    for (int auxiliar: vector) {
      System.out.println("Valor: "+auxiliar);
    }
  }
}
