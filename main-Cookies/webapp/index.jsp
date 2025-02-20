<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="/Ciasteczka-1.0-SNAPSHT/hello-servlet" method="GET">
    <input type="submit" value="wcisnij">
</form>
</body>
</html>