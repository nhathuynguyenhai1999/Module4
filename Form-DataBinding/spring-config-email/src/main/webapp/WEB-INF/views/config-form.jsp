<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 08/04/2024
  Time: 4:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Configuration</title>
</head>
<body>
<h2>Email Configuration</h2>
<form action="/config" method="post">
    <div>
        <label for="pageSize">Page Size:</label>
        <select id="pageSize" name="pageSize">
            <option value="5">5</option>
            <option value="10">10</option>
            <option value="15">15</option>
            <option value="25">25</option>
            <option value="50">50</option>
            <option value="100">100</option>
        </select>
    </div>
    <button type="submit">Save Configuration</button>
</form>
</body>
</html>