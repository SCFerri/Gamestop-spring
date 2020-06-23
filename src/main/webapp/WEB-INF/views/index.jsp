<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manager dei giochi</title>
</head>
<body>
<div align="center">
	<h2>Manager dei giochi</h2>
	
	<h3><a href="new">Nuovo Gioco</a></h3>
	
	<form action="ordine" method="post" >
<INPUT type="radio" name="command" value="0"/>Ordina per nome
<INPUT type="radio" name="command" value="1"/>Ordina per pegi
<INPUT type="radio" name="command" value="2"/>Ordina per prezzo 
<INPUT type="radio" name="command" value="3"/>Ordina per categoria
<INPUT type="submit" value="Vai" />
</form>
	<table border="1" cellpadding="5">
		<tr>
			<th>ID</th>
			<th>Titolo</th>
			<th>Classificazione Pegi</th>
			<th>Prezzo</th>
			<th>Categoria</th>
		</tr>
		<c:forEach items="${listGiochi}" var="gioco">
		<tr>
			<td>${gioco.id}</td>
			<td>${gioco.titolo}</td>
			<td>${gioco.classPegi}</td>
			<td>${gioco.prezzo}</td>
			<td>${gioco.categoria}</td>
			<td>
				<a href="edit?id=${gioco.id}">Edit</a>
				&nbsp;&nbsp;&nbsp;
				<a href="delete?id=${gioco.id}">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</div>	
</body>
</html>