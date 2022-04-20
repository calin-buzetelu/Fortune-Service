<%--
  Created by IntelliJ IDEA.
  User: Calin
  Date: 20/04/2022
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fortune Service Confirmation</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
    <div class="container">
        <div class="content">
            <b>Your fortune is...</b>
            <br>
            ${fortune.fortune}
        </div>
    </div>
</body>
</html>
