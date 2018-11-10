<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<div class="header_element">
    <button class="trigger">Add Animal</button>
    <div class="modal">
        <div class="modal-content">
            <span class="close-button">&times;</span>
            <h1>Add new animal</h1>

            <c:url value="/add" var="addFormUrl"/>
            <form:form name="animalForm" action="${addFormUrl}" method="POST" modelAttribute="newAnimal" onsubmit="return validateForm()">
                <form:label path="name">Name</form:label>
                <form:input path="name"/>

                <input type="submit" value="submit"/>
            </form:form>

            <p id="animal_form_message">Name must be between 1 and 12 characters long!</p>
        </div>
    </div>
</div>