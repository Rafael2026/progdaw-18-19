/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen08.ListaEspera;
import java.util.Scanner;
/**
 *
 * @author tux
 */
public class PruebaListaEspera {
  public static void main (String[] args) {
    ListaEspera miLista = new ListaEspera();
    Scanner s = new Scanner(System.in);
    
    int opcion;
    int contadorPacientesAtendidos=0;
    do {
      System.out.println();
      System.out.println("Gestión lista espera. Elija opción:");
      System.out.println("1.- Llegada de paciente a consulta");
      System.out.println("2.- Siguiente paciente");
      System.out.println("3.- Salir.");
      System.out.println();
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
        case 1:
          System.out.println("Nombre del paciente: ");
          miLista.llegaPaciente(s.nextLine());
          break;
        case 2:
          if (miLista.cuantosQuedan()>0) {
            System.out.println("Le toca a: "+miLista.siguientePaciente());
            contadorPacientesAtendidos++;
          } else {
            System.out.println("No quedan pacientes en cola.");
          }
          
          break;
        default:
      }
      
    } while (opcion != 3);
    System.out.println("Se han atendido: "+contadorPacientesAtendidos+" pacientes.");
    System.out.println("Quedan en cola "+miLista.cuantosQuedan()+ " pacientes.");
    
  }
}
