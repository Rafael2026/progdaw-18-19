public class ejercicio03 {
  public static void main (String[] args) {
    System.out.print("Introducza el precio del artículo (en euros): ");
    float precio = Float.parseFloat(System.console().readLine());
    System.out.print("Indique el número de unidades: ");
    int unidades = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el código de descuento: ");
    int codigoDesc = Integer.parseInt(System.console().readLine());
    
    System.out.println("A continuación, se le muestra el precio desglosado del pedido:");
    System.out.println("------------------------------------------------");
    System.out.printf("Precio del artículo:                   %7.2f €\n",precio);
    System.out.printf("Numero de unidades:                    %4d\n",unidades);
    float precioTotalUnidades = precio * unidades;
    System.out.printf("Precio total unidades:                 %7.2f €\n",precioTotalUnidades);
    
    float descuento = cuantiaDescuento(precio,unidades,codigoDesc);
 
    if (codigoDesc == 685 || codigoDesc == 219 || codigoDesc == 778) {
      System.out.printf("Descuento aplicado: Código %3d         %7.2f €\n",codigoDesc,descuento);
    } else {
      System.out.printf("Descuento aplicado: Códido no válido      0.00 €\n");
    }
    
    System.out.printf("Precio con descuento:                  %7.2f €\n",precioTotalUnidades-descuento);
    
    float IVA = (precioTotalUnidades-descuento)*(float)0.21;
    System.out.printf("IVA (21%%):                             %7.2f €\n",IVA);
    System.out.println("------------------------------------------------");
    System.out.printf("PRECIO FINAL:                          %7.2f €\n",precioTotalUnidades-descuento+IVA);
  }
  
  
  
  
  
  
  public static float cuantiaDescuento(float precioUnid, int cantidad, int codDesc) {
    float resultado = 0;
    
    
    switch (codDesc) {
      case 685:
        if (precioUnid*cantidad >= 15) {
          resultado = 15;
        } else {
          resultado = precioUnid*cantidad;
        } 
        break;

      case 778:
        if (cantidad > 20) {
          resultado = precioUnid * (float)0.05 * 20;
        } else {
          resultado = precioUnid * (float)0.05 * cantidad;
        }
        break;

      case 219:
        if (cantidad > 5) {
          resultado = 5* precioUnid;
        }
        break;

      default:
    }
    return resultado;
  }
}
