<%-- 
    Document   : TablaNumerosDigitoColor
    Created on : Feb 11, 2019, 4:40:23 PM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tabla con números coloreados según dígito</title>
  </head>
  <body>
    <h1>Tabla con números coloreados según dígito</h1>
    <table border="1">
      <tr>
      <%
        int digito = Integer.parseInt(request.getParameter("digito"));
        int longitud = Integer.parseInt(request.getParameter("longitud"));
        int limite = Integer.parseInt(request.getParameter("limite"));
        
        for (int i=1; i<=limite; i++ ) {
          boolean contieneDigito = false;
          int j = i;
          while ((j>0) && !contieneDigito) {
            if ((j%10) == digito) {
              contieneDigito = true;
            }
            j = j / 10;
          }
          out.print("<td>");
          if (contieneDigito) {
            out.print("<font color=\"#ff0000\">");
          }
          out.print(i);
          if (contieneDigito) {
            out.print("</font>");
          }
          out.print("</td>");
                  
          if ((i % longitud) == 0) {
            out.print("</tr>\n<tr>");
          }
        }


      %>
      </tr>
    </table>
  </body>
</html>
