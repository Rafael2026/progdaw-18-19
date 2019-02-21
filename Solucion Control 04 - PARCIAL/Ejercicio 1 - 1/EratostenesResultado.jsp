<%-- 
    Document   : EratostenesResultado
    Created on : Feb 21, 2019, 10:03:18 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Esta es la criba</title>
  </head>
  <body>
    <h1>Esta es la criba:</h1>
    <%
        int numero = Integer.parseInt(request.getParameter("numero"));
        String color = request.getParameter("color");
        String colorHtml = "#";
        if (color.equals("rojo")) {
            colorHtml += "FF0000";
        } else if (color.equals("verde")) {
            colorHtml += "00FF00";
        } else {
            colorHtml += "0000FF";
        }

    %>

    <table border="1">     
      <tr>

        <%            
            for (int i = 1; i <= numero; i++) {
                /*
                out.print("<td bgcolor=\"");
                
                boolean esPrimo = true;
                for (int j=2; (j<=(i/2)) && esPrimo; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                    }
                }
                if ((esPrimo) && (i>1)) {
                    out.print(colorHtml);
                } else {
                    out.print("#888888");
                }
                
                */
                String inicioCelda="<td bgcolor=\"";
                
                boolean esPrimo = true;
                for (int j=2; (j<=(i/2)) && esPrimo; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                    }
                }
                if ((esPrimo) && (i>1)) {
                    inicioCelda += colorHtml;
                } else {
                    inicioCelda +="#888888";
                }
                inicioCelda += "\">";
                
                out.print(inicioCelda + i + "</td>");
                if ((i % 10) == 0) {
                    out.print("</tr>\n<tr>");
                }
            }
        %>


      </tr>        
    </table>

  </body>
</html>
