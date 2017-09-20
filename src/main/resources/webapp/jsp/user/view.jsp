<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <div>
        <form:form modelAttribute="user" action="lista" method="get">
            <fieldset>
                <legend>Campos User</legend>
                <p>
                    <form:label for="code" path="code">code</form:label><br/>
                    <form:input path="code" disabled="true" />
                </p>
                <p>
                    <form:label for="name" path="name">name</form:label><br/>
                    <form:input path="name" disabled="true" />
                </p>
                <p>
                    <input type="submit" value="Volver" />
                </p>
            </fieldset>
        </form:form>
    </div>

</html>
