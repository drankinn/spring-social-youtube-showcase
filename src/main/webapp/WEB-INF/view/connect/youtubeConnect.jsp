<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>

<h3>Connect to Youtube</h3>

<form action="<c:url value="/connect/youtube" />" method="POST">
    <input type="hidden" name="scope" value="http://gdata.youtube.com" />
    <input type="hidden" name="access_type" value="offline"/>
    <div class="formInfo">
        <p>You aren't connected to Youtube yet. Click the button to connect Spring Social Showcase with your Youtube account.</p>
    </div>
    <p><button type="submit">Connect</button></p>
</form>