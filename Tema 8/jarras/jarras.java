public class jarras {
  public static void main(String[] args) {
    int[] jarra1 = new int[2];
    jarra1[0] = 7;
    jarra1[1] = 0;
    
    
    int[] jarra2 = new int[2];
    jarra2[0] = 5;
    jarra2[1] = 0;
    
    llenar (jarra1);
    traspasar (jarra1,jarra2); // quedan 2 litros en jarra1, 5 en jarra2
    vaciar (jarra1);
    traspasar (jarra2, jarra1); // 5 en jarra1, jarra2 vacia
    llenar (jarra2); //5 litros en cada una
    traspasar (jarra2, jarra1); // sobran 3 en jarra2, jarra1 llena
    vaciar (jarra1);
    traspasar (jarra2, jarra1); // jarra1 con 3 litros, jarra2 vacia
    llenar (jarra2);
    traspasar (jarra2, jarra1); // jarra2 queda 1 litro
    
    System.out.println("Capacidad total: "+jarra2[0]);
    System.out.println("Capacidad ocupada: "+jarra2[1]);
    
  }
  
  public static void llenar (int[] jarra) {
    jarra[1] = jarra[0];
  }
  
  public static void vaciar (int[] jarra) {
    jarra[1] = 0;
  }
  
  public static void traspasar (int[] jarra1, int[] jarra2) {
    jarra2[1] += jarra1[1];
    jarra1[1] = 0;
    if (jarra2[0]<jarra2[1]) {
      jarra1[1] = jarra2[1] - jarra2[0];
      jarra2[1] = jarra2[0];
    }
  }
  
}
