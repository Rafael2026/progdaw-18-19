package ejerciciosDudas;
import java.util.Scanner;
public class Restaurante
{
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int array[] = new int [10];
        int numeroPersonas = 0;
        boolean colocado = false;
        
        do {
          System.out.print("¿Cuántas personas sois? ");
          numeroPersonas = s.nextInt();
          
          if (numeroPersonas > 4 ) {
            System.out.print("El numero de personas debe ser como maximo 4 por mesa, haga grupos de como maximo 4 personas");
                    
          } else if (numeroPersonas > 0){
            colocado = false;
            // primera opción: buscar una mesa vacía
            for(int i = 0; (i < 10) && !colocado; i++) {
               
                if(array[i]== 0) {
                    array[i] = numeroPersonas;
                    colocado = true;
                }
            }
            
            //segunda opcion; bucar un hueco, si es que no están colocados ya
            if (!colocado) {
              for(int i = 0; (i < 10) && !colocado; i++) {
               
                if((array[i]+numeroPersonas)<= 4) {
                    array[i] += numeroPersonas;
                    colocado = true;
                }
              }
            }  
            
            // se puede informar de si no se han colocado
            
            if (!colocado) {
              System.out.println("No hay sitio.");
              
              
            }
                    
            for(int j = 0; j < 10;j++) {
                        System.out.print(" "+array[j]);
            }        
            
          }
        }while ((numeroPersonas != -1));
        
    }
}