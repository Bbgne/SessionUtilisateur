package fr.ajoututilisateur.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.ajoututilisateur.bo.Utilisateur;

public class UtilisateurDaoJdbcImpl implements UtilisateurDAO {

	private static final String insertSQL = "insert INTO UTILISATEURS (nom,prenom,email) VALUES (?,?,?)";
	private static final String selectAllSQL = "SELECT identifiant,nom,prenom,email from UTILISATEURS";
	private static final String updateSQL = "update UTILISATEURS set nom=?,prenom=?,email=? where identifiant=?";
	private static final String deleteSQL = "DELETE from UTILISATEURS where identifiant=?";

	public void insert(Utilisateur utilisateur) {

		try (	Connection con = PersistenceProvider.getConnection();
			PreparedStatement pstmt = con.prepareStatement(insertSQL, PreparedStatement.RETURN_GENERATED_KEYS); 
			)
			
			{
			pstmt.setString(1, utilisateur.getNom());
			pstmt.setString(2, utilisateur.getPrenom());
			pstmt.setString(3, utilisateur.getEmail());
			pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				utilisateur.setIdentifiant(rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Regarder le close try ou finally close
	}

	public List<Utilisateur> selectAll() {
		ArrayList<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();

		try (
			Connection con = PersistenceProvider.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectAllSQL);
			) {
			
			while (rs.next()) {
				int identifiant = rs.getInt(1);
				String nom = rs.getString(2);
				String prenom = rs.getString(3);
				String email = rs.getString(4);

				listeUtilisateurs.add(new Utilisateur(identifiant, nom, prenom, email));
			}
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		return listeUtilisateurs;
	}

	public void update(Utilisateur utilisateur) {

		try (	Connection con = PersistenceProvider.getConnection();
			PreparedStatement pstmt = con.prepareStatement(updateSQL); 
			) {
			pstmt.setString(1, utilisateur.getNom());
			pstmt.setString(2, utilisateur.getPrenom());
			pstmt.setString(3, utilisateur.getEmail());
			pstmt.setInt(4, utilisateur.getIdentifiant());
			int resultat = pstmt.executeUpdate();

			if (resultat == 1) {
				System.out.println("Utilisateur modifié");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void delete(int identifiant) {

		try (	Connection con = PersistenceProvider.getConnection();
			PreparedStatement pstmt = con.prepareStatement(deleteSQL); 
			) {
			pstmt.setInt(1, identifiant);
			int resultat = pstmt.executeUpdate();

			if (resultat == 1) {
				System.out.println("Utilisateur supprimé");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
