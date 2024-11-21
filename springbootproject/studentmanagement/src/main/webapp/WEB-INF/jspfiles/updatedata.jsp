<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Data</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            color: #333;
        }
        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
            text-align: left;
        }
        h1 {
            text-align: center;
            color: #4CAF50;
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"],
        input[type="email"] {
            width: calc(100% - 20px);
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            margin-bottom: 15px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
	<body style="background-image:url('images/image12.webp'); background-size:cover;background-repeat:no-repeat;text-align:center">
    <div class="form-container">
        <form action="updatedata1" method="post">
            <h1>Update Data</h1>
            
            <label for="name">Student Name:</label>
            <input type="text" name="name" value="${Dataentry.name}" required />

            <label for="email">E-mail:</label>
            <input type="email" name="email" value="${Dataentry.email}" required />

            <label for="rollno">Roll No:</label>
            <input type="text" name="rollno" value="${Dataentry.rollno}" required />

            <label for="registerno">Register No:</label>
            <input type="text" name="registerno" value="${Dataentry.registerno}" required />

            <label for="semester">Semester:</label>
            <input type="text" name="semester" value="${Dataentry.semester}" required />

            <label for="subject">Subject:</label>
            <input type="text" name="subject" value="${Dataentry.subject}" required />

            <label for="mark">Mark:</label>
            <input type="text" name="mark" value="${Dataentry.mark}" required />

            <label for="grade">Grade:</label>
            <input type="text" name="grade" value="${Dataentry.grade}" required />

            <label for="result">Result:</label>
            <input type="text" name="result" value="${Dataentry.result}" required />

            <input type="hidden" name="s_no" value="${Dataentry.s_no}" />
            <input type="submit" value="Update Data Here" />
        </form>
    </div>
</body>
</html>