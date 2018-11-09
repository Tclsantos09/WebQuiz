<%-- 
    Document   : newUser
    Created on : 09/11/2018, 15:52:41
    Author     : lucas
--%>

<%@page import="br.com.fatecpg.web.Bd"%>
<%@page import="br.com.fatecpg.web.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/NavBar.jspf" %>
        <h1>Novo cadastro</h1>
        <h2>Crie sua conta!</h2>
        
        <%
            try{
                if(request.getParameter("inserir")!= null){
                String nome = request.getParameter("nome");
                String username = request.getParameter("username");
                Usuario user = new Usuario(nome, username);
                Bd.getUsuario().add(user);
                response.sendRedirect("home.jsp");
            }
            }catch(Exception ex){
                out.println("Dados Inválidos");
            }
            
        %>
        <form>
            <input type="text" placeholder="Nome" name="nome"/>
            <input type="text" placeholder="Username" name="username"/>
            <br/><input type="submit" name="inserir" value="inseir"/>
        </form><br>
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
        
        
         
</html>
