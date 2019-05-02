<%-- 
    Document   : presentar
    Created on : Mar 30, 2019, 12:49:29 PM
    Author     : tux
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Presentación del número en formato gráfico</title>
  </head>
  <body>
    <h1>Presentación del número en formato gráfico</h1>
    <%
        
        int numero = Integer.parseInt(request.getParameter("numero"));
    %>
    El número <%=numero%> visto como representación gráfica:<br><p><br><p><br>
    <%
      
      
      ArrayList<Integer> cifras = new ArrayList<Integer>();
      
      if (numero == 0) {
        %>
        cifras.add(0);
        <%
      } else {
        while (numero >0) {
          cifras.add(0,numero % 10);
          numero = numero /10;          
        }
        for (int n: cifras) {
          %>
          <img src="digitos/<%=n%>.png" height="80">
          <%
        }
      }
      
    %>
  </body>
</html>
