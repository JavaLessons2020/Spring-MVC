<%--
  Created by IntelliJ IDEA.
  User: Evgeniy
  Date: 16.12.2020
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/pets/new_post" method="post">
    Enter name:
    <input type="text" name="name"><br>
    Enter age:
    <input type="text" name="age"><br>
    Enter type of animal:
    <input type="text" name="breed"><br>
    <input type="submit" value="Registration">
</form>
</body>
</html>
