<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="includes/cabecera2.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRUD Noticia</title>
</head>
<body>
<div class="container">
<div class="page-header">
<h1>Noticia ${noticia.id}</h1>
<form class="form-horizontal" action="formularionoticia" method="post">
	<fieldset>

		<legend>${accion}</legend>
		
			<input type="hidden" name="accion" value="${accion}" />
		
		
			<input type="hidden" name="id" id="id" value="${noticia.id }" />
	
		
		<div class="form-group">
			<label class="control-label col-sm-2" for="titulo">Título</label>
			<div class="col-sm-10">
			<input type="text" name="titulo" id="titulo" value="${noticia.titulo }" />
			</div>
		</div>
		
		<div class="form-group">
			<label class="control-label col-sm-2" for="autor">Autor</label>
			<div class="col-sm-10">
			<input type="text" name="autor" id="autor" value="${noticia.autor}" />
			</div>
		</div>
		
		<div class="form-group">
			<label class="control-label col-sm-2" for="texto">Texto</label>
			<div class="col-sm-10">
			<textarea name="texto" id="texto" cols="50" rows="10">${noticia.texto}</textarea>
			</div>
		</div>
		
		<div class="form-group">
			<label class="control-label col-sm-2" for="fecha">Fecha</label>
			<div class="col-sm-10">
			<input type="date" name="fecha" id="fecha" value="${noticia.fecha}" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="button"></label>
		<div class="col-sm-10">
			<button>Aceptar</button>
		</div>
		</div>

	</fieldset>
</form>
</div>
</div>
</body>
</html>