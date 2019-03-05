public class Revista extends Publicacion {
  private int numero;
  
  public Revista (String codigo, String titulo, int anioPub, int numero) {
    super(codigo,titulo,anioPub);
    this.numero = numero;
  }
  
  @Override
  public String toString () {
    String salida = super.toString();
    salida += "Número: " +this.numero+"\n";
    return salida;
  }
}
