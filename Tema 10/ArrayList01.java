import java.util.ArrayList;

public class ArrayList01 {
  public static void main(String[] args)  {
    ArrayList<Float> lista1 = new ArrayList<Float>();
    
    float valor;
    do {
      System.out.print("Introduzca valor decimal (0 para salir): ");
      valor = Float.parseFloat(System.console().readLine());
      if (valor != 0.0) {
        lista1.add(valor);      
      }
    } while (valor != 0.0);
    
    
    
    System.out.println("Has introducido "+lista1.size()+" valores");
    
    for (int i = 0; i< lista1.size(); i++) {
      System.out.print(lista1.get(i)+", ");
    }
    
    
    while (lista1.contains((float)4)) {
      lista1.remove((float)(4));
    }
    
    lista1.add(3,(float)9);
    
    System.out.println();
    
    for (int i = 0; i< lista1.size(); i++) {
      System.out.print(lista1.get(i)+", ");
    }
    
  }
}
