<%-- 
    Document   : teste
    Created on : 06/11/2018, 12:48:30
    Author     : thais.lopes
--%>

<%@page import="br.com.fatecpg.web.Bd"%>
<%@page import="br.com.fatecpg.web.Questions"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste - Web Quiz</title>
    </head>
    <body>
        <h4><a href="home.jsp">Voltar</a></h4>
        <h1 align="center">Web Quiz</h1>
        <%if (request.getParameter("EnviarTeste")!= null) {%>
        
        <% int total=0;
            for(Questions q: Bd.getTesteRandomico()){
                String questao = request.getParameter (q.getTitulo());
                if (questao != null && questao.equals(q.getPerguntas())){
                    total ++;
                }
            }
            double resultado = 100.0 * (((double)(total)) / ((double) (Bd.getTesteRandomico().size())));
        %>
        <hr/>
        <h1 style="color: <%= (resultado >= 60) ? "blue" : "red"%>">
            Resultado do teste: <%= resultado%>
        </h1>
        <hr/>
        <%}%>
        <h2>Teste:</h2>
        <form>
            <%for(Questions q: Bd.getTesteRandomico()) {%>
                <h3><%=q.getTitulo()%></h3>
                <%for(int i=0; i<q.getAlternativas().length; i++) {%>
                    <input type="radio" name="<%=q.getTitulo()%>" value="<%=q.getAlternativas()[i]%>"/>
                    <%=q.getAlternativas()[i]%>
                    <br>
                <%}%>
                <hr/>
            <%}%>
            <input type="submit" name="EnviarTeste" value="Enviar"/>
        </form>
    </body>
</html>
