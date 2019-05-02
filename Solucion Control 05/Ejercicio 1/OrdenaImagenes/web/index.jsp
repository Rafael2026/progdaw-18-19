<%-- 
    Document   : index
    Created on : Mar 27, 2019, 5:44:36 PM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE htmlf>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ORDENACIÓN DE IMÁGENES</title>
  </head>
  <body>
    <h1>Indique la posición en la que debe ir colocada cada imagen:</h1>
    
    <br><p>
    <%
      int numImagen = (int)(Math.random()*4+1);
    %>
    <form action="visualizar.jsp">
    <input type="hidden" name="numImagen" value="<%=numImagen%>">
    <table border="1">
    <%
     // generación aleatoria de 4 números, sin repetir
     /*
      int[] secuencia = new int[4];
      
      for (int i=0; i<4; i++) {
        boolean repetido;
        do {
          secuencia[i] = (int)(Math.random()*4)+1;
          repetido = false;
          for (int j=0; j<i; j++) {
            if (secuencia[j] == secuencia[i]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
      */
      out.print("<tr>");
      for (int i=0; i<4; i++) {
        
        
        out.print("<td>");
        %>
        <img src="imagenes/conjunto<%=numImagen%>/imagen<%=(i+1)%>.jpg" width="100%">
        <br>
        <center>

        <select name="posImagen<%=i+1%>">
          <%
            for (int k=0; k<4; k++){
              %>
              <option<% if ((k+1)==(i+1)) out.print(" selected");%> value="<%=k+1%>"><%=k+1%></option>
              <%
            }
          %>
        </select>
        </center>
        <%

        out.print("</td>");
        
        
      }
      out.print("<tr>\n");
    %>
    </table>
    <input type="submit" value="ENVIAR">
    </form>
  </body>
</html>
