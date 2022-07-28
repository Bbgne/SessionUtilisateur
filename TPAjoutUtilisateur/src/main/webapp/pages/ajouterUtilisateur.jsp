<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout Nouvel Utilisateur</title>
</head>
<body>
<%@ include file="/body/entete.jsp"%>

<form action="<c:url value="/Inscription"/>" method="post">
<label>Nom :</label>	<input type="text" name="nom"/><br>
<label>Prénom :</label>	<input type="text" name="prenom"/><br>
<label>Email :</label>	<input type="email" name="email"/><br>

<input type="submit" value="Envoyer"/>
	
</form>
<a href="<c:url value="index.jsp"/>">Retour à la page d'accueil</a>
</body>
</html>