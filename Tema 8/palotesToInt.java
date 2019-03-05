public class palotesToInt {
  public static void main (String[] args) {
      String captura;
      System.out.println("Convierte del sistema de representación 'palotes' a decimal.");
      System.out.print("Introduzca número en sistema 'palotes': ");
      captura = System.console().readLine();
      System.out.println("Se trata del número "+convierteEnDecimalDesdePalotes(captura));
  }

  public static int convierteEnDecimalDesdePalotes (String cadena){
    int valor = 0;
    int parcial = 0;
    
    for (int i=0; i<cadena.length(); i++) {
        switch (cadena.charAt(i)) {
          case '|':
            parcial++;
            break;
          case '-':
            valor = valor*10 + parcial;
            parcial = 0;
            break;
          default:
        }
    }
    valor = valor*10 + parcial;
    return valor;
    
  }

  
}

