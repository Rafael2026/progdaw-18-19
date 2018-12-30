package libreria;

public class numPerfectos {
  public static boolean divisorPropio (int candidato, int numero) {
    boolean esDivisorPropio;
    if ((candidato != numero) && ((numero % candidato) == 0)) {
      esDivisorPropio = true;
    } else {
      esDivisorPropio = false;
    }
    return esDivisorPropio;
  }
  
  public static int sumaDivisoresPropios (int numero) {
    int total = 0;
    for (int i=1; i<=numero/2; i++) {
      if (divisorPropio(i,numero)) {
        total += i;
      }
    }
    return total;
  }
  
  public static boolean numeroPerfect (int numero) {
    boolean esNumeroPerfecto;
    if (numero == sumaDivisoresPropios(numero)) {
      esNumeroPerfecto = true;
    } else {
      esNumeroPerfecto = false;
    }
    return esNumeroPerfecto;
  }
}
