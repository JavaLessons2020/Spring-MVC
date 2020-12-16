<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 16.12.2020
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Animal</title>

    <style>
        table, td {
            border: 1px solid;
            text-align: center;
        }
    </style>
</head>
<body>
<h1>Animals</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Type of animal</th>
    </tr>
    <c:forEach var="anim" items="${animals}">
        <tr>
            <td><c:out value="${anim.name}"/></td>
            <td><c:out value="${anim.age}"/></td>
            <td><c:out value="${anim.breed}"/></td>
            <td><a href="/pets/animal/${anim.name}">This animal</a></td>
        </tr>
    </c:forEach>
    <br>
</table>
<a href="/pets/new">Registration</a>
</body>
</html>
