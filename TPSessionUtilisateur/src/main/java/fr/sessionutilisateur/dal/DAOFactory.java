package fr.sessionutilisateur.dal;

import fr.administrateur.dal.AdministrateurDAO;
import fr.administrateur.dal.AdministrateurDaoJdbcImpl;

public abstract class DAOFactory {
	
	public static UtilisateurDAO getUtilisateurDAO() {
		
		return new UtilisateurDaoJdbcImpl();
	}
	
	public static AdministrateurDAO getAdministrateurDAO() {
		
		return new AdministrateurDaoJdbcImpl();
	}

}
