<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Login</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://getbootstrap.com/docs/4.1/examples/sign-in/signin.css">
  </head>

  <body class="text-center">
    <form action="login" method="post" class="form-signin">
      <img class="mb-4" src="../../assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Introduzca sus datos</h1>
      <label for="nombre" class="sr-only">Nombre</label>
      <input type="text" id="nombre" name="nombre" class="form-control" placeholder="Nombre" required autofocus>
      <label for="password" class="sr-only">Contraseña</label>
      <input type="password" id="password" name="password" class="form-control" placeholder="Contraseña" required>
      
      <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
    </form>
  </body>
</html>