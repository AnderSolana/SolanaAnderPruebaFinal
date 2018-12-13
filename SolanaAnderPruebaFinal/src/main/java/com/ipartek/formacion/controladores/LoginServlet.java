package com.ipartek.formacion.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.pojos.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");
		
		Usuario usuario = new Usuario("ander", "1234");
		
		if (nombre.equals(usuario.getNombre()) && password.equals(usuario.getPassword())) {
			request.getRequestDispatcher("adminNoticias.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
	}

}
