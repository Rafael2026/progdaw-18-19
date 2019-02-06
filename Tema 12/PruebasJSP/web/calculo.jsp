<%-- 
    Document   : calculo
    Created on : Feb 6, 2019, 1:07:47 PM
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
    Los valores que me han llegado son:<br>
    
    <%
      String nombreRecibido = request.getParameter("Nombre");
      int edadRecibida = Integer.parseInt(request.getParameter("Edad"));
      /*
      out.print("<h2>"+nombreRecibido+"</h2><br>");
      out.print("<h3>"+edadRecibida+"</h3>");
      */
      
      for (int i = 0; i< edadRecibida; i++) {
        out.println("<h2>"+i+"-"+nombreRecibido+"</h2><br>");
      }
    %>
    
  </body>
</html>
