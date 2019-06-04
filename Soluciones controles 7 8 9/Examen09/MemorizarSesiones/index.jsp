<%-- 
    Document   : index
    Created on : May 25, 2019, 7:00:14 PM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Memorizador</title>
  </head>
  <body>
    <h1>Memorizador</h1>
    <%
      String fraseIntroducida = "";
      if (request.getParameter("miFrase") != null) {
        if (!request.getParameter("miFrase").equals("")) {
          fraseIntroducida = request.getParameter("miFrase");
        }
      }
      if (session.getAttribute("miSesion")!= null) {
        if (!fraseIntroducida.equals("")) {
          session.setAttribute("miSesion",session.getAttribute("miSesion")+"<br>\n"+request.getParameter("miFrase"));
        }
      } else if (!fraseIntroducida.equals("")) {
        session.setAttribute("miSesion",request.getParameter("miFrase"));
      }
      
      if (request.getParameter("olvidar")!=null) {
          session.setAttribute("miSesion", null);
      }
      if (session.getAttribute("miSesion")== null) {
        %>
          Aún no he aprendido nada.
        <%
      } else {
        %>
        Recuerdo las siguientes frases:<br><p>
        <i><div>
        <%=session.getAttribute("miSesion")%>
        </div></i>
        <%
      }
      
    %>
    <p><p>
    <form action="index.jsp" method="POST">
      Introduzca la siguiente frase a memorizar: 
      <input type="text" name="miFrase" size="80"><br>
      <input type="submit" value="Memorizar">
    </form>
    <form action="index.jsp" methdo="POST">
      <input type="hidden" name="olvidar" value="olvidar">
      <input type="submit" value="Olvidar">
    </form>    
  </body>
</html>
