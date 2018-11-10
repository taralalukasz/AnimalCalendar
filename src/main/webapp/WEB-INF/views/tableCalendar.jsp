<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                            <div>
                                in month: <c:out value="${dayFrame.dayNumberInMonth}"/>

                                <c:forEach items="${allEvents}" var="event">
                                    <c:if test="${event.eventDate.dayOfMonth eq dayFrame.dayNumberInMonth}" >
                                        DAY OF EVENT : <c:out value="${event.eventDate.dayOfMonth}" />
                                    </c:if>
                                </c:forEach>
                            </div>
                        </c:when>
                        <c:otherwise>

                        </c:otherwise>
                    </c:choose>
                </td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>