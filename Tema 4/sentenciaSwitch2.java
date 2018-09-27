public class sentenciaSwitch2 {
  public static void main(String[] args) {
    String diaIndicado;
    
    System.out.println("Indica el día de la semana, y te digo lo que tienes a 1ª hora:");
    
    diaIndicado = System.console().readLine();
    
    switch (diaIndicado) {
      case "lunes":
        System.out.println("Sistemas Informáticos");
        break;
      case "martes":
        System.out.println("Programación");
        break;
      case "miercoles":
        System.out.println("Entornos de desarrollo");
        break;
      default:
        System.out.println("No tengo ni idea");
    }
  }
}
