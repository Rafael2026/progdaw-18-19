/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen06.CheckSudoku;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class CheckSudoku {
  public static void main(String[] args) {
    int[][] tableroSudoku = new int[9][9];
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca línea a línea, y separando los dígitos por espacios en blanco, el suoku:");
    for (int i=0; i<9; i++) {
      for (int j=0; j<9; j++) {
        tableroSudoku[i][j]= s.nextInt();
      }
      s.nextLine();
    }
    
    for (int i=0; i<9; i++) {
      for (int j=0; j<9; j++) {
        System.out.print(tableroSudoku[i][j]);
      }
      System.out.println();
    }
    
    boolean correcto;
    int[] conteo = new int[9];
    
    
    // repaso por filas
    correcto = true;
    for (int i=0; i<9 && correcto; i++) {
      for (int j=0; j<9; j++) {
        conteo[j]=0;
      }
      for (int j=0; j<9; j++) {
        conteo[tableroSudoku[i][j]-1]++;
      }
      for (int j=0; j<9 && correcto; j++) {
        if (conteo[j]>1) {
          correcto = false;
        }
      }
    }
    
    // repaso por columnas
    for (int i=0; i<9 && correcto; i++) {
      for (int j=0; j<9; j++) {
        conteo[j]=0;
      }
      for (int j=0; j<9; j++) {
        conteo[tableroSudoku[j][i]-1]++;
      }
      for (int j=0; j<9 && correcto; j++) {
        if (conteo[j]>1) {
          correcto = false;
        }
      }
    }
    
    //repaso por 3x3
    for (int i=0; i<3 && correcto; i++) {
      for (int j=0; j<3 && correcto; j++) {
        for (int k=0; k<9; k++) {
          conteo[k]=0;
        }
        for (int k=0; k<3 && correcto; k++) {
          for (int l=0; l<3 && correcto; l++) {
            conteo[tableroSudoku[i*3+k][j*3+l]-1]++;
          }
        }
        for (int k=0; k<9; k++) {
          if (conteo[k]>1) {
            correcto = false;
          }
        }
      }
    }
    
    if (correcto) {
      System.out.println("\nTABLERO CORRECTO");
    } else {
      System.out.println("\nTABLERO INCORRECTO");
    }
    
  }
  
}
