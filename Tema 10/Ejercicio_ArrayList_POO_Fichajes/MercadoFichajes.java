public class MercadoFichajes {
  public static void main (String[] args) {
    Persona p;
    Club c;
    Jugador j;
    
    p = new Persona("123a","Persona1");
    c = new Club ("Club1");
    c.setPresidente(p);
    
    j = new Jugador("456b","Persona2","defensa");
    c.aniadeJugador(j);
    System.out.println(c);
  }
}
