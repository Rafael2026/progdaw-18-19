public class Persona {
  
  public enum Sexo {
    HOMBRE, MUJER
  }
  
  
  private String nombre;
  private Sexo sexo;
  private int edad=0;
  
  public Persona (String name, Sexo sex) {
    this.nombre = name;
    this.sexo = sex;
  }
  
  public String toString(){
    String result = "";
    result += this.nombre +"\n";
    result += this.edad+ " años\n";
    result += this.sexo+"\n";
    return result;
  }
  
}
