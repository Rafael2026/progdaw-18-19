public class JugarSudoku {
  public static void main (String[] args) {
    int estadoInic [][] = {
                            {0,5,2,4,0,0,3,0,0},
                            {0,0,0,0,0,0,7,8,6},
                            {0,0,0,3,9,0,0,0,2},
                            {4,0,0,9,8,1,0,2,7},
                            {7,0,8,6,0,0,1,0,0},
                            {0,0,1,5,0,0,0,0,0},
                            {2,0,7,8,6,0,5,9,0},
                            {0,6,0,0,0,0,0,0,0},
                            {9,0,0,0,1,0,2,0,3}
                          };
                          
    TableroSudoku miTablero = new TableroSudoku (estadoInic);
    
    System.out.println(miTablero);
    
    boolean salir = false;
    
    do {
      int fila, columna, numPropuesto;
  
      do {
        System.out.print("Indica coordenada fila (valores 1-9): ");
        fila = Integer.parseInt(System.console().readLine());
      } while (fila <1 || fila > 9);
        
      do {
        System.out.print("Indica coordenada columna (valores 1-9): ");
        columna = Integer.parseInt(System.console().readLine());
      } while (columna <1 || columna > 9);
      do {
        System.out.print("Indica número propuesto (valores 1-9; 0 borra; -1 salir): ");
        numPropuesto = Integer.parseInt(System.console().readLine());
      } while (numPropuesto <-1| numPropuesto > 9);
      if (numPropuesto == -1) {
        salir = true;
      }
      if (!salir) {
        if (!miTablero.setCasilla(numPropuesto,fila,columna)) {
          System.out.println("ERROR: Se incumple alguna regla del juego. Denegado.");
        }
        System.out.println(miTablero);
      }
    } while (!salir && !miTablero.checkJuego());
    if (miTablero.checkJuego()) {
      System.out.printf("Enhorabuena. Has completado el sudoku.");
    }
    
  }
}
