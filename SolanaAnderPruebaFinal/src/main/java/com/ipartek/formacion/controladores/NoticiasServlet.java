package com.ipartek.formacion.controladores;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.pojos.Noticia;

/**
 * Servlet implementation class NoticiasServlet
 */
@WebServlet("/noticias")
public class NoticiasServlet extends HttpServlet {
	private static final String TEXTO_DE_LA_NOTICIA = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus feugiat malesuada tellus, sed euismod ex dictum vel. Proin fringilla diam sed quam blandit condimentum. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vivamus faucibus maximus augue, eget bibendum sem sodales non. Donec fermentum finibus dui, in posuere lorem sagittis ornare. Maecenas non lacinia.";
	private static final long serialVersionUID = 1L;
       
    
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<Long, Noticia> noticias;
		ServletContext application = request.getServletContext();
		noticias = (HashMap<Long, Noticia>) application.getAttribute("noticias");
		
		if (noticias == null) {
			noticias = new HashMap<>();
			
			noticias.put(1L, new Noticia(1L, "Primera Noticia", "Ander Solana", TEXTO_DE_LA_NOTICIA, null, new Date()));
			noticias.put(2L, new Noticia(2L, "Segunda Noticia", "Anónimo", TEXTO_DE_LA_NOTICIA, null, new Date()));
			noticias.put(3L, new Noticia(3L, "Tercera Noticia", "Ander Solana", TEXTO_DE_LA_NOTICIA, null, new Date()));
			
			application.setAttribute("noticias", noticias);
		}
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
