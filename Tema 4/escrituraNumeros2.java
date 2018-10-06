public class escrituraNumeros2 {
  public static void main(String[] args) {
      System.out.print("Introduzca un número del 0 al 99: ");
      String s = System.console().readLine();
      int numero = Integer.parseInt(s);
      
      String numeroTexto = "";
      
      
      switch (numero) {
        case 0:
          numeroTexto = "cero";
          break;
        case 11:
          numeroTexto = "once";
          break;
        case 12:
          numeroTexto = "doce";
          break;
        case 13:
          numeroTexto = "trece";
          break;
        case 14:
          numeroTexto = "catorce";
          break;
        case 15:
          numeroTexto = "quince";
          break;
         case 16:
          numeroTexto = "dieciséis";
          break;
        case 17:
          numeroTexto = "diecisiete";
          break;
        case 18:
          numeroTexto = "dieciocho";
          break;
        case 19:
          numeroTexto = "diecinueve";
          break;
        case 20:
          numeroTexto = "veinte";
          break;
        default:
          switch (numero/10) {
            case 1:
              numeroTexto = "diez";
              break;
            case 2:
              numeroTexto = "veinti";
              break;
            case 3:
              numeroTexto = "treinta";
              break;
            case 4:
              numeroTexto = "cuarenta";
              break;
            case 5:
              numeroTexto = "cincuenta";
              break;
            case 6:
              numeroTexto = "sesenta";
              break;
            case 7:
              numeroTexto = "setenta";
              break;
            case 8:
              numeroTexto = "ochenta";
              break;
            case 9:
              numeroTexto = "noventa";
              break;
          }
          if ((numero%10 !=0) && (numero>30)) {
            numeroTexto = numeroTexto + " y ";
          }
          switch (numero%10){
            case 1:
              numeroTexto = numeroTexto + "uno";
              break;
            case 2:
              numeroTexto = numeroTexto + "dos";
              break;
            case 3:
              numeroTexto = numeroTexto + "tres";
              break;
            case 4:
              numeroTexto = numeroTexto + "cuatro";
              break;
            case 5:
              numeroTexto = numeroTexto + "cinco";
              break;
            case 6:
              numeroTexto = numeroTexto + "seis";
              break;
            case 7:
              numeroTexto = numeroTexto + "siete";
              break;
            case 8:
              numeroTexto = numeroTexto + "ocho";
              break;
            case 9:
              numeroTexto = numeroTexto + "nueve";
              break;
            default:
          }
      }
      
      System.out.println(numeroTexto);
  }
  
}
