<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Se connecter</title>
</head>
<body>
<%@ include file="/body/connection.jsp"%>
<%@ include file="/body/entete.jsp"%>

<form action="<c:url value="/Connection"/>" method="get">
<label>Email :</label>	<input type="text" name="email"/><br>
<label>Mot de passe :</label>	<input type="password" name="motDePasse"/><br>

<input type="submit" value="Valider"/>
	
</form>
<a href="<c:url value="index.jsp"/>">Retour à la page d'accueil</a>
</body>
</html>