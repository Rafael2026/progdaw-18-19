// Hacer un programa que nos muestre los números del 0-0-0 al 9-9-9, sustituyendo cada dígito "3" por la letra "E"

public class odometroEtris { 

  public static void main(String[] args){

    int cont1 = 0;
    int proceso;
  
    for ( cont1 = 0; cont1 <= 999 ; cont1++){
      proceso = cont1;
      if ((proceso/100) == 3) {
        System.out.print("E");
      } else {
        System.out.print(proceso/100);
      }
      proceso = cont1 % 100;
      if ((proceso/10) == 3) {
        System.out.print("-E");
      } else {
        System.out.print("-"+proceso/10);
      }
      proceso = proceso % 10;
      if (proceso == 3) {
        System.out.print("-E");
      } else {
        System.out.print("-"+proceso);
      }
      System.out.print("   ");
      if (((cont1+1)%10) == 0) {
        System.out.println("");
      }
    }
  }
}   

