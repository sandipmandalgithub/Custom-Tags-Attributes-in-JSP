<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/mylib.tld" prefix="t"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h1 {
	text-align: center;
	color: blue;
}
</style>
</head>
<body>
	<h1>Creating Custom Tag in JSP</h1>
	<t:tag></t:tag>
	<hr>

	<h1>Custom Tag with Attributes in JSP</h1>
	<t:table number="10" color="red"></t:table>
	<hr>
	<t:table number="20" color="green"></t:table>


	<!-- implicits objects in JSP -->
	<%
	out.println("implicits objects in jsp");
	request.getParameter("");
	response.sendRedirect("");
	//config(ServletConfig);
	//application(ServletContext);	
	//session
	out.println(session.isNew());
	session.setAttribute("name",10);
	//page: current JSP page
	//exception:Throwable class
	//pageContext:pageContext
	%>
</body>
</html>