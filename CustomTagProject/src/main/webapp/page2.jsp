<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is page two</h1>

	<!--Redirection in JSP  -->
	<%
	//response.sendRedirect("page3.jsp");
	response.sendRedirect("https://www.google.com");
	%>

</body>
</html>