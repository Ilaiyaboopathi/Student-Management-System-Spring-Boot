<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Insert</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            width: 100%;
        }
        h2 {
            text-align: center;
            color: #4CAF50;
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }
        input[type="text"],
        input[type="email"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            margin-bottom: 15px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            width: 100%;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            padding: 10px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 4px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
	<body style="background-image:url('images/image10.webp'); background-size:cover;background-repeat:no-repeat;text-align:center">
    <div class="form-container">
        <h2>Data Insert</h2>
        <form action="insert" method="post">
            <label for="name">Student Name:</label>
            <input type="text" name="name" id="name" required>

            <label for="email">E-mail:</label>
            <input type="email" name="email" id="email" required>

            <label for="rollno">Roll No:</label>
            <input type="text" name="rollno" id="rollno" required>

            <label for="registerno">Register No:</label>
            <input type="text" name="registerno" id="registerno" required>

            <label for="semester">Semester:</label>
            <input type="text" name="semester" id="semester" required>

            <label for="subject">Subject:</label>
            <input type="text" name="subject" id="subject" required>

            <label for="mark">Mark:</label>
            <input type="text" name="mark" id="mark" required>

            <label for="grade">Grade:</label>
            <input type="text" name="grade" id="grade" required>

            <label for="result">Result:</label>
            <input type="text" name="result" id="result" required>

            <input type="submit" value="Submit Here">
        </form>
    </div>
</body>
</html>