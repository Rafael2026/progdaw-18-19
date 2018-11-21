public class pruebasDetectar {
  public static void main(String[] args){
    int[] numeros = new int[5];
    int valorUsuario;
    
    for (int i=0; i<5; i++) {
      System.out.println("Introduce valor "+i+":" );
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    boolean salir = false;
    
    do {
      
      System.out.println("Introduce valor: ");
      valorUsuario = Integer.parseInt(System.console().readLine());
      
      // veamos si está
      boolean encontrado = false;
      
      for (int i=0; (i<5)&&(!encontrado); i++){
        if (valorUsuario == numeros[i]) {
          encontrado = true;
        }
      }
      
      if (encontrado) {
        System.out.println("Lo veo");
      } else {
        System.out.println("No lo veo");
      }
      
      if (valorUsuario==0) {
        salir = true;
      }
      
    } while (!salir);
    
    
    
  }
}
