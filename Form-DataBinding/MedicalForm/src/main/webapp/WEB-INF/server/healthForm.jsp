<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 12/04/2024
  Time: 11:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Health Form</title>
</head>
<body>
<h1>Health Form</h1>
<form action="submitForm" method="post" modelAttribute="healthForm">
    <label for="fullname">Full Name:</label>
    <input type="text" id="fullname" name="fullname" required><br>

    <label for="age">Age:</label>
    <input type="number" id="age" name="age" required><br>

    <label for="temperature">Body Temperature:</label>
    <input type="number" id="temperature" name="temperature" step="0.1" required><br>

    <label for="symptoms">Symptoms:</label>
    <textarea id="symptoms" name="symptoms" rows="4" cols="50" required></textarea><br>

    <button type="submit">Submit</button>
</form>
</body>
</html>

