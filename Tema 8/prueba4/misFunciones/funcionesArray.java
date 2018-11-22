package misFunciones;

public class funcionesArray {  
  
  public static float calculaMedia (int[] vector2, int tama2) {
    float med = 0;
    for (int i=0; i<tama2; i++) {
      med += vector2[i];
    }
    med /= (float)tama2;
    return med;
  }
  
}
