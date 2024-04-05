<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sandwich Condiment Selection</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            margin: 50px auto;
            text-align: center;
        }
        .checkbox {
            margin: 10px;
        }
        .submit-btn {
            margin-top: 20px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Select Condiments for Your Sandwich</h2>
    <form action="save" method="post">
        <label><input type="checkbox" name="condiment" value="Mayonnaise" class="checkbox"> Mayonnaise</label><br>
        <label><input type="checkbox" name="condiment" value="Mustard" class="checkbox"> Mustard</label><br>
        <label><input type="checkbox" name="condiment" value="Ketchup" class="checkbox"> Ketchup</label><br>
        <!-- Thêm các checkbox cho các gia vị khác nếu cần -->
        <input type="submit" value="Save" class="submit-btn">
    </form>
</div>
</body>
</html>
