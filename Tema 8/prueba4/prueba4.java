import misFunciones.funcionesArray;

public class prueba4 {

  public static void main (String[] args) {
    int tamanio;
    int[] elementos;
    
    // pedir tamaño array
    System.out.println("Indica la cantidad de elementos: ");
    tamanio = Integer.parseInt(System.console().readLine());
    
    // reserva del espacio de memoria para el array
    elementos = new int[tamanio];
    
    // pedir datos por teclado
    for (int i=0; i<tamanio; i++) {
      System.out.print("Valor posicion "+i+": ");
      elementos[i] = Integer.parseInt(System.console().readLine());
    }
    
    // presentar los valores por pantalla
    System.out.println();
    System.out.print("Valores introducidos: ");
    
    mostrarArray(elementos,tamanio);
    
   
    System.out.println();
    System.out.print("La media de los valores ");
    mostrarArray(elementos,tamanio);

    System.out.print(" es: " + misFunciones.funcionesArray.calculaMedia (elementos,tamanio));
    
  }
  
  /* FUNCIONES */
  
  public static void mostrarArray (int[] vector, int tama) {
    for (int i=0; i<tama; i++) {
      System.out.print(vector[i]);
      if (i<(tama-1)) {
        System.out.print(", ");
      }
    }
    
  }
  
}
