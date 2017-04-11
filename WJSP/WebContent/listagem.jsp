<%@ page import="dados.VisitanteDao" %>
<!DOCTYPE html5>
<html ng-app="listaTelefonica">
	<head>
		<meta charset="utf-8">
		<title>Brincando com jsf</title>
		<link rel="stylesheet" type="text/css" href="WEB-INF/lib/bootstrap/bootstrap.css">
		<style type="text/css">
			.jumbotron {
				width: 600px;
				text-align: center;
				margin-top: 5px;
				margin-left: auto;
				margin-right: auto;
			}
			.table {
				margin-bottom: 5px;
			}
		</style>
	</head>
	<body >
		<div class="jumbotron">			
			<%
			out.print("Listando visitantes:");
			%>
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
		</div>
	</body>
</html>