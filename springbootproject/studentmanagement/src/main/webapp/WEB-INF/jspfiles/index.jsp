<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
	
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student and Admin Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
			padding: 30px;
            background-color: #f4f4f4;
            color: #333;

        }
        h1 {
            margin-top: 20px;
            color: #4CAF50;
        }
        .link-container {
            margin-top: 20px;
			padding: 20px;
        }
        a {
            text-decoration: none;
            color: yellow;
            font-size: 18px;
            display: block;
            margin: 10px 0;
        }
        a:hover {
            color:red;
        }
    </style>
</head>
<body>
	<body style="background-image:linear-gradient(to top,rgba(0,0,0,0.5)50%,rgba(0,0,0,0.5)50%),url('https://images.pexels.com/photos/267582/pexels-photo-267582.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1'); background-size:cover;background-repeat:no-repeat;text-align:center;background-color:light-black;">
    <h1>Welcome to the Student Login</h1>
    <div class="link-container">
        <a href="register">New Register</a>
        <a href="login">User Login</a>
    </div>

    <h1>Welcome to the Admin Login</h1>
    <div class="link-container">
        <a href="adminregister">Admin Register</a>
        <a href="adminlogin">Admin Login</a>
    </div>
	</body>
</body>
</html>