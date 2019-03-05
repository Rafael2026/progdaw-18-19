public class ejercicio02b {
  public static void main (String[] args) {
    int[] patata = {7,87,752,67,77,47,675,675,7812};
    int[] sinSietes = filtraSin7 (patata);
    
    for (int i=0; i<sinSietes.length; i++) {
      System.out.print(sinSietes[i]+",");
    }
    
  }
  
  public static int[] filtraSin7 (int vector[]) {
    int [] resultado = {};
    
    for (int i=0; i<vector.length; i++)  {
      if (tieneDigito7(vector[i]) == false) {
        resultado = extenderArrayEnteros(resultado,vector[i]);
      }
    }
    
    if (resultado.length == 0) {
      resultado = new int[1];
      resultado[0] = -1;
    }
    
    return resultado;
  }
  
  public static int[] extenderArrayEnteros (int[] v, int numero) {
    int[] nuevoArray = new int[v.length+1];
    
    for (int i=0; i<v.length; i++ ) {
      nuevoArray[i] = v[i];
    }
    nuevoArray[nuevoArray.length-1] = numero;
    return nuevoArray;
  }
  
  
  public static boolean tieneDigito7 (int x){
    boolean encontrado = false;
    while (x != 0) {
      int digito = unidades (x);
      if (digito == 7) {
        encontrado = true;
      }
      x = quitaUnidades(x);
    }
    return encontrado;
  }
  
  public static int unidades (int x) {
    return ((int)(x % 10));
  }
  
  public static int quitaUnidades (int x) {
    return (x / 10);
  }
}


