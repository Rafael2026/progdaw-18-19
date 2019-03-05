public class Perfume extends Regalo implements Vendible {
  private String aroma;
  private int anioCreacion;
  
  public Perfume (String codigo, String denominacion, double PVP, String aroma, int anioCreacion) {
    super(codigo,denominacion,PVP);
    this.aroma = aroma;
    this.anioCreacion = anioCreacion;
  }
  
  @Override
  public String toString() {
    String salida = super.toString();
    salida += "Aroma: "+this.aroma+"\n";
    salida += "Año de creación: "+this.anioCreacion+"\n";
    return salida;
  }
  
  public String getAroma() {
    return this.aroma;
  }
}
