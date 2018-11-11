<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<button class="event-trigger">+</button>
<div class="event-modal">
    <div class="event-modal-content">
        <span class="event-close-button">&times;</span>
        <h1>Add new event</h1>

        <c:set value="${requestScope.animal}" var="animal" />
        <c:url value="/addEvent" var="addFormUrl"/>

        For animal : ${animal.name}
        <form:form name="eventForm" action="${addFormUrl}" method="POST" modelAttribute="newEvent">
            <form:input path="animal" value="${animal}" type="hidden"/>

            <form:label path="title">Title</form:label>
            <form:input path="title"/>

            <form:label path="description">Description</form:label>
            <form:input path="description" value="description"/>

            <%--<form:label path="eventDate">Event Date</form:label>--%>
            <%--<form:input path="eventDate" type="datetime-local"/>--%>

            <input type="submit" value="submit"/>
        </form:form>
    </div>
</div>
