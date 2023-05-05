<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

</head>

<body>

	<%
	String name = request.getParameter("username");
	%>

	<div align="center">

		<h1 style="color: green;">

			Welcome
			<%=name%>!!!!

		</h1>

	</div>

</body>

</html>