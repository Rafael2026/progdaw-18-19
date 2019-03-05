public class usoTipoEnumerado {
  
  public static void main (String[] args) {
    
    Persona.Sexo S = Persona.Sexo.HOMBRE;
    
    Persona X = new Persona("Pepito",Persona.Sexo.HOMBRE);
    
    System.out.println (X);
    
  }
  
}
