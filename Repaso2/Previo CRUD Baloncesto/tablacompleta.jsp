<%-- 
    Document   : index
    Created on : Mar 19, 2019, 10:07:38 AM
    Author     : tux
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Listado de socios</title>
  </head>
  <body>
    <h1>Listado de socios:</h1>
    <table border="1">
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto","root", "rootmysql");
      Statement s = conexion.createStatement();
      
      String consulta = "SELECT * FROM socio";
      
      ResultSet listado = s.executeQuery (consulta);
      
      while (listado.next()) {
        out.println("<tr>");
        for (int i=1; i<=5; i++) {
            out.println("<td>"+listado.getString(i) + "</td>");
        }
        out.println("</tr>\n");
      } 
      
      conexion.close();

    %>   
    </table>
    
    <a href="index.html">Ir al principio</a>
    
    
  </body>
</html>
