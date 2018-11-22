/* Este programa cuenta el nº de letras que hay en una cadena de caracteres.
 * 
 * 
 * 
 *
 */
public class contarLetrasString {
  public static void main (String[] args) {
    String cadena;
    char[] cadenaComoArray;    // almacenará el string recogido como array
    int tamanioArray;                // almacenará la longitud del string, que será el tamaño del array de chars
    char[] carEnc = new char[100];   // almacenará los caracteres distintos que haya
    int[] frecCarEnc = new int[100];             // almacenará las veces que cada carácter aparece
    int cantCarEnc = 0;                             // almacenará la cantidad de caracteres distintos que hay
    
    // carga desde teclado el string
    System.out.println("Introduca la cadena de caracteres cuyas letras desea contar: ");
    cadena = System.console().readLine();
    
    // reserva memoria para el array de chars
    cadenaComoArray = new char[cadena.length()];
    
    // obtiene array de chars a partir de string
    tamanioArray = convCadAArray (cadena,cadenaComoArray);
    
    //inicializarFrecuencias(frecCarEnc,100);
    
    // conteo de letras
    cantCarEnc = conteoLetras(cadenaComoArray,tamanioArray,carEnc,frecCarEnc);
    
    presentarResultados (carEnc,frecCarEnc,cantCarEnc);
    
  }
  
  public static int convCadAArray (String cadena1, char[] array1) {
    int longitud = cadena1.length();
    
    for (int i=0; i<longitud; i++){
      array1[i] = cadena1.charAt(i);
    }    
    
    return longitud;
  }
  
  
  
  public static int conteoLetras (char[] arrayChars, int tama, char[] encontrados, int[] frecuencias) {
    int cuenta = 0; // cuenta los caracteres distintos que vamos encontrando
    
    for (int i=0; i<tama; i++) {
      // para cada letra del array de entrada, buscamos si está en el array encontrados
      boolean loVeo = false;
      for (int j=0; ((j<cuenta) && !loVeo); j++) {
        if (arrayChars[i] == encontrados[j]) {
          loVeo = true;
          frecuencias[j]++;
        }
      }
      if (!loVeo) {
        encontrados[cuenta] = arrayChars[i];
        frecuencias[cuenta] = 1;
        cuenta++;
      }
    }
    
    return cuenta;
  }



  
  public static void inicializarFrecuencias(int[] array, int tama) {
    for (int i=0; i<tama; i++) {
      array[i] = 0;
    }
  }
  
  public static void presentarResultados(char[] letras, int[] frecs, int tama) {
    System.out.println("Se han encontrado las siguientes letras: ");
    
    for (int i=0; i<tama; i++) {
      System.out.println("Letra: ["+letras[i]+"] ---> "+frecs[i]+" veces");
    }
  }
  
}
