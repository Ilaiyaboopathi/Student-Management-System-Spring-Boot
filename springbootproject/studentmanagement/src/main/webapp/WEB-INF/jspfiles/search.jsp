<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Data Table</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            padding: 20px;
            color: #333;
        }
        table {
            width: 100%;
            max-width: 800px;
            border-collapse: collapse;
            margin: 20px 0;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 10px;
            text-align: center;
            border: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
            font-weight: bold;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        a {
            text-decoration: none;
            color: #4CAF50;
            font-weight: bold;
        }
        a:hover {
            color: #45a049;
        }
    </style>
</head>
<body>
	<body style="background-image:url('images/image6.webp'); background-size:cover;background-repeat:no-repeat;text-align:center">
    <table>
        <tr>
            <!--th>S.No</th-->
            <th>Name</th>
            <th>Roll No</th>
            <th>Register No</th>
            <th>Semester</th>
            <th>Subject</th>
            <th>Mark</th>
            <th>Grade</th>
            <th>Result</th>
            
        
        </tr>
        <c:forEach items="${Dataentry}" var="s">
            <tr>
                <!--td>${s.s_no}</td-->
                <td>${s.name}</td>
                <td>${s.rollno}</td>
                <td>${s.registerno}</td>
                <td>${s.semester}</td>
                <td>${s.subject}</td>
                <td>${s.mark}</td>
                <td>${s.grade}</td>
                <td>${s.result}</td>
               
            </tr>
        </c:forEach>
    </table>
</body>
</html>