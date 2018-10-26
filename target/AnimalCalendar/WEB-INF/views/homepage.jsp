<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html SYSTEM "http://www.thymeleaf.org/dtd/xhtml1-strict-thymeleaf-4.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<html>
<title>Animal Calendar</title>
<meta charset="UTF-8">
<style>
    /* Style the header */
    #header {
        display: flex;
        flex-direction: row;
        height: 300px;
        width: 100%;
    }

    .header_element {
        width: 20%;  /* Or whatever */
        height: 300px; /* Or whatever */
        margin: auto;  /* Magic! */
    }

    .background_green {
        background-color: green;
    }


    .background_blue {
        background-color: blue;
    }


    .background_white {
        background-color: white;
    }
</style>
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



First day of month: <c:out value="${firstDayOfMonth}" /><br>
Number of days in month: <c:out value="${numberOfDaysInMonth}" /><br>






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
    <tr th:each="day : ${numberOfDaysInMonth}">

    </tr>
</table>


</body>
</html>