<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="calculate" method="post">
    <label>
        <input type="number" name="num1" required>
    </label>
    <label>
        <select name="operator" required>
            <option value="add">+</option>
            <option value="substract">-</option>
            <option value="multiply">*</option>
            <option value="divide">/</option>
        </select>
    </label>
    <label>
        <input type="number" name="num2" required>
    </label>
    <button type="submit">Calculate</button>
</form>
<div th:if="${result}">
    <p th:text="'Result:' + ${result}"></p>
</div>
<div th:if="${error}">
    <p th:text="${error}"></p>
</div>
</body>
</html>