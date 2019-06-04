<%-- 
    Document   : index.jsp
    Created on : May 25, 2019, 10:04:25 AM
    Author     : tux
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mostrador de listados de Clase</title>
  </head>
  <body>
    <h1>Mostrador de listados de Clase</h1>
    <%
      
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/clases","root", "rootmysql");
      Statement s = conexion.createStatement();
      
      ResultSet listado = s.executeQuery ("SELECT * FROM Grupos");
      
    %>
    
    <%
      if (request.getParameter("grupo")!= null) {
        Statement t = conexion.createStatement();
        ResultSet listado2 = t.executeQuery("SELECT * from Alumnos WHERE IDGrupo = '"+request.getParameter("grupo")+"'");

      %>
        <h2>Listado de alumnos del grupo: </h2>     
        <%
          if (listado2.next()) {
            %>
            <table border="1"><tr><td>Identificador</td><td>Nombre</td></tr>
            <%
            do {
              %>
              <tr><td>
                <%=listado2.getString("ID")%>
              </td>
              <td>
                <%=listado2.getString("Nombre")%>
              </td></tr>
              <%
            } while (listado2.next());
            %>
            </table>
          <%    
          } else {
          %>
          No hay alumnos asignados a este grupo.
          <%
          }
        %>
             
        
      <%  
      }
      
    %>
    
    <h2>Seleccione el grupo:</h2>
    <form action="index.jsp" method="POST">
      <select name="grupo">
        <%
          while (listado.next()) {
            String grupoSeleccionado = request.getParameter("grupo")!=null?request.getParameter("grupo"):"";
            String opcionSeleccionada = grupoSeleccionado.equals(listado.getString("ID"))?" selected":"";
            %>
            <option value="<%=listado.getString("ID")%>"<%=opcionSeleccionada%>><%=listado.getString("Denominacion")%></option>
            <%
          }
        %>        
      </select>
      <input type="submit" value="Mostrar ...">
    </form>
  </body>
</html>
