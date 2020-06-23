<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuovo Gioco</title>
</head>
<body>
	<div align="center">
		<h2>Aggiungi un nuovo gioco</h2>
		<form:form action="save" method="post" modelAttribute="gioco">
			<table border="0" cellpadding="5">
				<tr>
					<td>Nome: </td>
					<td><form:input path="titolo" /></td>
				</tr>
				<tr>
					<td>Classificazione pegi: </td>
					<td><form:input path="classPegi" /></td>
				</tr>
				<tr>
					<td>Prezzo: </td>
					<td><form:input path="prezzo" /></td>
				</tr>
				<tr>
					<td>Categoria: </td>
					<td><form:input path="categoria" /></td>
				</tr>		
				<tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</tr>						
			</table>
		</form:form>
	</div>
</body>
</html>