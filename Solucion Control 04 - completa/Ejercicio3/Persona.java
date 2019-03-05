public class Persona {
  String DNI="";
  String nombre="";
  
  public Persona (String DNI, String nombre) {
    this.DNI = DNI;
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public String toString () {
    String salida = "DNI: ";
    salida += this.DNI + " -- " + this.nombre;
    return salida;
  }
  
}
