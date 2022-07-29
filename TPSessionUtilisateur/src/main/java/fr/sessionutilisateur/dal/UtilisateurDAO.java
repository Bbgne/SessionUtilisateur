package fr.sessionutilisateur.dal;

import java.util.List;

import fr.sessionutilisateur.bo.Utilisateur;

public interface UtilisateurDAO {
	public void insert(Utilisateur utilisateur);
	
	public List<Utilisateur> selectAll();
	
	public void update(Utilisateur utilisateur);
	
	public void delete(int identifiant);
}
