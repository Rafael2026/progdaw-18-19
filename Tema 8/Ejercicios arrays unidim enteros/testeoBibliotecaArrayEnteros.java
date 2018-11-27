import biblioArraysOneDimEnteros.manejoArraysOneDimEnteros;


public class testeoBibliotecaArrayEnteros {
  
  static final int TAMANIO=11;
  static final int MIN_ALE=1;
  static final int MAX_ALE=20;
  
  
  public static void main (String[] args) {
    int [] arrayDeEnteros;
    
    arrayDeEnteros = manejoArraysOneDimEnteros.generaArrayInt(TAMANIO,MIN_ALE,MAX_ALE);

    for (int i=0; i<TAMANIO; i++){
      System.out.print(arrayDeEnteros[i]+", ");
    }
  
    System.out.println();
    System.out.println("El valor mínimo en el array es: "+manejoArraysOneDimEnteros.minimoArrayInt(arrayDeEnteros,TAMANIO));
    System.out.println("El valor máximo en el array es: "+manejoArraysOneDimEnteros.maximoArrayInt(arrayDeEnteros,TAMANIO));
    System.out.println("La media de los valores del array es: "+manejoArraysOneDimEnteros.mediaArrayInt(arrayDeEnteros,TAMANIO));
    for (int i=MIN_ALE; i<=MAX_ALE; i++){
      if (!manejoArraysOneDimEnteros.estaEnArrayInt(i,arrayDeEnteros,TAMANIO)) {
        System.out.println("El valor "+i+" no está en el array");
      } else {
        System.out.println("El valor "+i+" esta en la posicion "+manejoArraysOneDimEnteros.posicionEnArrayInt(i,arrayDeEnteros,TAMANIO));
      }
    }
    
    System.out.println();
    manejoArraysOneDimEnteros.volteaArrayInt(arrayDeEnteros,TAMANIO);
    for (int i=0; i<TAMANIO; i++){
      System.out.print(arrayDeEnteros[i]+", ");
    }
  
    System.out.println();
  }
}
