public class ProcesoMatematico {
  
  public static boolean detectarDigito (int numero, int digito) {
    boolean resultado = false;
    
    do{
        
        int unidades = numero % 10 ;
        numero = numero / 10;
        if (unidades == digito){
          resultado = true;
        }        
    } while((numero) >0 && (!resultado));
    
    
    return resultado;
  }
}
