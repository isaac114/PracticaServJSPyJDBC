<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Productos Disponibles</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<c:set var="lista" scope="request" value="${productos}" />
	<h1>Lista de Productos</h1>
	
	<c:set var="correo" scope="request" value="${param.correo}" />
	<c:set var="contra" scope="request" value="${param.contra}" />
	
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
	
	<div id="resultado"></div>
	
	<div id="array"></div>
		
	<form name="mandar">
		<button name="comprar" type="button" class="btn btn-primary mb-2" onclick="enviarParametros()">Comprar</button>
	</form>
	
	<script>
	var colores = ['rojo'];
		$(function(){
			$('table tr td').click(function(){
				var contenido = $(this).html();
				//$('#resultado').html('Contenido: '+contenido);
				colores.push(contenido);
				$('#array').html('Array: ' + colores);
			});
		});
		function enviarParametros() {
			//const valores = window.location.search;
			//const urlParams = new URLSearchParams(valores);
			//var correo = urlParams.keys();
			var email = parametroURL('correo');
			$('#resultado').html('Contenido: '+ email);
			window.location.assign('http://localhost:8080/PracticaServJSPyJDBC/ProcesarCompra?carrito='+colores+"&correo="+email);
		}
		function parametroURL(_par) {
			  var _p = null;
			  if (location.search) location.search.substr(1).split("&").forEach(function(pllv) {
			  	var s = pllv.split("="), //separamos llave/valor
			    ll = s[0],
			    v = s[1] && decodeURIComponent(s[1]); //valor hacemos encode para prevenir url encode
			    if (ll == _par) { //solo nos interesa si es el nombre del parametro a buscar
			      	if(_p==null){
			      		_p=v; //si es nula, quiere decir que no tiene valor, solo textual
			      	}else if(Array.isArray(_p)){
			      		_p.push(v); //si ya es arreglo, agregamos este valor
			      	}else{
			      		_p=[_p,v]; //si no es arreglo, lo convertimos y agregamos este valor
			      	}
			    }
			});
			return _p;
		}
	</script>
</body>
</html>