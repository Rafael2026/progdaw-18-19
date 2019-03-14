/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOrdenacion;
import java.util.Comparator;
/**
 *
 * @author tux
 */
public class ComparadorPersona implements Comparator<Persona> {
  @Override
  public int compare (Persona p1, Persona p2) {
    return p2.compareTo(p1);
  }
}
