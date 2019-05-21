/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dudas;

/**
 *
 * @author tux
 */
public class Matrices {
  public static void main (String[] args) {
    int [][] prueba =  {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    System.out.println("Original:");
    mostrar(prueba);
    System.out.println("Traspuesta:");
    mostrar(traspuesta(prueba));
    System.out.println("Rotacion drcha 2 pos de la original:");
    mostrar(rotarDerecha(prueba, 2));
    System.out.println("Rotacion drcha 2 pos de la original:");
    mostrar(rotarDerechaBis(prueba, 2));
    System.out.println("Rotacion drcha 2 pos, abajo 2 pos de la original:");
    mostrar(rotarAbajo(rotarDerechaBis(prueba, 2),2));
    System.out.println("Rotacion drcha 2 pos, abajo 2 pos de la original:");
    mostrar(rotarAbajoBis(rotarDerechaBis(prueba, 2),2));

    
  }
  
  public static int[][] traspuesta (int[][] matriz) {
    int [][] resultado;
    int filas, columnas;
    filas = matriz.length;
    columnas = matriz[0].length;
    
    resultado = new int[columnas][filas];

    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        resultado[j][i] = matriz[i][j];
      }
    }
    
    return resultado;
  }
  
  public static void mostrar (int[][] x) {
    for (int i=0; i<x.length; i++) {
      for (int j=0; j<x[i].length; j++) {
        System.out.print(x[i][j]+(j<(x[i].length-1)?"-":""));
      }
      System.out.println();
    }
    System.out.println();
    
  }
  
  public static int[][] rotarDerecha (int[][] x, int rotacion) {
    int[][] resultado = new int[x.length][x[0].length];
    rotacion = rotacion % x[0].length;
    for (int i=0; i<x.length; i++) {
      for (int j=0; j<x[i].length; j++) {
        resultado[i][(j+rotacion)%x[i].length] = x[i][j];
      }
    }
    
    return resultado;
  }
  
  public static int[][] rotarDerechaBis (int[][] x, int rotacion) {
    int[][] resultado;
    resultado = duplicar(x);
    
    for (int i=0; i<rotacion; i++) {
      resultado = rotarDerecha1(resultado);
    }    
    
    return resultado;
  }
  
  public static int[][] rotarDerecha1 (int x[][]) {
    int[][] resultado;
    int aux;
    resultado = duplicar(x);
    
    for (int i=0; i<resultado.length; i++) {
      aux = resultado[i][resultado[i].length-1]; 
      for (int j=resultado[i].length-1; j>0; j--) {
        resultado[i][j] = resultado[i][j-1];
      }
      resultado[i][0]=aux;
    }
    
    return resultado;
  }
  
  public static int[][] rotarAbajo (int[][] x, int rotacion) {
    int[][] resultado = new int[x.length][x[0].length];
    rotacion = rotacion % x.length;
    for (int i=0; i<x.length; i++) {
      for (int j=0; j<x[i].length; j++) {
        //resultado[i][(j+rotacion)%x[i].length] = x[i][j];
        resultado[(i+rotacion)%x.length][j] = x[i][j];
      }
    }
    
    return resultado;
  }
  
  public static int[][] rotarAbajoBis (int[][] x, int rotacion) {
    int[][] resultado = duplicar(x);
    rotacion = rotacion % x.length;
    for (int i=0; i<rotacion; i++) {
      resultado = rotarAbajo1(resultado);
    }
    
    return resultado;
  }
  
  public static int[][] rotarAbajo1 (int[][] x) {
    int[][] resultado = duplicar(x);
    int aux;
    for (int j=0; j<resultado[0].length; j++) {
      aux = resultado[resultado.length-1][j];
      for (int i=resultado.length-1; i>0;i--) {
        resultado[i][j] = x[i-1][j];
      }
      resultado[0][j] = aux;
    }
    
    return resultado;
  }
  
  public static int[][] duplicar (int[][] x) {
    int[][] resultado = new int[x.length][x[0].length];
    for (int i=0; i<x.length; i++)
      for (int j=0; j<x[i].length; j++)
        resultado[i][j]=x[i][j];
    return resultado;
  }
  
}
