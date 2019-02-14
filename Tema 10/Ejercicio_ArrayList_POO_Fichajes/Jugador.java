public class Jugador extends Persona {
  private String posicion;
  private double valor=0;
  
  public Jugador (String inputDNI, String inputNombre, int inputEdad, String inputPosicion) {
    super(inputDNI,inputNombre,inputEdad);
    this.posicion = inputPosicion;
  }
  
  public Jugador (String inputDNI, String inputNombre, String inputPosicion) {
    super(inputDNI,inputNombre);
    this.posicion = inputPosicion;
  }
  
  public void setValorDeFichaje (double inputValor) {
    this.valor = inputValor;
  }
  
  public double getValorDeFichaje () {
    return this.valor;
  }
  
  public void setPosicion (String inputPosicion) {
    this.posicion = inputPosicion;
  }
  
  public String getPosicion () {
    return this.posicion;
  }
  
  @Override
  public String toString() {
    String resultado = super.toString();
    resultado += "Posición: "+this.posicion+"\n";
    resultado += "Valor de fichaje: "+String.format("%.2f",this.valor)+"\n";
    
   
    return resultado;
  }
  
}
