<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delicia de título cara</title>
</head>
<body>
<form action="/twiter/index/recebeDados" method="post">
	<label>Dado</label>
	<input type="text" name="dado">
	<input type="submit" value="Enviar">
</form>
	<%
		for(int i = 0; i<10; i++){
			out.print("<h2>"+i+"<h2>");
		}
	%>
</body>
</html>