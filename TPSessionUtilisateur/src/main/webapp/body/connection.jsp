        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <div id="Connection"><p>Vous �tes : </p><c:if test="${administrateur==null}"><p>D�connect�</p></c:if><p>${administrateur}</p>
        <c:if test="${administrateur==null}"><a href="<c:url value="/pages/seConnecter.jsp"/>">Se connecter</a></c:if>
        <c:if test="${administrateur!=null}"><a href="<c:url value="/Deconnection"/>">Se d�connecter</a></c:if>
        <a href="">S'inscrire</a>
        </div>
