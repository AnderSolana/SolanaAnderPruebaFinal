package com.ipartek.formacion.controladores;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.pojos.Noticia;

/**
 * Servlet implementation class VisualizarNoticiaServlet
 */
@WebServlet("/visualizarnoticia")
public class VisualizarNoticiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		ServletContext application = request.getServletContext();
		
		@SuppressWarnings("unchecked")
		HashMap<Long, Noticia> noticias = (HashMap<Long, Noticia>) application.getAttribute("noticias");
		
		Noticia noticia = noticias.get(Long.parseLong(id));
		
		request.setAttribute("noticia", noticia);
		
		request.getRequestDispatcher("noticia.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
