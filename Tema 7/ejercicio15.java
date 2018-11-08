public class ejercicio15 {
  public static void main (String[] args) { 
    int tamanio = 10;
    int[] mesas = new int[tamanio];
    
    // estado inicial aleatorio de ocupación de mesas
    for (int i=0; i<tamanio; i++) {
      mesas[i] = (int)(Math.random()*5);
    }
    
    int grupoEntrante;
    
    do {
      System.out.print("Introduzca el nº de personas del grupo: ");
      grupoEntrante = Integer.parseInt(System.console().readLine());
      if (grupoEntrante != -1) {
        if (grupoEntrante > 4) {
          System.out.println("Lo siento. No admitimos grupos de "+ 
          grupoEntrante + 
          ". Haga grupos de 4 personas como máximo e intente de nuevo"); 
        }
        else {
          // buscar mesa vacía
          boolean grupoSentado = false;
          for (int i=0; i<tamanio; i++) {
            if (mesas[i] == 0) { // encontrada mesa vacía
              mesas[i] = grupoEntrante;
              grupoSentado = true;
              System.out.println("Por favor, siéntense en la mesa nº "+(i+1));
              // forzar la finalización del bucle
              i = tamanio;
            }
          }
          
          // en caso de no estar sentados, buscar hueco
          
          
        }
      }
    } while (grupoEntrante!=-1);
    
  }
}
