<%-- 
    Document   : index
    Created on : Mar 27, 2019, 5:44:36 PM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ORDENACIÓN DE IMÁGENES</title>
  </head>
  <body>
    <h1>Imágenes en el orden establecido:</h1>
    <br><p>
    <%
      int numImagen = Integer.parseInt(request.getParameter("numImagen"));
    %>
    <table border="1">
    <%
     // recarga de la secuencia establecida en el formulario
      int[] secuencia = new int[4];
      
      for (int i=0; i<4; i++) {
        int aux = Integer.parseInt(request.getParameter("posImagen"+(i+1)))-1;
        secuencia[aux] = i+1;
      }
      
      out.print("<tr>");
      for (int i=0; i<4; i++) {
       out.print("<td>");
        %>
        <img src="imagenes/conjunto<%=numImagen%>/imagen<%=secuencia[i]%>.jpg" width="100%">

        <%

        out.print("</td>");
      }
      out.print("<tr>\n");
    %>
    </table>

  </body>
</html>
