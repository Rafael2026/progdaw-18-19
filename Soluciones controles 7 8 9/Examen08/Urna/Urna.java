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
public class Urna {
  private int blancas;
  private int negras;
  
  public Urna (int blancas, int negras){
    this.blancas = blancas;
    this.negras = negras;
  }
  
  public String sacaBola () {
    int bolaElegida = (int)(Math.random()*(blancas+negras))+1;
    if (bolaElegida <= this.blancas) {
      this.blancas--;
      return "blanca";
    } else if (this.negras>0){
      this.negras--;
      return "negra";
    } else {
      return "";
    }
  }
  
  public void meteBola (String color) {
    if (color.equals("blanca")) {
      this.blancas++;
    } else if (color.equals("negra")) {
      this.negras++;
    }
  }
  
  public boolean quedanBolas() {
    if (this.totalBolas()>0) {
      return true;
    }
    return false;
  }
  
  public boolean quedaMasDeUnaBola() {
    if (this.totalBolas()>1) {
      return true;
    }
    return false;
  }
  
  public int totalBolas() {
    return (this.blancas+this.negras);
  }
}
