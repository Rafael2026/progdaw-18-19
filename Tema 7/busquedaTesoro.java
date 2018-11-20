public class busquedaTesoro {
  static final int LIBRE = 0;
  static final int MINA = 1;
  static final int TESORO = 2;
  static final int PISADO = 3;
  public static void main (String[] args) {

    
    int[][] tablero;
    int filasTablero;
    int columnasTablero;
    int porcentajeMinas;
    int cantidadMinas;
    
    System.out.println("Juego de A LA CAZA DEL TESORO");
    System.out.println("Introduzca las dimensiones del tablero: ");
    System.out.print("   Filas: ");
    filasTablero = Integer.parseInt(System.console().readLine());
    System.out.print("   Columnas: ");
    columnasTablero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Indique el porcentaje entero de casillas que desa que oculten minas: ");
    porcentajeMinas = Integer.parseInt(System.console().readLine());
    cantidadMinas = filasTablero*columnasTablero*porcentajeMinas/100;
    
    // Reserva del tablero, rellenándolo con posiciones libres
    tablero = new int[filasTablero][columnasTablero];
    
    for (int i=0; i<filasTablero; i++) {
      for (int j=0; j<columnasTablero; j++) {
        tablero [i][j] = LIBRE;
      }
    }    
    // Inclusión del tesoro
    
    int filaElegida= (int)(Math.random()*filasTablero);
    int columnaElegida = (int)(Math.random()*columnasTablero);
    
    tablero[filaElegida][columnaElegida] = TESORO;
    
    // Inclusión de las minas
    
    int contadorMinas = 0;
    while (contadorMinas<cantidadMinas) {
      filaElegida= (int)(Math.random()*filasTablero);
      columnaElegida = (int)(Math.random()*columnasTablero);
      if ((tablero[filaElegida][columnaElegida] != TESORO) && 
      (tablero[filaElegida][columnaElegida] != MINA)) {
        tablero[filaElegida][columnaElegida] = MINA;
        contadorMinas++;
      }
    }
    
    // comienza el juego
    
    System.out.println();
    System.out.println("COMIENZA EL JUEGO:");
    System.out.println();
    
    int coordenadaFila;
    int coordenadaColumna;
    
    /*****
    // pintamos el tablero completamente descubierto
    for (int j=0; j<columnasTablero; j++) {
        System.out.print("--");
      }
      System.out.println();
      for (int i=0; i<filasTablero; i++){
        for (int j=0; j<columnasTablero; j++ ){
          switch (tablero[i][j]) {
            case PISADO:
              System.out.print("X ");
              break;
            case LIBRE:
              System.out.print("  ");
              break;
            case MINA:
              System.out.print("M ");
              break;
            case TESORO:
              System.out.print("T ");
              break;
            default:
            
          }          
        }
        System.out.println();
      }
      for (int j=0; j<columnasTablero; j++) {
        System.out.print("--");
      }
      System.out.println();
    
    
    *****/
    
    
    
    boolean salir = false;
    do {
      // pintar el tablero
      System.out.print("  ");
      for (int j=0; j<columnasTablero; j++) {
        System.out.printf("%2d",j+1);
      }
      System.out.println();
      System.out.print("  ");
      for (int j=0; j<columnasTablero; j++) {
        System.out.print("--");
      }
      System.out.println("-");
      for (int i=0; i<filasTablero; i++){
        System.out.printf("%2d|",i+1);
        for (int j=0; j<columnasTablero; j++ ){
          if (tablero[i][j] == PISADO) {
            System.out.print("X|");
          } else {
            System.out.print(" |");
          }          
        }
        System.out.println();
        System.out.print("  ");
        for (int j=0; j<columnasTablero; j++) {
          System.out.print("--");
        }
        System.out.println("-");
      }
      
      // preguntar coordenadas
      
      do {
        System.out.print("Indique fila (1-"+filasTablero+"): ");
        coordenadaFila = Integer.parseInt(System.console().readLine())-1;
      } while (!((coordenadaFila<filasTablero) && (coordenadaFila>=0)));
      do {
        System.out.print("Indique columna (1-"+columnasTablero+"): ");
        coordenadaColumna = Integer.parseInt(System.console().readLine())-1;
      } while (!((coordenadaColumna<columnasTablero) && (coordenadaColumna>=0)));
      
      switch (tablero[coordenadaFila][coordenadaColumna]) {
        case LIBRE:
          tablero [coordenadaFila][coordenadaColumna] = PISADO;
          break;
        case MINA:
          System.out.println("Lo siento, has pisado una mina.");
          salir = true;
          break;
        case TESORO:
          System.out.println("Bravo, has encontrado el tesoro.");
          salir = true;
          break;
        default:
      }
      
    } while (!salir);
    
    // pintamos el tablero completamente descubierto
    for (int j=0; j<columnasTablero; j++) {
        System.out.print("--");
      }
      System.out.println("-");
      for (int i=0; i<filasTablero; i++){
        System.out.print("|");
        for (int j=0; j<columnasTablero; j++ ){
          switch (tablero[i][j]) {
            case PISADO:
              System.out.print("X|");
              break;
            case LIBRE:
              System.out.print(" |");
              break;
            case MINA:
              System.out.print("M|");
              break;
            case TESORO:
              System.out.print("T|");
              break;
            default:
            
          }          
        }
        System.out.println();
        for (int j=0; j<columnasTablero; j++) {
          System.out.print("--");
        }
        System.out.println("-");
      }
    
  }
}
