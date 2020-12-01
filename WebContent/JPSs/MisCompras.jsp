<head>
	<meta charset="ISO-8859-1">
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
    <title>Mis Compras</title>

</head>
<body style="background-color: #575757;">

    <header class="container-fluid" id="cabecera">
        <div class="row" >
            <div class="col-xs-11">
                <img src="http://localhost:8080/PracticaServJSPyJDBC/diseno/imagenes/l1.png"  id="logo">
            </div>
        </div>
    </header>
    
	<c:set var="lista" scope="request" value="${compras}" />
	<h1>Lista de Compras</h1>
	
	<table class="table">
		<tr>
			<td scope="col"><strong>Id</strong></td>
			<td scope="col"><strong>Fecha</strong></td>
			<td scope="col"><strong>Estado</strong></td>
			<td scope="col"><strong>Producto</strong></td>
		</tr>
		<c:forEach var="c" items="${lista}">
			<tr scope="row">
				<td>${c.id}</td>
				<td>${c.fecha}</td>
				<td>${c.estado}</td>
				<td>${c.producto_id}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>