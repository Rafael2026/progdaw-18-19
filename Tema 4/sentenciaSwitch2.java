public class sentenciaSwitch2 {
  public static void main(String[] args) {
    String diaIndicado;
    String diaDeLaSemana;
    
    System.out.println("Indica el día de la semana, y te digo lo que tienes a 1ª hora:");
    
    diaIndicado = System.console().readLine();
    
    
    switch (diaIndicado) {
      case "lunes":
        diaDeLaSemana = "Sistemas Informáticos";
        break;
      case "martes":
        diaDeLaSemana = "Programación";
        break;
      case "miercoles":
        diaDeLaSemana = "Entornos de desarrollo";
        break;
      default:
        diaDeLaSemana = "No tengo ni idea";
    }
    System.out.println(diaDeLaSemana);
  }
}
