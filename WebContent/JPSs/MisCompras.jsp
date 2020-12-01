<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Mis Compras</title>
</head>
<body>
	<c:set var="lista" scope="request" value="${compras}" />
	<h1>Lista de Compras</h1>
	
	<table>
		<tr>
			<td><strong>Id</strong></td>
			<td><strong>Fecha</strong></td>
			<td><strong>Estado</strong></td>
			<td><strong>Producto</strong></td>
		</tr>
		<c:forEach var="c" items="${lista}">
			<tr>
				<td>${c.id}</td>
				<td>${c.fecha}</td>
				<td>${c.estado}</td>
				<td>${c.producto_id}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>