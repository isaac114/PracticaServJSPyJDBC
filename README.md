1.	Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 01: Servlets, JSP y JDBC”
 
https://github.com/isaac114/PracticaServJSPyJDBC.git

2.	Desarrollar una aplicación con tecnología JEE para gestionar requerimientos de compra en la web.
















Con el siguiente diagrama, utilizamos para guiarnos y poder realizar la práctica modificar, agregar, eliminar y listar tanto como el Usuario y como el administrador.
 
En la siguiente imagen podemos visualizar nuestro index.html de la página de venta de productos.

Por lo cual en la página principal tenemos dos botones a los cuales nos guían a registrar un usuario o también podemos iniciar sesión con nuestro respectivo correo y contraseña.

 

Para que un usuario no pueda ingresar a la pagina del Administrador esto se dividió en 2 tipos tipo_Usuario y tipo_Administrador, y en la siguiente imagen se muestra cual es Usuario y cual es Administrador.

 

El usuario tendrá que registrarse para poder iniciar sesión o iniciar sesión con su respectivo correo y contraseña.

El Usuario tendrá que registrarse y llenar todos los campos para obtener una cuenta en esta página.

















Para verificar que nuestro usuario se agrego correctamente visualizamos la base de datos.
 



Ingresamos a nuestra pagina y podremos visualizar nuestros datos las opciones de realizar pedidos y visualizar las compras.

 

El Usuario puede registrar su compra.

   












El usuario puede Listar sus requerimientos de compra.

 



 
















En la siguiente imagen podemos visualizar la página del Administrador donde puede agregar, modificar, eliminar, listar los productos.
 
  











El Administrador Registra los productos.

 

             El Administrador modifica los datos del producto agregado.
 


   

El administrador lista los productos de la empresa.









El Administrador busca producto.















El Administrador elimina el producto.






























El Administrador Lista los requerimientos de compra de los Usuarios.

 


El Administrador aprueba o rechaza los requerimientos de los usuarios.

 










De igual manera, se pide manejar sesiones y filtros para que existe seguridad en el sistema. 

Se utilizaron los dos filtros una del Usuario y la otra del Administrador.


 


La SesionAciva.java del usuario.

 

La SesionAdmin.java del Administrador
 
La siguiente imagen nos muestra la clase contextJDBC.java que es la parte de la conexión hacia la base de datos con el nombre mydb.

 

También tenemos los daos conexiones con la base de datos y para ellos la creación de la base de datos de Usuarios.
 


De la misma forma para la creación de la tabla de Administrador.

 
 






De Comprar
 

De Empresa
 



3.	Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación.
4.	Generar el informe de la práctica con el desarrollo de cada uno de los puntos descritos anteriormente.
RESULTADO(S) OBTENIDO(S):
•	Hemos alcanzado a comprender el funcionamiento de los servlets de como trabajar con la base de datos en lo que es el manejo de jdbc, servlets y paginas jsp, ya que estas son muy útiles para realizar nuestras páginas web personalizadas.

CONCLUSIONES: 
Como conclusión puedo decir que fue muy importante esta práctica ya que logramos entender el respectivo funcionamiento de cómo trabajan los servlets con las conexiones pertinentes a la base de datos y entre otros a la vez interactuar con la misma con paginas jsp etc.
Nombre de estudiantes: Jorge Yela, Issac Chavez, Wilmer Durazno

Firma de estudiante:


