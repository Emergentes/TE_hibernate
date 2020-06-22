<%@page import="java.util.Iterator"%>
<%@page import="entidades.ConsultaAnuncios"%>
<%@page import="entidades.Anuncios"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ConsultaAnuncios anu =  new ConsultaAnuncios();
    List lista =  anu.getAnuncios();
    Iterator it = lista.iterator();
 %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de anuncios con Hibernate</h1>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Titulo</th>
                <th>Contenido</th>
            </tr>
            <%
            while(it.hasNext()){
                Anuncios a = (Anuncios)it.next();
            %>
            <tr>
                <td><%= a.getId() %></td>
                <td><%= a.getTitulo() %></td>
                <td><%= a.getContenido() %></td>
            </tr>                
            <%
            }
            %>
        </table>
    </body>
</html>
