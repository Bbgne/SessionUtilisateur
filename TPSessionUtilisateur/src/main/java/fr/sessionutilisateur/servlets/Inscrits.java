package fr.sessionutilisateur.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.sessionutilisateur.bo.Utilisateur;
import fr.sessionutilisateur.dal.DAOFactory;
import fr.sessionutilisateur.dal.UtilisateurDAO;

@WebServlet("/Inscrits")
public class Inscrits extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
		UtilisateurDAO utilisateurDAO = DAOFactory.getUtilisateurDAO();
		
		
		List<Utilisateur> utilisateurs = utilisateurDAO.selectAll();
		request.setAttribute("utilisateurs", utilisateurs);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/page/afficherUtilisateursTableau.jsp");
		rd.forward(request, response);
	}


}
