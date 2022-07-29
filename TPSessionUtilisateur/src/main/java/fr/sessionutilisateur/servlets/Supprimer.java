package fr.sessionutilisateur.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.sessionutilisateur.dal.DAOFactory;
import fr.sessionutilisateur.dal.UtilisateurDAO;

@WebServlet("/Supprimer")
public class Supprimer extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int identifiant = Integer.parseInt(request.getParameter("identifiant"));


		UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO();
		
		utilisateurDAO.delete(identifiant);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/page/confirmation.jsp");
		rd.forward(request, response);
	}

}
