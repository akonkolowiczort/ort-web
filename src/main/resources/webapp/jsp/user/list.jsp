<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <div>
        <h2>Users</h2>
        <table border="1">
            <thead>
            <th>code</th>
            <th>name</th>
                <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.code}</td>
                    <td>${user.name}</td>
                </tr>
            </c:forEach>
        </table>
        <form:form action="form" method="get">
            <input type="submit" value="Agregar User"/>
        </form:form>
    </div>
</html>
