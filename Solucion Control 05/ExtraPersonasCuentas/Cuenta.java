/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen05.ExtraPersonasCuentas;

/**
 *
 * @author tux
 */
public class Cuenta {
  private int numeroCuenta;
  private float saldoDisponible;
  
  public Cuenta (int numCuenta, float saldoInicial) {
    this.numeroCuenta = numCuenta;
    this.saldoDisponible = saldoInicial;   
  }
  
  public float dameSaldoDisponible () {
    return this.saldoDisponible;
  }
  
  public void abono (float dineroAbonado) {
    this.saldoDisponible += dineroAbonado;
  }
  
  public void recibo (float dineroCobrado) {
    this.saldoDisponible -= dineroCobrado;
  }
  
  /*      
  public void transferencia (Cuenta cuentaOrigen, float cantidadATransferir) {
    if (cuentaOrigen.dameSaldoDisponible() >= cantidadATransferir) {
      cuentaOrigen.recibo(cantidadATransferir);
      this.saldoDisponible += cantidadATransferir;
    }
  }
  */
  
  public boolean transferencia (Cuenta cuentaOrigen, float cantidadATransferir) {
    boolean esPosible = false;
    if (cuentaOrigen.dameSaldoDisponible() >= cantidadATransferir) {
      esPosible=true;
      cuentaOrigen.recibo(cantidadATransferir);
      this.saldoDisponible += cantidadATransferir;
    }
    return esPosible;
  }
}
