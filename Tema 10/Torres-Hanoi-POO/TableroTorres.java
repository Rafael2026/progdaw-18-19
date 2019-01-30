import java.util.ArrayList;

public class TableroTorres {
  // Un tablero consistirá en un ArrayList que tendrá 3 torres
  private ArrayList<Torre> torres;
  
  
  
  public TableroTorres (int numDiscos) {
    // Inicialmente, ArrayList de Torres vacío
    this.torres = new ArrayList<Torre>();
    
    Disco discoAuxiliar;
    Torre torreAuxiliar;
    
    int radio = numDiscos;
    
    // Creación de la primera Torre; inicialmente, sin discos
    torreAuxiliar = new Torre();
    
    // Introducción de los discos en la primera Torre
    for (int i=0; i<numDiscos; i++) {
      discoAuxiliar = new Disco(radio);
      torreAuxiliar.apilaDisco(discoAuxiliar);
      radio--;
    }
    
    // Creación  de las otras dos torres, sin discos
    this.torres.add(torreAuxiliar);
    
    for (int i=0; i<2; i++) {
      torreAuxiliar = new Torre ();
      this.torres.add(torreAuxiliar);
    }
    
  }
  
  // Implementación del movimiento de discos entre 2 postes
  public boolean intentaMover (int posteOrigen, int posteDestino) {
    boolean sePuede = true;
    
    /* el disco se podrá mover si va a parar a un poste vacío) */
    if (this.torres.get(posteOrigen-1).alturaTorre() > 0) {
      if (this.torres.get(posteDestino-1).alturaTorre() == 0) {
        Disco discoAuxiliar;
        discoAuxiliar = this.torres.get(posteOrigen-1).sacaDisco();
        this.torres.get(posteDestino-1).apilaDisco(discoAuxiliar);
      } else {
        /* hay que comprobar que va a caer sobre un disco de radio mayor */
        if (this.torres.get(posteDestino-1).miraDisco().getRadio() > this.torres.get(posteOrigen-1).miraDisco().getRadio()) {
          Disco discoAuxiliar;
          discoAuxiliar = this.torres.get(posteOrigen-1).sacaDisco();
          this.torres.get(posteDestino-1).apilaDisco(discoAuxiliar);       
        } else {
          sePuede = false;
        }
      }
    } else {
      sePuede = false;
    }
    
    return sePuede;
    
  }
  
  // Comprobación de si se ha acabado el juego
  public boolean checkHanoi () {
    boolean resuelto = false;
    if ((this.torres.get(0).alturaTorre() == 0) && (this.torres.get(1).alturaTorre() == 0)) {
      resuelto = true;
    }
    
    return resuelto;
  }
  
  // Presentación por pantalla del Tablero
  public void muestraTorres () {
    int altura = 0;
    
    for (int i=0; i<3; i++) {
      altura += this.torres.get(i).alturaTorre();
    }


    System.out.println();
    /* linea inicial de varillas */
    for (int j=0; j<3; j++) {
      for (int k=0; k<altura; k++) {
        System.out.print(" ");
      }
      System.out.print("|");
      for (int k=0; k<altura; k++) {
        System.out.print(" ");
      }
      
      for (int k=0; k<4; k++) {
        System.out.print(" ");
      }
    }
    System.out.println();
  
    
    /* cuerpo de las torres */
    for (int i=altura; i>0; i--) {
      for (int j=0; j<3; j++) {
        int radio = 0;
        if (this.torres.get(j).alturaTorre() >= i) {
          radio = this.torres.get(j).miraDisco(i-1).getRadio();
        }
        for (int k=0; k<altura-radio; k++) {
          System.out.print(" ");
        }
        if (radio==0) {
          System.out.print("|");
        } else {
          System.out.print(this.torres.get(j).miraDisco(i-1));
        }
        for (int k=0; k<altura-radio; k++) {
          System.out.print(" ");
        }
        
        for (int k=0; k<4; k++) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    /* linea final de varillas */
    for (int j=0; j<3; j++) {
      for (int k=0; k<altura; k++) {
        System.out.print("─");
      }
      System.out.print("┴");
      for (int k=0; k<altura; k++) {
        System.out.print("─");
      }
      
      for (int k=0; k<4; k++) {
        System.out.print(" ");
      }
    }
    System.out.println();
    
    /* colocación de nº de postes */
    for (int j=0; j<3; j++) {
      for (int k=0; k<altura-1; k++) {
        System.out.print(" ");
      }
      System.out.print("Pº"+(j+1));
      for (int k=0; k<altura-1; k++) {
        System.out.print(" ");
      }
      
      for (int k=0; k<4; k++) {
        System.out.print(" ");
      }
    }
    System.out.println();
    System.out.println();
  }
  
}
