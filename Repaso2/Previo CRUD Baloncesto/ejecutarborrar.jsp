<%-- 
    Document   : ejecutaraniadir
    Created on : Mar 19, 2019, 7:57:23 PM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Grabando datos</title>
  </head>
  <body>
    <%
      
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/baloncesto","root", "rootmysql");
      Statement s = conexion.createStatement();
      
      int socioID = Integer.parseInt(request.getParameter("socioID"));
      
      
      s.execute ("DELETE FROM socio WHERE socioID="+socioID);

      conexion.close();
      
    %>
    Socio borrado. Ir a <a href="index.html">inicio</a>
  </body>
</html>
