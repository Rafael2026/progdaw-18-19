/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen08.Urna;

/**
 *
 * @author tux
 */
public class PruebaUrna {
  public static void main (String[] args) {
    Urna miUrna = new Urna(1,5);
    
    System.out.println("En la urna hay "+miUrna.totalBolas());
    
    while (miUrna.quedaMasDeUnaBola()) {
      String bola1 = miUrna.sacaBola();
      String bola2 = miUrna.sacaBola();
      System.out.println("Salen las bolas: " + bola1 +"-"+bola2);
      if (bola1.equals(bola2)) {
        miUrna.meteBola("negra");
        System.out.println("Como son del mismo color, se mete una negra");
      } else {
        miUrna.meteBola("blanca");
        System.out.println("Como son de distinto color, se mete una blanca");
      }
      System.out.println("En la urna hay "+miUrna.totalBolas());
    }
    
    String bolaFinal = miUrna.sacaBola();
    System.out.println("La última bola, se supone, era "+bolaFinal);
    if (!miUrna.quedanBolas()) {
      System.out.println("En efecto,ya no quedan bolas.");
    }   
    
    
  }
}
