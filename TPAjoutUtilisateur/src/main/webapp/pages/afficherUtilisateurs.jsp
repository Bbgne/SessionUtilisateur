<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Afficher les inscrits</title>
</head>
<body>
<%@ include file="/body/entete.jsp"%>
	<form action="<c:url value="/Inscrits"/>" method="get">
		<input type="submit" value="Afficher les inscrits"/>
	
	</form>
	
	
	
<a href="<c:url value="index.jsp"/>">Retour à la page d'accueil</a>
</body>
</html>