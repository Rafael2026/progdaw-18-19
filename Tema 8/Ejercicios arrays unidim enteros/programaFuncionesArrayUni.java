public class programaFuncionesArrayUni {
  
  public static int minimoArray (int[] array) {
    int minimo = array[0];
    
    for (int i=1; i<array.length; i++) {
      if (array[i]<minimo) {
        minimo = array[i];
      }
    }
    
    return minimo;
    
  }
}
