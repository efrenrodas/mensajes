<%-- 
    Document   : index
    Created on : 31 mar. 2021, 10:43:52
    Author     : efren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    </head>
    <body>
        <div class="container p-3 my-3 bg-dark text-white">
            <h1>formularios de mensajes</h1>
            <p>aca podemos gestionar el crud de los mensajes</p>
        </div>  
        <div class="container">
            <h2>Ingreso de comentarios</h2>
            <form action="index.jsp" method="post">
                <div class="form-group">
                    <label for="mensaje">Mensaje</label>
                    <textarea class="form-control" id="mensaje" name="mensaje"> </textarea>
                </div>
                <div class="form-group">
                    <label for="pwd">Autor:</label>
                    <input type="text" class="form-control" id="autor" placeholder="Autor..." name="autor">
                </div>
                <br>
                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
        </div>
        <br>
        <%
        String mensaje = request.getParameter("mensaje");
        String autor = request.getParameter("autor");
        %>
        <div class="jumbotron jumbotron-fluid">
            <div class="container">
                <h1>Comentarios recientes</h1>  
                <h5><%=autor%></h5>
                <p>Dice</p>
                <h5><%=mensaje%></h5>
            </div>
</div>
    </body>
</html>
