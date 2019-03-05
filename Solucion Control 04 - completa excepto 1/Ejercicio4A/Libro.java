public class Libro extends Publicacion implements Prestable{
  private boolean prestado = false;
  
  public Libro (String codigo, String titulo, int anioPub) {
    super(codigo,titulo,anioPub);
    this.prestado = false;
  }
  
  @Override
  public String toString () {
    String salida = super.toString();
    if (prestado) {
      salida += "Estado de prestado: SI\n";
    } else {
      salida += "Estado de prestado: NO\n";
    }
    return salida;
  }
  
  public void prestar() {
    this.prestado = true;
  }
  
  public void devolver() {
    this.prestado = false;
  }
  
  public boolean prestado() {
    return this.prestado;
  }
}
