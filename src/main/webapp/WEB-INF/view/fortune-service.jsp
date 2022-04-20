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
    <title>Fortune service</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
    <div class="container">
        <div class="content">
            <form:form action="showFortune" modelAttribute="fortuneService">
                <br><br>
        <%--        Spring uses the attribute setter to set the value--%>
                Please select the type of fortune you wish to receive:
                <br><br>
                <form:select path="fortuneType">
                    <form:options items="${fortuneService.fortuneTypeList}"/>
                </form:select>
                <br><br>
                <input type="submit" value="Submit"/>
            </form:form>
        </div>
    </div>
</body>
</html>
