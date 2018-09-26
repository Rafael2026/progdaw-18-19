import java.util.Scanner;

public class restaNumeros2{
  public static void main (String[] args) {
    int numero1;
    int numero2;
    int resultado;
    
    Scanner escanerEntrada = new Scanner(System.in);
    
   
    System.out.print ("Introduzca minuendo y sustraendo, separados por un espacio: ");
    //numero1 = Integer.parseInt(escanerEntrada.nextLine());
    
    numero1 = escanerEntrada.nextInt();
    numero2 = escanerEntrada.nextInt();
    
    //System.out.println ("Introduzca el primer sumando:");
    //numero2 = Integer.parseInt(escanerEntrada.nextLine());
    
    
    resultado = numero1 - numero2;
    
    System.out.printf("%d - %d = %d\n",numero1,numero2,resultado);
    
    
    
    
  }
}
