<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Password Error</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8d7da; /* Light red background for error */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; /* Full viewport height */
            margin: 0;
            color: #721c24; /* Dark red color for text */
            text-align: center;
        }
        .message-container {
            background-color: #fff; /* White background for the message box */
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px; /* Maximum width of the box */
            width: 100%; /* Full width for smaller screens */
        }
        h2 {
            margin-bottom: 20px;
            font-size: 24px; /* Font size for the error message */
            color: #721c24; /* Dark red for error message */
        }
        a {
            display: inline-block;
            padding: 10px 20px; /* Padding for the button */
            background-color: #721c24; /* Dark red background for the link */
            color: #fff; /* White text for the link */
            text-decoration: none; /* No underline */
            border-radius: 4px; /* Rounded corners for the button */
            transition: background-color 0.3s; /* Smooth transition for hover effect */
        }
        a:hover {
            background-color: #f5c6cb; /* Lighter red on hover */
            color: #721c24; /* Dark red text on hover */
        }
    </style>
</head>
<body>
    <div class="message-container">
        <h2>Sorry.., Your password is incorrect</h2>
        <a href="adminlogin">Back to Login</a>
    </div>
</body>
</html>