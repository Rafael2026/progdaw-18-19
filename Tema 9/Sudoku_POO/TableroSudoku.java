public class TableroSudoku {
  private CasillaSudoku[][] tablero = new CasillaSudoku[9][9];
    
  public TableroSudoku (int [][] estadoInicial) {
    CasillaSudoku casillaAux;
    boolean modif;
    for (int i=0; i<9; i++) {
      for (int j=0; j<9; j++) {
        if (estadoInicial[i][j] == 0) {
          modif = true;
        }
        else {
          modif = false;
        }
        casillaAux = new CasillaSudoku(estadoInicial[i][j],modif);
        this.tablero[i][j] = casillaAux;
      }
    }
  }
  
  public boolean setCasilla (int value, int fil, int col) {
    boolean resultado = false;
    
    if (fil>=1 && fil<=9 && col>=1 && col<=9) {
      int valorPrevio = tablero[fil-1][col-1].getValor();
      // valores esperados entre 0 (blanco) y 9
      if (value >=0 && value <=9) {
        if (tablero[fil-1][col-1].setValor(value)) {
          if (this.checkTablero()) {
            resultado = true;
          } else {
            this.tablero[fil-1][col-1].setValor(valorPrevio);
          }
        }
      }
    }
    return resultado;
  }
  
  public String toString () {
    String salida = " ";
    CasillaSudoku casillaAux;
    for (int i=0; i<9; i++) {
      salida += " " + (i+1);
    }
    salida += "\n";
    for (int i=0; i<9; i++) {
      if ((i)%3 == 0) {
        salida +="  ";
        for (int j=0; j<(9*2-1); j++) {
          salida += "═";
        }
        salida += "\n";
      }
      salida += (i+1);
      salida +="║";
      for (int j=0; j<9; j++) {
        String vertical = "|";
        if ((j+1)%3 == 0) {
          vertical = "║";
        }
        casillaAux = this.tablero[i][j];
        if (casillaAux.getValor() == 0) {
          salida += " "+vertical;
        } else {
          salida += casillaAux + vertical;
        }
      }
      salida += "\n";
    }
    salida +="  ";
    for (int i=0; i<(9*2-1); i++) {
      salida += "═";
    }
    salida += "\n";
    return salida;
  }
  
  public boolean checkTablero () {
    boolean correcto = true;
    CasillaSudoku auxCasilla;
    
    int[] digitos = new int[9];
    
    // barrido por filas
    for (int i=0; i<9 && correcto; i++) {
      // inicializar contadores
      for (int j=0; j<9; j++) {
        digitos[j] = 0;
      }
      // barrido de la fila
      for (int j=0; j<9; j++) {
        auxCasilla = this.tablero[i][j];
        if (auxCasilla.getValor() > 0) {
          digitos[auxCasilla.getValor()-1]++;
        }
      }
      // chequeo fila
      for (int j=0; j<9 && correcto; j++) {
        if (digitos[j] > 1) {
          correcto = false;
        }
      }
    }
    
    if (correcto) {
      // barrido por columnas
      for (int i=0; i<9 && correcto; i++) {
        // inicializar contadores
        for (int j=0; j<9; j++) {
          digitos[j] = 0;
        }
        // barrido de la columna
        for (int j=0; j<9; j++) {
          auxCasilla = this.tablero[j][i];
          if (auxCasilla.getValor() > 0) {
            digitos[auxCasilla.getValor()-1]++;
          }
        }
        // chequeo columna
        for (int j=0; j<9 && correcto; j++) {
          if (digitos[j] > 1) {
            correcto = false;
          }
        }
      }
    }
    
    
    if (correcto) {
      //chequeo grupos de 9
      for (int i=0; i<3 && correcto; i++) {
        for (int j=0; j<3 && correcto; j++) {
          // bucles para el grupo de 9
          // inicializar contadores
          for (int k=0; k<9; k++) {
            digitos[k] = 0;
          }
          // barrido grupo
          for (int k=0; k<3; k++) {
            for (int l=0; l<3; l++) {
              auxCasilla = this.tablero[i*3+k][j*3+l];
              if (auxCasilla.getValor() > 0) {
                digitos[auxCasilla.getValor()-1]++;
              }
            }
          }
          // chequeo grupo
          for (int k=0; k<9 && correcto; k++) {
            if (digitos[k] > 1) {
              correcto = false;
            }
          }
        }
      }
      
    }
    return correcto;
  }

  public boolean checkJuego () {
    boolean fin=true;
    
    if (!this.checkTablero()) {
      fin = false;
    }
    if (fin) {
      for (int i=0; i<9 && fin; i++) {
        for (int j=0; j<9 && fin; j++) {
          if (this.tablero[i][j].getValor() == 0) {
            fin = false;
          }
        }
      }
    }
    return fin;
  }
}
