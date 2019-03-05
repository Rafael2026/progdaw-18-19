public class Prenda {
  String codigo="";
  String descripcion="";
  String talla="L";
  
  public Prenda (String codigo, String descripcion) {
    this.codigo = codigo;
    this.descripcion = descripcion;
  }
  
  public String getDescripcion() {
    return this.descripcion;
  }
    
  public String toString () {
    String salida = "Código: ";
    salida += this.codigo + " -- " + this.descripcion + " -- " + this.talla;
    return salida;
  }
  
}
