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
                choose year : <input type="text" value="2018" name="year"/>
            </div>
            <div class="">
                choose month: <input type="text" value="4" name="month"/>
            </div>
            <div class="">
                submit: <input type="submit" value="choose"/>
            </div>
        </form:form>
    </div>

    <%--animal panel --%>
    <div class="header_element">
        here animal panel will be placed
    </div>

    <%--login form--%>
    <div class="header_element">
        here login form will be placed
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
</body>
</html>