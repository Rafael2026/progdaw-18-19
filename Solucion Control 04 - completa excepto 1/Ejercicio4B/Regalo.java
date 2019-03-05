public abstract class Regalo implements Vendible {
  private String codigo;
  private String denominacion;
  private double PVP;
  
  public Regalo (String codigo, String denominacion, double PVP) {
    this.codigo = codigo;
    this.denominacion = denominacion;
    this.PVP = PVP;
  }
  
  public String toString() {
    String salida = "";
    salida += "Código: "+this.codigo+"\n";
    salida += "Denominacion: "+this.denominacion+"\n";
    salida += "PVP: "+this.PVP+"\n";
    return salida;
  }
  
  public double precio() {
    return this.precio();
  }
  
  public void fijarPrecio (double precio) {
    this.PVP = precio;
  }
}
