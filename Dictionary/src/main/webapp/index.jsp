<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dictionary</title>
</head>
<body>
<h1>English-Vietnamese Dictionary</h1>
<form action="search" method="post">
    <label for="word">Enter a word:</label>
    <input type="text" id="word" name="word">
    <button type="submit">Search</button>
</form>
</body>
</html>
