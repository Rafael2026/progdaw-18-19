import java.util.ArrayList;
import java.util.Collections;

public class ArrayList03 {
  
  // pruebas de ordenación de arraylist de enteros
  
  public static void main (String[] args) {
    ArrayList<Persona> poblacion = new ArrayList<Persona>();
      
    Persona personaAuxiliar;
    String nombreAux;
    String apellidoAux;
    String sexoAux;
    
    for (int i=0; i<4; i++) {
        System.out.print("Dime nombre persona "+(i+1)+":" );
        nombreAux = System.console().readLine();
        System.out.print("Dime apellido persona "+(i+1)+":" );
        apellidoAux = System.console().readLine();
        /*
        System.out.print("Dime sexo persona "+(i+1)+":" );
        sexoAux = System.console().readLine();
        */
        personaAuxiliar = new Persona (nombreAux,apellidoAux);
        poblacion.add(personaAuxiliar);
    }
    
    for (Persona individuo: poblacion) {
      System.out.print (individuo +"\n");
      
    } 
    
  
  
    Collections.sort(poblacion);
    System.out.println();
    
    for (Persona individuo: poblacion) {
      System.out.print (individuo +"\n");
      
    } 
  
  }
  
}
