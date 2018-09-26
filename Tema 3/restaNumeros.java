import java.util.Scanner;

public class restaNumeros{
  public static void main (String[] args) {
    int numero1;
    int numero2;
    int resultado;
    
    Scanner escanerEntrada = new Scanner(System.in);
    
   
    System.out.println ("Introduzca el primer sumando:");
    numero1 = Integer.parseInt(escanerEntrada.nextLine());
    
    //numero1 = escanerEntrada.nextInt();
    
    System.out.println ("Introduzca el primer sumando:");
    numero2 = Integer.parseInt(escanerEntrada.nextLine());
    
    
    resultado = numero1 - numero2;
    
    System.out.printf("%d - %d = %d\n",numero1,numero2,resultado);
    
    
    
    
  }
}
