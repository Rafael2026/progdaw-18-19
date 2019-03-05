public class ejercicio15 {
  public static void main (String[] args) { 
    int tamanio = 10;
    int comensalesPorMesa = 4;
    int[] mesas = new int[tamanio];
    
    // estado inicial aleatorio de ocupación de mesas
    for (int i=0; i<tamanio; i++) {
      mesas[i] = (int)(Math.random()*(comensalesPorMesa+1));
    }
    
    int grupoEntrante;
    
    do {
      // presentación del estado de ocupación
      
      System.out.print("Mesa nº:    ");
      for (int i=0; i<tamanio; i++) {
        System.out.printf("%3d",i+1);
      }
      System.out.println("");
      System.out.print("Ocupación:  ");
      for (int i=0; i<tamanio; i++) {
        System.out.printf("%3d",mesas[i]);
      }
      System.out.printf("\n\n");
      
      System.out.print("Introduzca el nº de personas del grupo: ");
      grupoEntrante = Integer.parseInt(System.console().readLine());
      if (grupoEntrante > 0) {
        if (grupoEntrante > comensalesPorMesa) {
          System.out.println("Lo siento. No admitimos grupos de "+ 
          grupoEntrante + 
          ". Haga grupos de "+comensalesPorMesa+" personas como máximo e intente de nuevo"); 
        }
        else {
          // buscar mesa vacía
          boolean grupoSentado = false;
          for (int i=0; (i<tamanio) && (grupoSentado==false); i++) {
            if (mesas[i] == 0) { // encontrada mesa vacía
              mesas[i] = grupoEntrante;
              grupoSentado = true;
              System.out.println("Por favor, siéntense en la mesa nº "+(i+1));
            }
          }
          
          // en caso de no estar sentados, buscar hueco
          if (grupoSentado==false) {
            for (int i=0; (i<tamanio) && (grupoSentado==false); i++) {
              if ((mesas[i] + grupoEntrante) <= comensalesPorMesa) { // encontrado hueco
                mesas[i] += grupoEntrante;
                grupoSentado = true;
                System.out.print("Tendrán que compartir mesa. ");
                System.out.println("Por favor, siéntense en la mesa nº "+(i+1));
              }
            }
          }
          
          // si no los hemos podido sentar, es que no hay hueco para ellos
          if (grupoSentado == false) {
            System.out.println("Lo siento, en estos momentos no queda sitio.");
          }
          
          System.out.printf("\n\n");
          
        }
      }
    } while (grupoEntrante!=-1);
    
  }
}
