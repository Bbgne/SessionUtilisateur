package fr.ajoututilisateur.dal;

import java.util.List;

import fr.ajoututilisateur.bo.Utilisateur;

public interface UtilisateurDAO {
	public void insert(Utilisateur utilisateur);
	
	public List<Utilisateur> selectAll();
	
	public void update(Utilisateur utilisateur);
	
	public void delete(int identifiant);
}
