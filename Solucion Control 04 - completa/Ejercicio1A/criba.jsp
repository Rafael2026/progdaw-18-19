<%-- 
    Document   : criba.jsp
    Created on : Feb 11, 2019, 4:13:33 PM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultado Criba</title>
  </head>
  <body>
    <h1>Resultado criba:</h1>
    <table>
      <tr>
      <%
        
        
        int contador = Integer.parseInt(request.getParameter("limite"));
        String color = request.getParameter("color");
        String color2 = "";
        
        if (color.equals("rojo")) {
          color2 = "#FF0000";
        } else if (color.equals("verde")) {
          color2 = "#00FF00";
        } else if (color.equals("blue")) {
          color2 = "#0000FF";
        }
        
        String color3 = "#777777";
        
        for (int i=1; i<=contador; i++ ) {
          boolean esPrimo = true;
          for (int j=2; (j<=(i/2) && esPrimo); j++) {
            if (i % j == 0) {
              esPrimo = false;
            }
          }
          out.print("<td bgcolor=\"");
          if (esPrimo) {
            out.print(color2);
          } else {
            out.print(color3);
          }
          out.print("\">"+i+"</td>\n");
          if (i%10 == 0) {
            out.print("</tr><tr>");
          }
        }
      %>
      </tr>
    </table>
  </body>
</html>
