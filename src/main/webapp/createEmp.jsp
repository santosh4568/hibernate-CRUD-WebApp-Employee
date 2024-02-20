<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
</head>
<style>
    .reg{
        height: 300px;
        width: 30%;
        border: 2px solid black;
        margin-left: 30%;
        margin-right: 40%;
        margin-top: 5%;
    }
    .image{
        height: 100px;
        background-color: blue;
        border: 2px solid black;
    }
    img{
        height: 80px;
        width: 50%;
        margin-left: 25%;
        margin-right: 40%;
        margin-top: 1%;
    }
    input,button{
        width: 90%;
        height: 25px;
        margin-top: 10px;
        margin-left: 5%;
    }
    button{
        background-color: green;
    }
</style>
<body>
    <div class="reg">
        <div class="image">
            <img src="images/em.png" alt="photo">
        </div>
        <form action="createServlet" method="post">
            <input type="text" placeholder="Enter Your Name" name="naam" required><br>
            <input type="text" placeholder="Enter  Your ID" name="id" required><br>
            <input type="text" placeholder="Enter Your Department" name="dept" required><br>
            <button><b>CREATE</b></button>
        </form>
    </div>
</body>
</html>