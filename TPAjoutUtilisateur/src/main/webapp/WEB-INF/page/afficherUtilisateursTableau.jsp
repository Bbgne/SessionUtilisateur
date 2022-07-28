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


	 <table border = "1">
         <tr>
            <th>Identifiant</th>
            <th>Nom</th>
            <th>Prénom</th>
            <th>Email</th>
            <th>Modifier</th>
            <th>Supprimer</th>
         </tr>
         <c:forEach var ="utilisateurs" items = "${utilisateurs}">
            <tr>
               <td> <c:out value = "${utilisateurs.identifiant}"/></td>
               <td> <c:out value = "${utilisateurs.nom}"/></td>
               <td> <c:out value = "${utilisateurs.prenom}"/></td>
               <td> <c:out value = "${utilisateurs.email}"/></td>
               <td> <a href="<%=request.getContextPath() %>/pages/modifierUtilisateur.jsp?id=${utilisateurs.identifiant}">Modifier</a></td>
               <td> <a href="<%=request.getContextPath() %>/pages/supprimerUtilisateur.jsp?id=${utilisateurs.identifiant}">Supprimer</a></td>
            </tr>
         </c:forEach>
      </table>
	
<a href="<%=request.getContextPath() %>/index.jsp">Retour à la page d'accueil</a>
</body>
</html>