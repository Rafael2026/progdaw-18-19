public class programaManipulaArray {
  public static void main (String[] args) {
    int[] array;
    
    int tama = pedirTamanioArray();
    array = generaArrayRelleno(tama);
    //array = generaArrayRelleno(pedirTamanioArray());
    presentaPorPantalla(array);
  }
  
  public static int pedirTamanioArray() {
    System.out.print("Introduce el tamaño del array: ");
    int tamanio = Integer.parseInt(System.console().readLine());
    return tamanio;
  }
  
  public static int[] generaArrayRelleno(int tope) {
    int[] arrayAux;
    arrayAux = new int[tope];
    for (int i=0; i<tope; i++) {
      arrayAux[i] = (int)(Math.random()*10)+1; 
    }
    return arrayAux;
  }
  
  public static void presentaPorPantalla (int [] array) {
    System.out.println();
    for (int i=0; i<array.length; i++) {
      System.out.print(array[i]+", ");
    }
  }
}
