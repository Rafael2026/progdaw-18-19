public class pruebas3 {
  public static void main (String[] args) {
    String hola = "123";
    
    char caracter = hola.charAt(0);
    
    int numero = Integer.parseInt(""+caracter+"");
    
    int numero2 = hola.charAt(0);
    
    System.out.printf("--> %c --> %d --> %d",caracter,numero,numero2);
    
    
  
  }
}
