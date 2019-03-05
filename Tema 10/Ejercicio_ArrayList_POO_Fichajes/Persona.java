public class Persona {
  private String DNI;
  private String nombre;
  private int edad=0;
  
  public Persona (String inputDNI, String inputNombre, int inputEdad) {
    this.DNI = inputDNI;
    this.nombre = inputNombre;
    this.edad = inputEdad;
  }
  
  public Persona (String inputDNI, String inputNombre) {
    this.DNI = inputDNI;
    this.nombre = inputNombre;
  }
  
  public void setEdad(int inputEdad) {
    this.edad = inputEdad;
  }
  
  public String getNombre () {
    return this.nombre;
  }
  
  public String getDNI () {
    return this.DNI;
  }
  
  public int getEdad () {
    return this.edad;
  }
  
  public String toString() {
    String resultado = "";
    resultado += "DNI: "+this.DNI+"\n";
    resultado += "Nombre: "+this.nombre+"\n";
    resultado += "Edad: "+this.edad+"\n";
    return resultado;
  }
}
