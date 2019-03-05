public class Palotes {
  public static String parsePalotes (int num) {
    String resultado = "";
    if (num >=1) {
      // Cuenta los números y calcula el reves
      int aux = num;
      int numDig = 0;
      int numReves = 0;
      while (aux > 0){
        numReves = ((numReves*10) + (aux % 10));
        aux /=10;
        numDig++;
      }
      int cifra = 0;
      // Separa las cifras y escribe los palitos
      for (int i = 0; i < numDig; i++){
        cifra = numReves%10;
        numReves /= 10;
        for (int j = 0; j < cifra; j++){
          resultado += "|";
        }
        if (i < numDig-1){
          resultado += "-";
        }
      }
    }
    return resultado;
  }
  
  public static int parseInt (String num) {
    int resultado = 0;
    
    int factor = 1;
    int digito = 0;
    for (int i=num.length()-1; i>=0; i--) {
      if (num.charAt(i) == '|') {
        digito ++;
      } else if (num.charAt(i) == '-') {
        resultado += digito*factor;
        factor *=10;
        digito = 0;
      }
    }
    if (digito > 0) {
      resultado += digito*factor;
    }
    return resultado;
  }
}
