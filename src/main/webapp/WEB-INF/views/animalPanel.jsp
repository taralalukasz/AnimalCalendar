<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="header_element flex_container">
    <c:forEach items="${allAnimals}" var="animal" >
        <div class="animal_tab">
            <div class="top_to_bottom">
                <c:out value="${animal.name}"/>
            </div>
        </div>

        <button class="event_form">+</button>
    </c:forEach>
</div>