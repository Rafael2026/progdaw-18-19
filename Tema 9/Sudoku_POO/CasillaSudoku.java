public class CasillaSudoku {
  private int valor;
  private boolean modificable=true;
  
  public CasillaSudoku (int value, boolean changeable) {
    this.valor = value;
    this.modificable = changeable;
  }
  
  public int getValor () {
    return (this.valor);
  }
  
  public boolean setValor (int value) {
    boolean resultado = false;
    if (this.modificable == true) {
      this.valor = value;
      resultado = true;
    }
    
    return resultado;
  }
  
  public String toString () {
    String resultado = "";
    if (this.modificable == false) {
      resultado += "\033[32m" + this.valor + "\033[37m";
    }
    else {
      resultado += this.valor;
    }
    return resultado;
  }
}
