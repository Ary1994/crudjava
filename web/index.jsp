
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos Personales</h1>
        <form action="SvPersona" method="POST">
        <p><label for="">DNi:</label> <input type="text" name="dni"></p>
        <p><label for="">Nombre:</label> <input type="text" name="nombre"></p>
        <p><label for="">Apellido:</label> <input type="text" name="apellido"></p>
        <p><label for="">Telefono:</label> <input type="text" name="tell"></p>
       <button type="submit">Enviar</button>
    </form>
    <h1>Ver lista personas</h1>
    <p>Si desea ver todas las personas precionar el botton mostrar personas</p>
    <form action="" method="">
        <button type="submit">Mostrar Personas</button>
    </form>
    <h1>Eliminar Personas</h1>
    <p>Ingrese el dni de la persona a eliminar</p>
    <form action="" method="">
        <p><label for="">Dni:</label><input type="text" name="dni_elim"></p>
        <button type="submit">Eliminar</button>
    </form>
    </body>
</html>
