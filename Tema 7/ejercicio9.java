public class ejercicio9 {
  static final int TAMA=10;
  public static void main (String[] args) {
    int matriz[][] = new int[TAMA][TAMA];
    
    for (int i=0; i<TAMA; i++) {
      for (int j=0; j<TAMA; j++) {
        matriz[i][j] = (int)(Math.random()*101);
      }
    }
    
    for (int i=0; i<TAMA; i++) {
      for (int j=0; j<TAMA; j++) {
        System.out.printf("%3d",matriz[i][j]);
      }
      System.out.println();
    }
    
    
    
    
    // rotaciones
    for (int k=0; k<TAMA/2; k++) {
   
      int aux = matriz[k][k];
      
      //desplazamiento columna izquierda
      for (int i=k; i<TAMA-k-1; i++) {
        matriz[i][k] = matriz[i+1][k];
      }
      
      //desplazamiento fila inferior
      for (int j=k; j<TAMA-k-1; j++) {
        matriz[TAMA-k-1][j] = matriz[TAMA-k-1][j+1];
      }
      
       //desplazamiento columna derecha
      for (int i=TAMA-k-1;i>k; i--) {
        matriz[i][TAMA-k-1] = matriz[i-1][TAMA-k-1];
      }
      
      // desplazamiento fila superior
      for (int j=TAMA-k-1; j>k+1; j--) {
        matriz[k][j] = matriz[k][j-1];
      }
      matriz[k][k+1]=aux;
      
    }

    System.out.println();
      
    for (int i=0; i<TAMA; i++) {
      for (int j=0; j<TAMA; j++) {
        System.out.printf("%3d",matriz[i][j]);
      }
      System.out.println();
    }
    
  }
}
