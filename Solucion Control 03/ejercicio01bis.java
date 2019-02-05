//import libreriaHanoi.*;

public class ejercicio01bis {
  
  public static void main(String[] args) {
    int numDiscos;
    
    int[][] tablero;
    
    System.out.println("JUEGO DE LAS TORRES DE HANOI");
    
    do {
      System.out.print("Introduce la cantidad de discos (2-10): ");
      numDiscos = Integer.parseInt(System.console().readLine());
    } while ((numDiscos < 2) || (numDiscos >10));
    
    tablero = inicializaPostes(numDiscos);
    
    muestraTorres(tablero);
    
    boolean quiereSalir = false;
    while ((checkHanoi(tablero)==false) && (quiereSalir == false)) {
      
      System.out.print("Introduzca desde qué poste quiere mover disco: ");
      int poste1 = Integer.parseInt(System.console().readLine());
      if (poste1 != -1) {
        System.out.print("Introduzca a qué poste quiere mover disco: ");
        int poste2 = Integer.parseInt(System.console().readLine());
        if (poste2 != -1) {
          if (intentaMover(tablero,poste1,poste2)==false) {
            System.out.println("No se ha podido realizar el movimiento.");
          }
          muestraTorres(tablero);
        } else {
          quiereSalir = true;
        }
      } else {
        quiereSalir = true;
      }
    }
    
    
  }
  
  public static int[][] inicializaPostes (int cantidadDiscos) {
    int[][] postes = new int[3][cantidadDiscos+1];
    
    postes[0][0] = cantidadDiscos;
    for (int i=1; i<=cantidadDiscos; i++) {
      postes[0][i]=cantidadDiscos-i+1;
    }
    
    for (int i=1; i<3; i++) {
      for (int j=0; j<=cantidadDiscos; j++){
        postes[i][j] = 0;
      }
    }
    return postes;
    
  }
  
  public static boolean intentaMover (int[][] palos, int origen, int destino) {
    boolean seHaPodido = false;
  
    if ((origen >= 1 && origen <=3) && (destino >=1 && destino <=3)) {
      if (palos[origen-1][0] > 0) {
        if (palos[destino-1][0] == 0) {
          palos[destino-1][0]++;
          palos[destino-1][palos[destino-1][0]] = palos[origen-1][palos[origen-1][0]];
          palos[origen-1][palos[origen-1][0]] = 0;
          palos[origen-1][0]--;
          seHaPodido = true;
        } else {
          if (palos[origen-1][palos[origen-1][0]] < palos[destino-1][palos[destino-1][0]]) {
            palos[destino-1][0]++;
            palos[destino-1][palos[destino-1][0]] = palos[origen-1][palos[origen-1][0]];
            palos[origen-1][palos[origen-1][0]] = 0;
            palos[origen-1][0]--;
            seHaPodido = true;
          }
        }
      }
    }
    return seHaPodido;
  }
  
  public static boolean checkHanoi (int[][] tabla) {
    boolean finalizado = false;
        
    if (tabla[2][0] == (tabla[2].length-1)){
      finalizado = true;
    }
    
    return finalizado;
  }
  
  public static void muestraTorres (int[][] matriz) {
    int numDiscos = matriz[0].length-1;
    
    /***/
    for (int j=0; j<3; j++) {
      for (int k=0; k<numDiscos; k++) {
            System.out.print(" ");
      }
                  
      // pintar varilla
      System.out.print("|");

      for (int k=0; k<numDiscos; k++) {
            System.out.print(" ");
      }
          
          
      System.out.print("    ");
    }
    
    /***/
    System.out.println();
    
    
    for (int i=0; i< numDiscos; i++) {
      
      
      // repetir para cada capa de varilla
      for (int j=0; j<3; j++) {
        // pintar espacios en blanco
        for (int k=0; k<numDiscos-matriz[j][numDiscos-i]; k++) {
          System.out.print(" ");
        }
                
        // pintar 1ra prte disco
        for (int k=0; k<matriz[j][numDiscos-i]; k++){
          System.out.print("=");
        }         
        
        // pintar varilla
        if (matriz[j][numDiscos-i] !=0) {
          System.out.print("=");
        } else {
          System.out.print("|");
        }
        
        // pintar 2da parte disco
        for (int k=0; k<matriz[j][numDiscos-i]; k++){
          System.out.print("=");
        }
        
        // pintar espaciosne en blanco
        for (int k=0; k<numDiscos-matriz[j][numDiscos-i]; k++) {
          System.out.print(" ");
        }
        
        System.out.print("    ");
        
      }
      
      System.out.println();
      
      
      
    }
  }
  
}
