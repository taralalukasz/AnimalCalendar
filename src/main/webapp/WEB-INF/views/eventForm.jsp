<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<button class="event-trigger">Add Event</button>
<div class="event-modal">
    <div class="event-modal-content">
        <span class="event-close-button">&times;</span>
        <h1>Add new event</h1>

        <c:url value="/addEvent" var="addFormUrl"/>
        <c:set var="allAnimals" value="${allAnimals}"/>

        <form:form name="eventForm" action="${addFormUrl}" method="POST" modelAttribute="newEvent">
            <form:label path="animal">For Animal: </form:label>
            <form:select path="animal">
                <c:forEach items="${allAnimals}" var="animal" >
                    <form:option value="${animal.name}"/>
                </c:forEach>
            </form:select><br>

            <form:label path="title">Title</form:label>
            <form:input path="title"/><br>

            <form:label path="description">Description</form:label>
            <form:input path="description" value="description"/>

            <%--<form:label path="eventDate">Event Date</form:label>--%>
            <%--<form:input path="eventDate" type="datetime-local"/>--%>

            <input type="submit" value="submit"/>
        </form:form>
    </div>
</div>
