<%@ page import="dados.VisitanteDao" %>
<!DOCTYPE html5>
<html ng-app="listaTelefonica">
	<head>
		<meta charset="utf-8">
		<title>Brincando com jsf</title>
	</head>
	<body >
		<%
		out.print("Listando visitantes:");
		%>
		<br>
		<table class="table table-striped">
			<tr>
				<th>Nome</th>
				<th>Telefone</th>
			</tr>
			<%
			for (VisitanteDao visitante: new VisitanteDao().listar())
			{
			%>
				<tr>
					<td><%=visitante.getNome()%></td>
					<td><%=visitante.getTelefone()%></td>
				</tr>
			<%
			}
			%>
		</table>
	</body>
</html>