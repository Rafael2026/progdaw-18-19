import java.util.ArrayList;

public class Club {
  private String nombre;
  private ArrayList<Jugador> plantilla;
  private Persona presidente=null;
  
  public Club (String inputNombre) {
    this.nombre=inputNombre;
    plantilla = new ArrayList<Jugador>();
  }
  
  public void setPresidente (Persona inputPresidente) {
    this.presidente = inputPresidente;
  }
  
  public Persona getPresidente () {
    return this.presidente;
  }
  
  public String getNombre () {
    return this.nombre;
  }
  
  public void aniadeJugador (Jugador inputJugador) {
    this.plantilla.add(inputJugador);
  }
  
  public Jugador miraJugador (String DNI) {
    Jugador resultado=null;
    for (int i=0; i<plantilla.size(); i++) {
      if (plantilla.get(i).getDNI().equals(DNI)) {
        resultado = plantilla.get(i);
      }
    }
    
    return resultado;
  }
  
  public Jugador extraeJugador (String DNI) {
    Jugador resultado = this.miraJugador(DNI);
    this.plantilla.remove(resultado);
    return resultado;
  }
  
  public void traspasaJugador (String DNI, Club Destino) {
    Destino.aniadeJugador (this.extraeJugador(DNI));
  }
  
  public String toString () {
    String resultado = "\nClub: "+this.nombre+"\n";
    resultado +="-----------------------\n\n";
    if (this.presidente != null) {
      resultado +="Presidente: \n\n"+ this.presidente;
      resultado +="-----------------------\n\n";
    }
    resultado +="Jugadores: \n\n";
    for (Jugador x : this.plantilla) {
      resultado += x+"\n";
    }
    return resultado;
  }
  
}
