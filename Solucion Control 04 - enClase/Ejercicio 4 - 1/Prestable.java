/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author tux
 */
public interface Prestable {
    
  public void prestar(); //  fijará el atributo prestado a true
  public void devolver(); // fijará el atributo prestado a false
  public boolean prestado(); // devolverá true si el objeto está prestado
  
}
