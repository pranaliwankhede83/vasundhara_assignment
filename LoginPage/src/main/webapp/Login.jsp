<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">

		<h2>User Login</h2>

		<form action="ValidationForm" method="post">

			<table>

				<tr>

					<td>Username :</td>

					<td><input type="text" name="username"></td>

				</tr>

				<tr>

					<td>Password :</td>

					<td><input type="password" name="password"></td>

				</tr>

				<tr>

					<td><input type="submit" value="Login"></td>

					<td><input type="submit" value="Reset"></td>

				</tr>

			</table>

		</form>
	</div>

</body>
</html>