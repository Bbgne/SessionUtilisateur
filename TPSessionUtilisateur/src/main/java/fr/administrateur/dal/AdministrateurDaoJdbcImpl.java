package fr.administrateur.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.sessionutilisateur.bo.Administrateur;
import fr.sessionutilisateur.dal.PersistenceProvider;

public class AdministrateurDaoJdbcImpl implements AdministrateurDAO {

	private static final String controlSQL = "SELECT email,motDePasse from ADMINISTRATEURS where email=? AND motDePasse=?";
	public boolean control(Administrateur administrateur) {
		
		try (	Connection con = PersistenceProvider.getConnection();
				PreparedStatement pstmt = con.prepareStatement(controlSQL); 
				)
				
				{
				pstmt.setString(1, administrateur.getEmail());
				pstmt.setString(2, administrateur.getMotDePasse());
				ResultSet rs = pstmt.executeQuery();

				if (rs.next()) {
					return true;
				}
				else {
					return false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		return false;
	}
	
	
}
