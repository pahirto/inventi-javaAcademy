<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Seznam osob</title>
	</head>
	<body>
		<h1>Seznam osob</h1>
		<a href="osobaDetailServlet">Pøidat osobu</a>
		<table border="1">
			<tr><th>Id</th><th>Pøíjmení</th><th>Jméno</th><th>Detail</th><th>Smazat</th></tr>
			<c:forEach var="osoba" items="${requestScope.osoby}">
				<tr>
					<td>${osoba.id}</td>
					<td>${osoba.surname}</td>
					<td>${osoba.firstName}</td>
					<td><a href="osobaDetailServlet?id=${osoba.id}">Detail</a></td>
					<td><a href="OsobaListServlet?deleteId=${osoba.id}">Smazat</a></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>