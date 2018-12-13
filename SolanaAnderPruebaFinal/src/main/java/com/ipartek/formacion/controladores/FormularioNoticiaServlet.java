package com.ipartek.formacion.controladores;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.pojos.Noticia;

/**
 * Servlet implementation class FormularioNoticiaServlet
 */
@WebServlet("/formularionoticia")
public class FormularioNoticiaServlet extends HttpServlet {
	private static final String CRUD_NOTICIA_JSP = "crudNoticia.jsp";
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String accion = request.getParameter("accion");
		
		if (accion != null && !"insertar".equals(accion)) {
			@SuppressWarnings("unchecked")
			HashMap<Long, Noticia> noticias = (HashMap<Long, Noticia>) request.getServletContext().getAttribute("noticias");
			
			if (noticias == null) {
				response.sendRedirect("noticias");
				return;
			}
			
			Noticia noticia = noticias.get(Long.parseLong(id));
			
			request.setAttribute("noticia", noticia);
		}
		
		request.setAttribute("accion", accion);		
		
		request.getRequestDispatcher(CRUD_NOTICIA_JSP).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String accion = request.getParameter("accion");
		String id = request.getParameter("id");
		
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String texto = request.getParameter("texto");
		String fechaTexto = request.getParameter("fecha");
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = null; 
		
		try {
			fecha = format.parse(fechaTexto);
		} catch (ParseException e) {
			throw new ServletException("Error en la fecha", e);
		}
		
		@SuppressWarnings("unchecked")
		HashMap<Long, Noticia> noticias = (HashMap<Long, Noticia>) request.getServletContext().getAttribute("noticias");
		
		if (noticias == null) {
			
			response.sendRedirect("noticias");
			return;
		}
		
		Long idLong;
		if ("insertar".equals(accion)) {
			long lastKey = 0;
	        //you entered Map<Long, String> entry
	        for (Entry<Long, Noticia> entry : noticias.entrySet()) {
	            lastKey = entry.getKey();
	        }
	        System.out.println(lastKey);
			
			idLong = lastKey + 1L; 
		}else {
			idLong = Long.parseLong(id);
		}
		
		switch (accion) {
		case "insertar":
		case "editar":
			Noticia noticia = new Noticia(idLong, titulo, autor, texto, null, fecha);
//			request.setAttribute("accion", accion);
//			request.setAttribute("noticia", noticia);
//			request.getRequestDispatcher(CRUD_NOTICIA_JSP).forward(request, response);
			noticias.put(noticia.getId(), noticia);
			break;
		case "borrar":
			noticias.remove(Long.parseLong(id));
			break;
		default:
			throw new ServletException("Opción no definida");
		}
		
		response.sendRedirect("noticias");
	}

}
