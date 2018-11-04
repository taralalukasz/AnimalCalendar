<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html "http://www.thymeleaf.org/dtd/xhtml1-strict-thymeleaf-4.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:c="http://java.sun.com/jsp/jstl/core">
<html>
<head>
    <title>Animal Calendar</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/main.css" />
</head>

<meta charset="UTF-8">
<body>

<div id="header">
    <div id="header_logo">
        <h1>ANIMAL CALENDAR LOGO HERE</h1>
    </div>
    <div class="header_element">
        <form:form name="datePickerForm" method="get">
            <div class="">
                choose year : <input type="text" value="${param.year}" name="year"/>
            </div>
            <div class="">
                choose month: <input type="text" value="${param.month}" name="month"/>
            </div>
            <div class="">
                submit: <input type="submit" value="choose"/>
            </div>
        </form:form>
    </div>

    <%--animal panel --%>
    <div class="header_element">
        <c:forEach items="${allAnimals}" var="animal" >
            <c:out value="${animal.name}"/>
        </c:forEach>
    </div>

    <%--animal form--%>
    <div class="header_element">
        <button class="trigger">Add Animal</button>
        <div class="modal">
            <div class="modal-content">
                <span class="close-button">&times;</span>
                <h1>Add new animal</h1>
            </div>
        </div>
    </div>
</div>



<table>
    <tr>
        <th>Monday</th>
        <th>Tuesday</th>
        <th>Wednesday</th>
        <th>Thursday</th>
        <th>Friday</th>
        <th>Saturday</th>
        <th>Sunday</th>
    </tr>
    <c:forEach items="${monthToDisplay}" var="week">
        <tr>
            <c:forEach items="${week.daysInWeek}" var="dayFrame">
                <td>
                    <c:choose>
                        <c:when test="${true eq dayFrame.toBeRendered}" >
                            <div> <%--class="dayFrame">--%>
                                in week: <c:out value="${dayFrame.dayNumberInWeek}"/>
                                in month: <c:out value="${dayFrame.dayNumberInMonth}"/>
                                to be rendered: <c:out value="${dayFrame.toBeRendered}"/>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <%--<div class="dayFrame">--%>
                            <%--</div>--%>
                        </c:otherwise>
                    </c:choose>
                </td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>

<script>
    var modal = document.querySelector(".modal");
    var trigger = document.querySelector(".trigger");
    var closeButton = document.querySelector(".close-button");

    function toggleModal() {
        modal.classList.toggle("show-modal");
    }

    function windowOnClick(event) {
        if (event.target === modal) {
            toggleModal();
        }
    }

    trigger.addEventListener("click", toggleModal);
    closeButton.addEventListener("click", toggleModal);
    window.addEventListener("click", windowOnClick);

</script>
</body>
</html>