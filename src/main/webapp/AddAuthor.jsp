<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script src = "js/ajax.js"></script>
<script src = "js/biblio-action.js"></script>
<script src = "js/index.js"></script>
</head>
<body onload = "main()">
	<h1>Ajoute un auteur</h1>
	<form>
		<table class = "form">
			<tr>
				<td>Identificateur:</td>
				<td><input type = "text" id = "id"></td>
			</tr>
			<tr>
				<td>Nom:</td>
				<td><input type = "text" id = "name"></td>
			</tr>
			<tr>
				<td>Année de naissance:</td>
				<td><input type = "text" id = "yearBorn"></td>
			</tr>
			<tr>
				<td><input type = "button" value = "envoyer" onclick="biblio.postAuthor()" ></td>
				<td><input type = "reset" value = "annuler" ></td>
			</tr>
		</table>
	</form>
	<div id = "result"></div>
</body>
</html>