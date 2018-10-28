<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html "http://www.thymeleaf.org/dtd/xhtml1-strict-thymeleaf-4.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:c="http://java.sun.com/jsp/jstl/core">
<html>
<title>Animal Calendar</title>
<meta charset="UTF-8">
<body>

<div id="header">
    <div id="header_element">
        <h1>ANIMAL CALENDAR LOGO HERE</h1>
    </div>

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
                    in week: <c:out value="${dayFrame.dayNumberInWeek}"/>
                    in month: <c:out value="${dayFrame.dayNumberInMonth}"/>
                    to be rendered: <c:out value="${dayFrame.toBeRendered}"/>
                </td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
</body>
</html>