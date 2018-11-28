public class alfil {
  public static void main (String[] args) {
    int [][] tablero = new int[8][8];

    // inicializar el tablero
    
    for (int i=0; i<8; i++) {
      for (int j=0; j<8; j++) {
        tablero[i][j] = 0;
      }
    }
    
    // vamos a señalar en el tablero la posición del usuario
    System.out.println("Idncia coordenadas del alfil: ");
    String coordenada = System.console().readLine();
    int filAlfil;
    int colAlfil;
    
    filAlfil = coordenada.charAt(1)-'0';
    filAlfil = 8 - filAlfil;
    
    colAlfil = coordenada.charAt(0)-'a';
    
    // posicionar el alfil
    tablero[filAlfil][colAlfil] = 1;
    
    int i=filAlfil-1;
    int j=colAlfil-1;
    while ((i>=0) && (j>=0)) {
        tablero[i][j] = 2;
        i--;
        j--;
    }
    
    i=filAlfil-1;
    j=colAlfil+1;
    while ((i>=0) && (j<8)) {
        tablero[i][j] = 2;
        i--;
        j++;
    }
    
    i=filAlfil+1;
    j=colAlfil+1;
    while ((i<8) && (j<8)) {
        tablero[i][j] = 2;
        i++;
        j++;
    }
  
    i=filAlfil+1;
    j=colAlfil-1;
    while ((i<8) && (j>=0)) {
        tablero[i][j] = 2;
        i++;
        j--;
    }
    
    // presentar las coordenadas
    for (i=7; i>=0; i--) {
      for (j=0; j<8; j++) {
        if (tablero[i][j]==2) {
          System.out.print((char)('a'+j));
          System.out.print(8-i);
          System.out.print(" ");
        }
      }
    }
  
  }
}
