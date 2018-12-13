<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="includes/cabecera2.jsp"%>

<div class="container">
<div class="page-header">
	<h1>Administrar Noticias</h1>
</div>
<div class="jumbotron">
	<table class="table table-bordered">
	<caption><a href="formulariolibro?accion=insertar">Crear nueva noticia</a></caption>
		<tr class="table-dark">
			<th>Título</th><th>Autor</th><th>Texto</th><th colspan="2">Acciones</th>
		</tr>
	<c:forEach items="${noticias.values()}" var="noticia">
		<tr class="table-primary">
			<td>${noticia.titulo}</td><td>${noticia.autor}</td><td>${noticia.texto}</td>
			<td><a href="formulariolibro?accion=editar&id=${noticia.id }">Editar</a></td><td><a href="formulariolibro?accion=borrar&id=${noticia.id }">Borrar</a></td>
		</tr>
	</c:forEach>
	</table>
</div>
</div>

<%@ include file="includes/pie.jsp"%>