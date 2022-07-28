<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modifier un Utilisateur</title>
</head>
<body>
<%@ include file="/body/entete.jsp"%>
<% int id = Integer.parseInt(request.getParameter("id")); %>

<p>L'utilisateur sélectionné est le : <%=id%></p>

<form action="<%=request.getContextPath() %>/Modifier" method="post">
<label>Nom :</label>	<input type="text" name="nom""> <br>
<label>Prénom :</label>	<input type="text" name="prenom"/><br>
<label>Email :</label>	<input type="email" name="email"/><br>
<input type="hidden" name="identifiant" value="<%=id%>"/>
<input type="submit" value="Modifier"/>
	
</form>
<a href="<%=request.getContextPath() %>/index.jsp">Retour à la page d'accueil</a>
</body>
</html>