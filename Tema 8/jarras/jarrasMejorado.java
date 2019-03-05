public class jarrasMejorado { 
  
  public static void main(String[] args) { 
    int[] jarra1 = new int[2];
    jarra1[0] = 7;
    jarra1[1] = 0;

    int[] jarra2 = new int[2];
    jarra2[0] = 5;
    jarra2[1] = 0;

    System.out.println("El acertijo de las jarras.");
    System.out.println();
    System.out.println("Consite en obtener, a base de llenar, vaciar y traspasar agua entre jarras,");
    System.out.println("una jarra con un litro de agua.");
    System.out.println();
    System.out.println("Dispone de 2 jarras:\n");

    presentar(jarra1);
    presentar(jarra2);

    int opcion = 0;

    System.out.println();

    do
    {
      System.out.println("Indique la opción que desea:");
      System.out.println("0 - SALIR");
      System.out.println("1 - Llenar jarra 1 (" + jarra1[0] + " litros)");
      System.out.println("2 - Llenar jarra 2 (" + jarra2[0] + " litros)");
      System.out.println("3 - Vaciar jarra 1 (" + jarra1[0] + " litros)");
      System.out.println("4 - Vaciar jarra 2 (" + jarra2[0] + " litros)");
      System.out.println("5 - Traspasar jarra 1 (" + jarra1[0] + " litros) a jarra 2 (" + jarra2[0] + " litros)");
      System.out.println("6 - Traspasar jarra 2 (" + jarra2[0] + " litros) a jarra 1 (" + jarra1[0] + " litros)");
      System.out.print("---> ");
      opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1: 
          llenar(jarra1);
          break;
        case 2: 
          llenar(jarra2);
          break;
        case 3: 
          vaciar(jarra1);
          break;
        case 4: 
          vaciar(jarra2);
          break;
        case 5: 
          traspasar(jarra1, jarra2);
          break;
        case 6: 
          traspasar(jarra2, jarra1);
          break;
        default:
      }

      if (opcion != 0) {
        System.out.println();
        presentar(jarra1);
        presentar(jarra2);
        System.out.println();

        if ((jarra1[1] == 1) || (jarra2[1] == 1)) {
          System.out.println();
          System.out.println("¡¡CONSEGUIDO!!");
          opcion = 0; // fuerzo la salida
        }
      }
    } while (opcion != 0);

  }

  



  public static void llenar(int[] jarra)
  {
    jarra[1] = jarra[0];
  }

  public static void vaciar(int[] jarra) {
    jarra[1] = 0;
  }

  public static void traspasar(int[] jarra1, int[] jarra2) {
    jarra2[1] += jarra1[1];
    jarra1[1] = 0;
    if (jarra2[0] < jarra2[1]) {
      jarra1[1] = jarra2[1] - jarra2[0];
      jarra2[1] = jarra2[0];
    }
  }

  public static void presentar(int[] jarra) {
    System.out.println("La jarra de " + jarra[0] + " litros contiene actualmente: " + jarra[1] + " litros.");
  }

}


