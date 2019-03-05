public abstract class Publicacion {
  private String codigo;
  private String titulo;
  private int anioPub;
  
  public Publicacion (String codigo, String titulo, int anioPub) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.anioPub = anioPub;
  }
  
  public String getCodigo() {
    return this.codigo;
  }
  
  public int getAnioPub() {
    return this.anioPub;
  }
  
  public String toString () {
    String salida = "";
    salida += "Código: " +this.codigo+"\n";
    salida += "Título: " +this.titulo+"\n";
    salida += "Año de publicación: " +this.anioPub+"\n";
    
    return salida;
  }
}
