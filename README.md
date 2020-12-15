1.	Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 01: Servlets, JSP y JDBC”

![Imagen1](https://user-images.githubusercontent.com/34029478/102235464-596eab00-3ec0-11eb-8bdf-c991ead73cd5.png)
 
https://github.com/isaac114/PracticaServJSPyJDBC.git

2.	Desarrollar una aplicación con tecnología JEE para gestionar requerimientos de compra en la web.

Con el siguiente diagrama, utilizamos para guiarnos y poder realizar la práctica modificar, agregar, eliminar y listar tanto como el Usuario y como el administrador.

![Imagen2](https://user-images.githubusercontent.com/34029478/102235477-5c699b80-3ec0-11eb-89a0-f9817764e89a.png)
 
En la siguiente imagen podemos visualizar nuestro index.html de la página de venta de productos.

Por lo cual en la página principal tenemos dos botones a los cuales nos guían a registrar un usuario o también podemos iniciar sesión con nuestro respectivo correo y contraseña.

![Imagen3](https://user-images.githubusercontent.com/34029478/102235482-5d9ac880-3ec0-11eb-9c1a-dc8c739d7d1f.png) 

Para que un usuario no pueda ingresar a la pagina del Administrador esto se dividió en 2 tipos tipo_Usuario y tipo_Administrador, y en la siguiente imagen se muestra cual es Usuario y cual es Administrador.

 ![Imagen4](https://user-images.githubusercontent.com/34029478/102235496-61c6e600-3ec0-11eb-883f-ce84d0734400.png)

El usuario tendrá que registrarse para poder iniciar sesión o iniciar sesión con su respectivo correo y contraseña.

El Usuario tendrá que registrarse y llenar todos los campos para obtener una cuenta en esta página.

![Imagen5](https://user-images.githubusercontent.com/34029478/102235501-62f81300-3ec0-11eb-8faf-173475d196e8.png)
![Imagen6](https://user-images.githubusercontent.com/34029478/102235505-64294000-3ec0-11eb-882f-aab5cad1e8bc.png)

Para verificar que nuestro usuario se agrego correctamente visualizamos la base de datos.
 
![Imagen7](https://user-images.githubusercontent.com/34029478/102235506-64c1d680-3ec0-11eb-96a9-2d3451069a2a.png)


Ingresamos a nuestra pagina y podremos visualizar nuestros datos las opciones de realizar pedidos y visualizar las compras.

 ![Imagen8](https://user-images.githubusercontent.com/34029478/102235514-668b9a00-3ec0-11eb-80fe-019306956266.png)

El Usuario puede registrar su compra.

![Imagen9](https://user-images.githubusercontent.com/34029478/102235517-67243080-3ec0-11eb-98f5-c481f3aa8cc8.png)

![Imagen10](https://user-images.githubusercontent.com/34029478/102235522-68555d80-3ec0-11eb-8de0-61a331747f12.png)


El usuario puede Listar sus requerimientos de compra.

 ![Imagen11](https://user-images.githubusercontent.com/34029478/102235525-68edf400-3ec0-11eb-8aaf-6f779159d4cb.png)
 
                                          El usuario visualiza los productos adquiridos
     
![Imagen12](https://user-images.githubusercontent.com/34029478/102235529-6a1f2100-3ec0-11eb-98f8-8b54bb0049a5.png)


En la siguiente imagen podemos visualizar la página del Administrador donde puede agregar, modificar, eliminar, listar los productos.
 
![Imagen13](https://user-images.githubusercontent.com/34029478/102235532-6ab7b780-3ec0-11eb-85d2-3ec5f94fb813.png)

![Imagen14](https://user-images.githubusercontent.com/34029478/102235537-6be8e480-3ec0-11eb-88a9-b88f0acaf50a.png)
![Imagen15](https://user-images.githubusercontent.com/34029478/102235541-6d1a1180-3ec0-11eb-9b78-2feb4632ec30.png)

El Administrador Registra los productos.

![Imagen16](https://user-images.githubusercontent.com/34029478/102235552-6ee3d500-3ec0-11eb-9375-55745de30ceb.png)

El Administrador modifica los datos del producto agregado.
 
![Imagen17](https://user-images.githubusercontent.com/34029478/102235554-70150200-3ec0-11eb-9dca-5c32b5ca6fb1.png)  
![Imagen18](https://user-images.githubusercontent.com/34029478/102235557-71462f00-3ec0-11eb-80a0-d4376641092a.png)

El administrador lista los productos de la empresa.

                          Listado antes de MOdificar
![Imagen19](https://user-images.githubusercontent.com/34029478/102235562-72775c00-3ec0-11eb-83bd-21e85da38037.png)

                          Listado despues de MOdificar

![Imagen20](https://user-images.githubusercontent.com/34029478/102235565-74411f80-3ec0-11eb-8ca6-bc135264dd94.png)


El Administrador busca producto.

![Imagen21](https://user-images.githubusercontent.com/34029478/102235573-75724c80-3ec0-11eb-93e1-0ca4904beb66.png)
![Imagen22](https://user-images.githubusercontent.com/34029478/102235576-76a37980-3ec0-11eb-9a14-5c48f68d14cc.png)

El Administrador elimina el producto.

![Imagen23](https://user-images.githubusercontent.com/34029478/102235586-786d3d00-3ec0-11eb-86d2-a527e2c10ec0.png)

                                  Antes de eliminar el producto Mesa
                                  
![Imagen24](https://user-images.githubusercontent.com/34029478/102235588-7905d380-3ec0-11eb-9ed8-41e65c60d41c.png)

                                  Después de eliminar el producto Mesa
                                  
 ![Imagen25](https://user-images.githubusercontent.com/34029478/102235591-7a370080-3ec0-11eb-8f7d-8b017beb6c2c.png)


El Administrador Lista los requerimientos de compra de los Usuarios.


![Imagen26](https://user-images.githubusercontent.com/34029478/102235597-7b682d80-3ec0-11eb-8ac6-d41763fc238b.png)

El Administrador aprueba o rechaza los requerimientos de los usuarios.


![Imagen27](https://user-images.githubusercontent.com/34029478/102235601-7c995a80-3ec0-11eb-9304-796bbd536df8.png)


De igual manera, se pide manejar sesiones y filtros para que existe seguridad en el sistema. 

Se utilizaron los dos filtros una del Usuario y la otra del Administrador.

![Imagen28](https://user-images.githubusercontent.com/34029478/102235608-7e631e00-3ec0-11eb-8c41-df6e9aa5b3a9.png)

La SesionAciva.java del usuario.


![Imagen29](https://user-images.githubusercontent.com/34029478/102235612-7f944b00-3ec0-11eb-8349-6f4ebb9766e4.png)

La SesionAdmin.java del Administrador

![Imagen30](https://user-images.githubusercontent.com/34029478/102235613-80c57800-3ec0-11eb-96b5-8184f59817e4.png)
 
La siguiente imagen nos muestra la clase contextJDBC.java que es la parte de la conexión hacia la base de datos con el nombre mydb.

![Imagen31](https://user-images.githubusercontent.com/34029478/102235621-828f3b80-3ec0-11eb-8da4-83812a5c6a9b.png)

También tenemos los daos conexiones con la base de datos y para ellos la creación de la base de datos de Usuarios.
 
![Imagen32](https://user-images.githubusercontent.com/34029478/102235626-83c06880-3ec0-11eb-85d5-cc0b9ef5456d.png)

De la misma forma para la creación de la tabla de Administrador.

![Imagen33](https://user-images.githubusercontent.com/34029478/102235631-8622c280-3ec0-11eb-8e2d-a9aa691975a6.png)

De Comprar

![Imagen34](https://user-images.githubusercontent.com/34029478/102235637-86bb5900-3ec0-11eb-8b1a-07770659487f.png)

De Empresa

![Imagen35](https://user-images.githubusercontent.com/34029478/102235451-57a4e780-3ec0-11eb-8214-bf2f7bcbd0ac.png)



RESULTADO(S) OBTENIDO(S):
•	Hemos alcanzado a comprender el funcionamiento de los servlets de como trabajar con la base de datos en lo que es el manejo de jdbc, servlets y paginas jsp, ya que estas son muy útiles para realizar nuestras páginas web personalizadas.

CONCLUSIONES: 
Como conclusión puedo decir que fue muy importante esta práctica ya que logramos entender el respectivo funcionamiento de cómo trabajan los servlets con las conexiones pertinentes a la base de datos y entre otros a la vez interactuar con la misma con paginas jsp etc.

                            Nombre de estudiantes: Jorge Yela, Issac Chavez, Wilmer Durazno

Firma de estudiante:

![Imagen36](https://user-images.githubusercontent.com/34029478/102237078-40ff9000-3ec2-11eb-851e-d595d365d944.png)
![Imagen37](https://user-images.githubusercontent.com/34029478/102237081-4230bd00-3ec2-11eb-8b97-1cb422f16efd.png)
![Imagen38](https://user-images.githubusercontent.com/34029478/102237085-42c95380-3ec2-11eb-8a5e-3722f92ab8f6.jpg)

