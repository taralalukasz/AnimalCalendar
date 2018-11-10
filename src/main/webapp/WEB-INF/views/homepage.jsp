<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html "http://www.thymeleaf.org/dtd/xhtml1-strict-thymeleaf-4.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:c="http://java.sun.com/jsp/jstl/core">
<html>
<head>
    <title>Animal Calendar</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/main.css" />
</head>

<meta charset="UTF-8">
<body>

<div id="header">
    <div id="header_logo">
        <h1>ANIMAL CALENDAR LOGO HERE</h1>
    </div>
    <%--choose date form--%>
    <jsp:include page="dateForm.jsp" />

    <%--animal panel --%>
    <jsp:include page="animalPanel.jsp" />

    <%--animal form--%>
    <div class="header_element">
        <jsp:include page="animalForm.jsp" />
    </div>
</div>

<jsp:include page="tableCalendar.jsp" />


<script src=${pageContext.request.contextPath}/resources/scripts/modal.js></script>
<script src=${pageContext.request.contextPath}/resources/scripts/validateAnimalForm.js></script>
<script src=${pageContext.request.contextPath}/resources/scripts/eventFormModal.js></script>
</body>
</html>