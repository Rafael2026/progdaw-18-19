<%-- 
    Document   : index
    Created on : Feb 6, 2019, 12:40:51 PM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <%
      out.println("<b>hola</b><br>");
      
      int x = (int)(Math.random()*10+1);
      
      for (int i=0; i<x; i++) {
        for (int j=1; j<=(i+1); j++ ) {
          out.print("*");
        }
        out.println("<br>");
      }
      
    %>
    
    <br>También se puede incrustar código html así: <%= x*x %>
    
    <form method="POST" action="calculo.jsp">
      Nombre: <input type="text" name="Nombre" value="" /><br>
      Edad: <input type="number" name="Edad" value="" /><br>
      <input type="submit" value="Enviar para procesar" />      
    </form>
    
  </body>
</html>
