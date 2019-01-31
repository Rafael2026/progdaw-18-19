public class Persona implements Comparable<Persona> {
  

  
  private String nombre;
  private String apellido;
  private String sexo="";
  private int edad=0;
  
  public Persona (String name, String apell, String sex) {
    this.nombre = name;
    this.apellido = apell;
    this.sexo = sex;
  }
  
  public Persona (String name, String apell) {
    this.nombre = name;
    this.apellido = apell;
  }
  
  public String toString(){
    String result = "";
    result += this.nombre +"\n";
    result += this.apellido +"\n";
    result += this.edad+ " años\n";
    result += this.sexo+"\n";
    return result;
  }
  
  public int compareTo (Persona x) {
    int resultado;
    resultado = this.apellido.compareTo(x.apellido);
    if (resultado == 0) {
      resultado = this.nombre.compareTo(x.nombre);
    }
    return resultado;    
  }
  
}
