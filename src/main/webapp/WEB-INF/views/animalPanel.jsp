<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="header_element flex_container">
    <c:forEach items="${allAnimals}" var="animal" >
        <div class="animal_tab">
            <div class="top_to_bottom">
                <c:out value="${animal.name}"/>
            </div>
        </div>
        <%--we make animal variable request scoped--%>
        <c:set var="animal" value="${animal}" scope="request"/>

        <%--we are importing event form--%>
        <c:import url="eventForm.jsp"/>

    </c:forEach>
</div>