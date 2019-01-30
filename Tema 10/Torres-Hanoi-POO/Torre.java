import java.util.ArrayList;

public class Torre {
  // Una Torre de discos -en realidad, un poste en el que apilarlos- será un ArrayList de Discos
  private ArrayList<Disco> pilaDeDiscos; 
  
  // Al crear una Torre, el ArrayList de Discos estará vacío, es decir, no tendrá Discos
  public Torre() {
    this.pilaDeDiscos = new ArrayList<Disco>();
  }
  
  // Poner un Disco en una Torre
  public void apilaDisco(Disco x) {
    this.pilaDeDiscos.add(x);
  }

  // Extraer, y devolver, un Disco de una Torre
  public Disco sacaDisco() {
    Disco resultado = this.miraDisco();
    pilaDeDiscos.remove(pilaDeDiscos.size()-1);
    return resultado;
  }
  
  // Devolver el Disco situado en la cima de la Torre
  public Disco miraDisco() {
    Disco resultado = pilaDeDiscos.get(pilaDeDiscos.size()-1);
    return resultado;
  }
  
  // Devolver el Disco situado en la posición indicada como argumento
  public Disco miraDisco (int indice) {
    // El índice que se le pase a esta función debe oscilar entre 0 y la altura de la Torre-1
    Disco resultado = pilaDeDiscos.get(indice);
    return resultado;
  }
  
  // Devolver la cantidad de Discos que tiene la Torre
  public int alturaTorre () {
    return pilaDeDiscos.size();
  }
}
