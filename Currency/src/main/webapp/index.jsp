<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- convert.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Currency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form action="convert" method="post">
    <label for="usd">USD:</label>
    <input type="text" id="usd" name="usd"><br><br>
    <label for="rate">Exchange Rate:</label>
    <input type="text" id="rate" name="rate"><br><br>
    <input type="submit" value="Convert">
</form>
<% if (request.getMethod().equals("POST")) { %>
<% double usd = (double) request.getAttribute("usd"); %>
<% double rate = (double) request.getAttribute("rate"); %>
<% double vnd = (double) request.getAttribute("vnd"); %>
<p>USD: <%= usd %></p>
<p>Exchange Rate: <%= rate %></p>
<p>VND: <%= vnd %></p>
<% } %>
</body>
</html>

