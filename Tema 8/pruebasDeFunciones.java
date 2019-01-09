public class pruebasDeFunciones {

  public static void main (String[] args) {
    int a=5;
    int b;
    int c;
    
    b=doblar(suma(a,7));
    c=triplicar(b);
    
    
  }

  public static int suma (int a, int b) {
    return a+b;
  }
  
  public static int doblar (int a){
    return 2*a;
  }
  
  public static int triplicar (int a){
    return 3*a;
  }
}
