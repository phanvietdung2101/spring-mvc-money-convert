<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 4/26/2020
  Time: 12:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <label for="rate">Rate: </label>
    <input type="number" id="rate" name="rate">
    <label for="amount">Amount: </label>
    <input type="number" id="amount" name="amount">
    <button type="submit" >Convert</button>
    <c:if test="${requestScope['convertedAmount'] != null}">
        <p>Result: ${requestScope['convertedAmount']}</p>
    </c:if>
</form>
</body>
</html>
