<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<h2>Search for a Username Suggestion</h2>
<form action="/youtube/profile/usernameSuggestions" method="post">
    <input type="text" name="hint" value="${hint}">
    <input type="submit" value="Search">
</form>


<c:if test="${not empty suggestions}">
    <table border=2>
    <c:forEach items="${suggestions}" var="suggestion">
        <tr><td>${suggestion.title}</td></tr>

    </c:forEach>
    </table>
</c:if>