<html>
	</body>
		<%-- P�gina em JSP --%>
	    <%
	    	String mensagem = "Bem vindo!";
	    	out.println(mensagem);
	    %>
	    <br />
	    <%	String desenvolvido = "Desenvolvido por Bruno Vitalino"; %>
	    <%= desenvolvido %>
	    <br />    
	    <%	System.out.println("Tudo foi executado!"); %>
	    <br />
	    <br />
	    <a href="listagem.jsp">Listar Visitantes</a>
	    <br>
	    <a href="informar-dados.jsp">Informar Dados atrav�s de Expression Language</a>
	</body>
</html>