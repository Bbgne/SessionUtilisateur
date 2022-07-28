<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Afficher les inscrits</title>
</head>
<body>
<%@ include file="/body/entete.jsp"%>
	<form action="<%=request.getContextPath() %>/Inscrits" method="get">
		<input type="submit" value="Afficher les inscrits"/>
	
	</form>
	
	
	
<a href="<%=request.getContextPath() %>/index.jsp">Retour à la page d'accueil</a>
</body>
</html>