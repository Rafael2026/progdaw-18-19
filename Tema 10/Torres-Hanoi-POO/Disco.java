public class Disco {
  private int radio=0;
  
  // Al crear un disco, habrá que indicar siempre su radio
  public Disco (int rad) {
    this.radio = rad;
  }
  
  // A un disco le podremos preguntar cuánto mide su radio
  public int getRadio () {
    return this.radio;
  }
  
  // Un disco se "pintará" en consola como una hilera de símbolos, en función de su radio
  public String toString() {
    String salida = "";
    for (int i=0; i<=this.radio*2; i++) {
      salida += "=";
    }
    return salida;      
  }
}
