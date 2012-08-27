<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>You are Connected to Youtube!</h1>

<form method="delete" action="/connect/youtube">
    <button type="submit">Delete</button><span> unlink this connection to youtube</span>
</form>

<span>View your <a href="/youtube/profile">profile</a></span>
<c:forEach var="connection" items="${connections}">
    ${connection.displayName}
</c:forEach>
