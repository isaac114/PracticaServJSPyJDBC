<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Productos Disponibles</title>
</head>
<body>
	<c:set var="lista" scope="request" value="${productos}" />
	<h1>Lista de Productos</h1>

	<table>
		<tr>
			<td><strong>Id</strong></td>
			<td><strong>Nombre</strong></td>
			<td><strong>Precio</strong></td>
			<td><strong>Descripción</strong></td>
		</tr>
		<c:forEach var="p" items="${lista}">
			<tr>
				<td>${p.id}</td>
				<td>${p.nombre}</td>
				<td>${p.precio}</td>
				<td>${p.descripcion}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>