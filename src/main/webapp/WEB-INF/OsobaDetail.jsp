<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Detail osoby</title>
	</head>
	<body>
		<h1>Detail osoby</h1>
		<form action="osobaDetailServlet" method="post">
			Id: <input type="text" name="id" value="${osoba.id}" readonly><br>
			Jméno: <input type="text" name="firstName" value="${osoba.firstName}"><br>
			Pøíjmení: <input type="text" name="surname" value="${osoba.surname}"><br>
			<input type="submit">
		</form>
		<a href="OsobaListServlet">Zpìt</a>
	</body>
</html>