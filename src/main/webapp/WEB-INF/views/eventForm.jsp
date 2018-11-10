<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<button class="event-trigger">+</button>
<div class="event-modal">
    <div class="event-modal-content">
        <span class="event-close-button">&times;</span>
        <h1>Add new event</h1>

        <c:url value="/addEvent" var="addFormUrl"/>
        <form:form name="eventForm" action="${addFormUrl}" method="POST" modelAttribute="newEvent">
            <form:label path="description">Name</form:label>
            <form:input path="description"/>

            <input type="submit" value="submit"/>
        </form:form>
    </div>
</div>
