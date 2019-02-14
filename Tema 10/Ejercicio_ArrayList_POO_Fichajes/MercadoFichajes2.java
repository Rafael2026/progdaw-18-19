import java.util.ArrayList;

public class MercadoFichajes2 {
  public static void main (String[] args) {
    ArrayList<Club> torneo = new ArrayList<Club>();
    
    boolean salir = false;
    
    do {
      int opcion = Menu();
      switch (opcion) {
        case 0:
          salir = true;
          break;
        case 1:
          ListarNombresClubes(torneo);
          break;
        case 2:
          ListadoCompletoClub(torneo);
          break;
        case 3:
          CrearClub(torneo);
          break;
        case 4:
          EstablecerPresidente(torneo);
          break;
        case 5:
          CrearJugador(torneo);
          break;
        case 6:
          TraspasoDeJugador(torneo);
          break;
        case 7:
          ModificarEdadJugador(torneo);
          break;
        case 8:
          ModificarEdadPresidente(torneo);
          break;
        case 9:
          ListarJugador(torneo);
          break;
        default:
      }
    } while (!salir);
    
  }
  
  public static int Menu () {
        
    System.out.println("Elija la opción que desea: ");
    System.out.println("1.- Mostrar la lista (nombres) de clubes");
    System.out.println("2.- Listado completo de un club a partir de su nombre");
    System.out.println("3.- Crear un club");
    System.out.println("4.- Establecer el presidente de un club");
    System.out.println("5.- Crear un jugador para un club");
    System.out.println("6.- Traspasar un jugador de un club a otro");
    System.out.println("7.- Modificar la edad de un jugador a partir nombre del club y DNI del jugador");
    System.out.println("8.- Modificar la edad del presidente de un club a partir del nombre del club");
    System.out.println("9.- Listar un jugador a partir del nombre de un club y de su DNI");
    System.out.println("0.- SALIR");
    int opcion;
    do {
      opcion = Integer.parseInt(System.console().readLine());
    } while (opcion<0 || opcion >9);
    return opcion;
  }
  
  public static void ListarNombresClubes (ArrayList<Club> torneo) {
    String resultado= "\nListado de clubes:\n----------------\n\n";
    for (Club c: torneo) {
      resultado += c.getNombre()+"\n";
    }
    System.out.println(resultado);
  }
  
  public static Club BuscarClub (ArrayList<Club> torneo, String nombre) {
    Club resultado=null;
    for (Club c: torneo) {
      if (c.getNombre().equals(nombre)){
        resultado = c;
        break;
      }
    }
    return resultado;
  }
  
  public static void ListadoCompletoClub (ArrayList<Club> torneo) {
    String nombre;
    System.out.print("--> Indique el nombre del club: ");
    nombre = System.console().readLine();
    Club c = BuscarClub(torneo,nombre);
    if (c != null) {
      System.out.println(c);
    }
  }
  
  public static void CrearClub (ArrayList<Club> torneo) {
    Club aux;
    String nombreClub;
    System.out.print("--> Introduzca el nombre del NUEVO club: ");
    nombreClub = System.console().readLine();
    aux = new Club(nombreClub);
    torneo.add(aux);
  }
  
  public static void EstablecerPresidente (ArrayList<Club> torneo) {
    String nombre;
    System.out.print("--> Indique el nombre del club: ");
    nombre = System.console().readLine();
    Club aux = BuscarClub(torneo,nombre);
    Persona presi;
    
    if (aux != null) {
    
      System.out.print("--> Indique el DNI del presidente: ");
      String DNI = System.console().readLine();
      System.out.print("--> Indique el nombre para el presidente: ");
      nombre = System.console().readLine();
      
      presi = new Persona(DNI, nombre);
      aux.setPresidente(presi);    
    }
  }
  
  public static void CrearJugador (ArrayList<Club> torneo) {
    String nombre;
    System.out.print("--> Indique el club para el que desea crear el jugador: ");
    nombre = System.console().readLine();
    
    Club c = BuscarClub(torneo,nombre);
    if (c != null) {
      Jugador aux;
      String DNI;
      String nombreJugador;
      String puesto;
      System.out.print("--> Indique el DNI del nuevo jugador:");
      DNI = System.console().readLine();
      System.out.print("--> Indique el nombre del nuevo jugador:");
      nombre = System.console().readLine();
      System.out.print("--> Indique el puesto del nuevo jugador:");
      puesto = System.console().readLine();
      aux = new Jugador(DNI,nombre,puesto);
      c.aniadeJugador(aux);
    }
  }
  
  public static void TraspasoDeJugador (ArrayList<Club> torneo) {
    System.out.print("--> Indique el club desde el que desea transferir: ");
    String club1 = System.console().readLine();
    System.out.print("--> Indique el club hacia el que desea transferir: ");
    String club2 = System.console().readLine();
    System.out.print("--> Indique el DNI del jugador: ");
    String DNI = System.console().readLine();
    Club origen = BuscarClub (torneo,club1);
    Club destino = BuscarClub (torneo,club2);
    if (origen!=null && destino!=null) {
      origen.traspasaJugador(DNI,destino);
    }
  }
  
  public static void ModificarEdadJugador (ArrayList<Club> torneo) {
    System.out.print("--> Indique el club del jugador: ");
    String club1 = System.console().readLine();
    System.out.print("--> Indique el DNI del jugador: ");
    String DNI = System.console().readLine();
    Club origen = BuscarClub (torneo,club1);
    if (origen!=null) {
      Jugador j = origen.miraJugador(DNI);
      if (j != null) {
        System.out.print("--> Indique la edad: ");
        int edad = Integer.parseInt(System.console().readLine());
        j.setEdad(edad);
      }
    }
  }
  
  public static void ModificarEdadPresidente (ArrayList<Club> torneo) {
    System.out.print("--> Indique el club del presidente: ");
    String club1 = System.console().readLine();
    Club origen = BuscarClub (torneo,club1);
    if (origen!=null) {
      Persona presi = origen.getPresidente();
      System.out.print("--> Indique la edad: ");
      int edad = Integer.parseInt(System.console().readLine());
      presi.setEdad(edad);
    }
  }
  
  public static void ListarJugador (ArrayList<Club> torneo) {
    System.out.print("--> Indique el club del jugador: ");
    String club1 = System.console().readLine();
    System.out.print("--> Indique el DNI del jugador: ");
    String DNI = System.console().readLine();
    Club origen = BuscarClub (torneo,club1);
    if (origen!=null) {
      Jugador j = origen.miraJugador(DNI);
      if (j != null) {
        System.out.println(j);
      }
    }
  }
}
