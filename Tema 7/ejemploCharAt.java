public class ejemploCharAt {
  public static void main (String[] args) {
    String cadenaDeCaracteres;
    
    System.out.print("Introduzca una cadena de caracteres: ");  
    cadenaDeCaracteres = System.console().readLine();
    
    for (int i = 0; i< cadenaDeCaracteres.length(); i++) {
      System.out.printf("La posición %d de la cadena contiene el carácter: %c\n",i,cadenaDeCaracteres.charAt(i));
    }
  
  }

}
