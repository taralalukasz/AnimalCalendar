<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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