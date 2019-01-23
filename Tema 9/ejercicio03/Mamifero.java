public class Mamifero extends Animal {
  private int tiempoGestacion;
  
  
  
  public Mamifero () {
    super("MACHO");
  }
  
  public Mamifero (String sex) {
    super(sex);
    this.tiempoGestacion=0;
  }
  
  public Mamifero (int tiempoGest) {
    this.tiempoGestacion = tiempoGest;
  }
  
  public Mamifero (int tiempoGest, String sex) {
    super(sex);
    this.tiempoGestacion = tiempoGest;
  }
  
  public String toString() {
    String salida = super.toString();
    salida += "\nTiempo gestación: "+this.tiempoGestacion;
    return salida;
  }
}
