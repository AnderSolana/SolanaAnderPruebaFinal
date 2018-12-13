<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="includes/cabecera3.jsp"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Noticia ${noticia.id}</title>
</head>
<body>
<div class="container">
<div class="jumbotron">
<h1>${noticia.titulo}</h1>
<footer>
<small>${noticia.fecha}</small>
<small>${noticia.autor}</small>
</footer>
<img src="${noticia.imagen}">
<p>${noticia.texto}</p>
</div>
<a class="btn btn-success" href="noticias">Volver a todas las noticias</a>
</div>
</body>
</html>