<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>

<h3>Your Connections</h3>

<c:forEach var="providerId" items="${providerIds}">
	<c:set var="connections" value="${connectionMap[providerId]}" />

	<div class="accountConnection">
		<h4>${providerId}</h4>

		<p>
		<c:if test="${not empty connections}">
			You are connected as ${connections[0].displayName}.
		</c:if>
		<c:if test="${empty connections}">
			You are not yet connected to ${providerId}.
		</c:if>
		Click <a href="<c:url value="/connect/${providerId}" />">here</a> to manage your ${providerId} connection.
		</p>
	</div>
</c:forEach>