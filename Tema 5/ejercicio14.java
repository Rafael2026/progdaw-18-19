public class ejercicio14 {
  public static void main (String[] args) {
    int base;
    int exponente;
    int solucion=1;
        
    System.out.print("Introduzca la base (entera): ");
    base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente (entero): ");
    exponente = Integer.parseInt(System.console().readLine());

    for (int i=1; i<=exponente; i++) {
      //solucion = solucion * base;
      solucion *= base;
    }
    System.out.println("El resultado de "+base+"^"+exponente+" es: "+solucion);
  }
}
