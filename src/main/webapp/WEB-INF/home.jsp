<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>Entrena Más Duro</p>
		<p>Cual es el codigo?</p>
		<form method="POST" action="/">
			<input type="text" placeholder="ingesa codigo aca" name="codigo">	
		</form>
		<div class="mensaje-de-error">
			<h1><c:out value="${mensajeError}"/></h1>
		</div>
	</div>
	
</body>
</html>