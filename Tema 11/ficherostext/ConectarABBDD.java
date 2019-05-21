/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherostext;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author tux
 */
public class ConectarABBDD {
  public static void main (String[] args) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(ConectarABBDD.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
      Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto","root","rootmysql");
      Statement s = conexion.createStatement();
      
      s.execute("create table patata (campo1 int, campo2 int);");
      conexion.close();
      
    } catch (SQLException ex) {
      Logger.getLogger(ConectarABBDD.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
  }
  
}
