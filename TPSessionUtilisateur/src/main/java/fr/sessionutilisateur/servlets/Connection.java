package fr.sessionutilisateur.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.administrateur.dal.AdministrateurDAO;
import fr.sessionutilisateur.bo.Administrateur;
import fr.sessionutilisateur.dal.DAOFactory;


@WebServlet("/Connection")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String email = request.getParameter("email");
		String motDePasse = request.getParameter("motDePasse");


		AdministrateurDAO administrateurDAO = DAOFactory.getAdministrateurDAO();
		Administrateur administrateur = new Administrateur(email,motDePasse);
		
		
		if (administrateurDAO.control(administrateur)==true) {
			
		request.getSession().setAttribute("administrateur", administrateur);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/page/confirmation.jsp");
		rd.forward(request, response);
		}
		else {
			PrintWriter out = response.getWriter();
			out.print("Echec de connection");
		}

	}

}
