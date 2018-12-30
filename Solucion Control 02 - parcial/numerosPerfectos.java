import libreria.numPerfectos;

public class numerosPerfectos{
  public static void main (String[] args) {
    int valorUsuario;
    
    System.out.println("Este programa mostrará los números perfectos que hay entre 2 y el valor que introduzca.");
    do {
      System.out.print("Introduzca un valor entero superior a 2: ");
      valorUsuario = Integer.parseInt(System.console().readLine());
    } while (valorUsuario <2);
    for (int i=2; i<=valorUsuario; i++) {
      if (numPerfectos.numeroPerfect(i)) {
        System.out.println (i);
      }
    }
    
  }
}
