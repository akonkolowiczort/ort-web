<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <div>
        <form:form modelAttribute="user" action="agregar" method="post">
            <form:errors path="*" />
            <fieldset>
                <legend>Campos User</legend>
                <p>
                    <form:label for="code" path="code">code</form:label><br/>
                    <form:input path="code" />
                </p>
                <p>
                    <form:label for="name" path="name">name</form:label><br/>
                    <form:input path="name" />
                </p>
                <p>
                    <input type="submit" value="Agregar User" />
                </p>
            </fieldset>
        </form:form>
        <form:form action="lista" method="get">
            <input type="submit" value="Volver"/>
        </form:form>
    </div>

</html>


