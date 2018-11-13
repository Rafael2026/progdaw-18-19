public class arrayBidimensional {
  public static void main (String[] args) {
    int[][] dosDim = new int[3][4];
    
    // rellenado interactivo del array
    for (int i=0; i<3; i++) {
      for (int j=0; j<4; j++) {
        System.out.print("Introduzca dato fila "+i+", columna "+j+": ");
        dosDim[i][j] = Integer.parseInt(System.console().readLine());
      }
    }
    
    // presentación por pantalla
    
    System.out.println("");
    for (int i=0; i<3; i++) {
      for (int j=0; j<4; j++) {
        System.out.printf("%4d",dosDim[i][j]);
      }
      System.out.println("");
    }
    
  }
}
