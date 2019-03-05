public class Ejercicio4A {
  public static void main(String[] args) {
    Libro libro1 = new Libro("1","Titulo1",1980);
    Revista revista1 = new Revista("2","Titulo2",1981,1);
    
    System.out.println(libro1);
    libro1.prestar();
    System.out.println(libro1);
    System.out.println(revista1);
  }
}
