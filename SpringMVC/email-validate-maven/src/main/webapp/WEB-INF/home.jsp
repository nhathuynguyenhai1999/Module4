<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 05/04/2024
  Time: 11:52 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Email Validate</h1>
    <h3 style="color:red">${message}</h3>
    <form action="validate" method="post">
        <label>
            <input type="text" name="email">
        </label><br/>
        <label>
            <input type="submit" value="Validate">
        </label>
    </form>
</body>
</html>
