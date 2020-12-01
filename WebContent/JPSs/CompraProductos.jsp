<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Productos Disponibles</title>
	<meta name="viewport" content="width=device-width,user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" >    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href=" http://localhost:8080/PracticaServJSPyJDBC/diseno/css/diseno.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <!-- Google Fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
    <!-- Bootstrap core CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body style="background-color: #575757;">
	<c:set var="lista" scope="request" value="${productos}" />
	<header class="container-fluid" id="cabecera">
        <div class="row" >
            <div class="col-xs-11">
                <img src="http://localhost:8080/PracticaServJSPyJDBC/diseno/imagenes/l1.png"  id="logo">
            </div>
        </div>
    </header>
	<h1>Lista de Productos</h1>
	
	<c:set var="correo" scope="request" value="${param.correo}" />
	<c:set var="contra" scope="request" value="${param.contra}" />
	
	<div class="row" style="color: white;">
		<div class="col align-self-start"></div>
		<div>
			<table class="table" style="color: white;">
				<tr>
					<td scope="col" style="font-size: 25px"><strong>Id</strong></td>
					<td scope="col" style="font-size: 25px"><strong>Nombre</strong></td>
					<td scope="col" style="font-size: 25px"><strong>Precio</strong></td>
					<td scope="col" style="font-size: 25px"><strong>Descripción</strong></td>
				</tr>
				<c:forEach var="p" items="${lista}">
					<tr scope="row">
						<td style="font-size: 18px">${p.id}</td>
						<td style="font-size: 18px">${p.nombre}</td>
						<td style="font-size: 18px">${p.precio}</td>
						<td style="font-size: 18px">${p.descripcion}</td>
					</tr>
				</c:forEach>
			</table>
			<div id="resultado" style="font-size: 18px"></div>
	
			<div id="array" style="font-size: 18px"></div>
				
			<form name="mandar">
				<button style="font-size: 18px" name="comprar" type="button" class="btn btn-primary mb-2" onclick="enviarParametros()">Comprar</button>
			</form>
		</div>
		<div class="col align-self-end"></div>
	</div>
	
	
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