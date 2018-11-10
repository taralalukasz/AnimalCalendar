<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="header_element flex_container">
    <c:forEach items="${allAnimals}" var="animal" >
        <div class="animal_tab">
            <div class="top_to_bottom">
                <c:out value="${animal.name}"/>
            </div>
        </div>

        <jsp:include page="eventForm.jsp" />

    </c:forEach>
</div>