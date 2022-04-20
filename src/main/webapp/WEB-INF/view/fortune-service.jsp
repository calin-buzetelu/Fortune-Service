<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Calin
  Date: 20/04/2022
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fortune Service</title>
</head>
<body>
    Hi! This is a wip version of the fortune service. Fortunes coming soon...
    <form:form action="showFortune" modelAttribute="fortuneService">
        <br><br>
<%--        Spring uses the attribute setter to set the value--%>
        <form:select path="fortuneType">
            Fortunes:
            <br><br>
            <form:options items="${fortuneService.fortuneTypeList}"/>
        </form:select>
        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
