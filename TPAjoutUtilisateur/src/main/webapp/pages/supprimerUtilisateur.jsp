<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Confirmer la suppression</title>
</head>
<body>
<%@ include file="/body/entete.jsp"%>
<% int id = Integer.parseInt(request.getParameter("id")); %>

<p>Confirmer la suppression de l'utilisateur <%=id%> ?</p>

<form action="<c:url value="/Supprimer"/>" method="post">
<input type="hidden" name="identifiant" value="<%=id%>"/>
<input type="submit" value="Confirmer"/>
</form>
<a href="<c:url value="index.jsp"/>">Retour à la page d'accueil</a>
</body>
</html>