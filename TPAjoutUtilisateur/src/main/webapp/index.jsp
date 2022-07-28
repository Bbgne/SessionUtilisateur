<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
<%@ include file="body/entete.jsp"%>
<h1>Menu</h1>
<a href="<c:url value="pages/ajouterUtilisateur.jsp"/>">Ajouter un utilisateur</a>
<a href="<c:url value="pages/afficherUtilisateurs.jsp"/>">Afficher les utilisateurs</a>

<a href="<c:url value="index.jsp"/>">Retour à la page d'accueil</a>

</body>
</html>