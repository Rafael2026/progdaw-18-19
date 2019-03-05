public class sentenciaSwitch {
  public static void main(String[] args) {
    String diaIndicado;
    
    System.out.println("Indica el día de la semana, y te digo lo que tienes a 1ª hora:");
    
    diaIndicado = System.console().readLine();
    
    if (diaIndicado.equals("lunes")) {
      System.out.println("Sistemas Informáticos");
    } else if (diaIndicado.equals("martes")) {
      System.out.println("Programación");
    } else if (diaIndicado.equals("miercoles")) {
      System.out.println("Entornos de desarrollo");
    } else {
      System.out.println("No tengo ni idea");
    }
  }
}
