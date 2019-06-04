<%-- 
    Document   : index.jsp
    Created on : May 21, 2019, 4:52:20 PM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.ArrayList" %>



<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Conversor numérico a Morse</title>
  </head>
  <body>
    <h1>Conversor numérico a Morse</h1>
    Introduzca un valor numérico entero positivo:
    <form action="index.jsp">
      <input type="text" name="numero" value="<%=request.getParameter("numero")!=null?request.getParameter("numero"):""%>"><br>
      <input type="submit" value="Procesar ...">
    </form>
    <% if ((request.getParameter("numero")!=null) && (!request.getParameter("numero").equals(""))) { %>
      <br><br>
      <h2>El número <%=request.getParameter("numero")%> se representa en Morse así:</h2>
      <% 
        int valor = Integer.parseInt(request.getParameter("numero"));
        ArrayList<Integer> digitos = new ArrayList<Integer>();
        while (valor> 0) {
          int digito = valor % 10;
          valor = valor / 10;
          digitos.add(0,digito);
        }
        for (int x: digitos) {          
          out.print(presentaDigito(x));  
          out.print("<img src='MorseImgs/espacio.jpg' width=25>");
        }
        
      %>
    
    <% } %>
  </body>
</html>


<%!
  public static String presentaDigito (int digito) {
    String resultado = "";
    if (digito<5) {
        for (int i=0; i<5; i++) {
            if (digito<=i) {
                resultado += "<img src='MorseImgs/raya.jpg' width=25>";
            } else {
                resultado += "<img src='MorseImgs/punto.jpg' width=25>";
            }
        }
    } else {
        for (int i=5; i<=9; i++) {
            if (digito<=i) {
                resultado += "<img src='MorseImgs/punto.jpg' width=25>";
            } else {
                resultado += "<img src='MorseImgs/raya.jpg' width=25>";
            }
        }
    }
    return resultado;

  }

%>

