public class RamoFlores extends Regalo implements Vendible {
  private int numFlores;
  private String tipoFlor;
  
  public RamoFlores (String codigo, String denominacion, double PVP) {
    //super(codigo,denominacion,PVP);
    //this.numFlores = 6;
    //this.tipoFlor = "rosa";
    this(codigo,denominacion,PVP,6,"rosa");
  }
  
  public RamoFlores (String codigo, String denominacion, double PVP, int numFlores) {
    //super(codigo,denominacion,PVP);
    //this.numFlores = numFlores;
    //this.tipoFlor = "rosa";
    this(codigo,denominacion,PVP,numFlores,"rosa");
  }
  
  public RamoFlores (String codigo, String denominacion, double PVP, String tipoFlor) {
    //super(codigo,denominacion,PVP);
    //this.numFlores = 6;
    //this.tipoFlor = tipoFlor;
    this(codigo,denominacion,PVP,6,tipoFlor);
  }
  
  public RamoFlores (String codigo, String denominacion, double PVP, int numFlores, String tipoFlor) {
    super(codigo,denominacion,PVP);
    this.numFlores = numFlores;
    this.tipoFlor = tipoFlor;
  }
  
  @Override
  public String toString() {
    String salida = super.toString();
    salida += "Cantidad de flores: "+this.numFlores+"\n";
    salida += "Variedad: "+this.tipoFlor+"\n";
    return salida;
  }
  
  public int getNumFlores() {
    return this.numFlores;
  }
 
  public String getTipoFlor() {
    return this.tipoFlor;
  }
}
