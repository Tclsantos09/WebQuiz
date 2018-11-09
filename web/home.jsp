<%-- 
    Document   : home
    Created on : 06/11/2018, 11:33:41
    Author     : thais.lopes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home - Web Quiz</title>
    </head>
    <body>
        <div class="navbar">
            <%@include file="WEB-INF/jspf/NavBar.jspf" %>
        </div>
        <br>
        <h1>Web Quiz</h1>
        <h2 align="center">Home</h2>
        Bem Vindo ao WebQuiz!
        <h4><a href="newUser.jsp"><button>Cadastre-se</button></a></h4>
        <h4><a href="teste.jsp"><button>Realizar Teste</button></a></h4>
    </body>
    <div class="footer">
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </div>
</html>
