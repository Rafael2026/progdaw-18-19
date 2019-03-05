public class Ejercicio2_7 {
 public static void main(String [] args){        //Define un array de 10 caracteres con nombre simbolo y asigna valores a los
    //elementos según la tabla que se muestra a continuación. Muestra el contenido
    //de todos los elementos del array. ¿Qué sucede con los valores de los elementos
    //que no han sido inicializados?
    
    System.out.println("Vamos a mostrar caracteres");
    
    char [] simbolo = new char[10];
    
    simbolo[0]= 'A';
    simbolo[1]='X';
    simbolo[4]='@';
    simbolo[6]=' ';
    simbolo[8]='+';
    simbolo[9]='Q';
    
        System.out.print("Los numero son: ");
    
            for(int i = 0;i < 10;i++){
    
                System.out.print(simbolo[i]);
    
            }
    }
}

