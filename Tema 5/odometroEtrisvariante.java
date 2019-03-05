// Hacer un programa que nos muestre los números del 0-0-0 al 9-9-9, sustituyendo cada dígito "3" por la letra "E"

public class odometroEtrisvariante { 

  public static void main(String[] args){

    int cont1 = 0;
    int proceso;
    int potencia10;
  
    for ( cont1 = 0; cont1 <= 999 ; cont1++){
      proceso = cont1;
      potencia10 = 1000;
      do {
        proceso = cont1 % potencia10;
        if ((proceso/(potencia10/10)) == 3) {
          System.out.print("E");
        } else {
          System.out.print(proceso/(potencia10/10));
        }
        potencia10 /=10;
        if (potencia10 !=1) {
          System.out.print("-");
        }
      } while (potencia10 != 1);
      
      System.out.print("   ");
      if (((cont1+1)%10) == 0) {
        System.out.println("");
      }
    }
  }
}   

