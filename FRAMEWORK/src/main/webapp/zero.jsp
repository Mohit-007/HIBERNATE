<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	HELLO WORLD
	
<p>	Addition : <% out.println(request.getAttribute("z")) ; %> </p>
<p>	Addition : ${z} </p>
	
</body>
</html>