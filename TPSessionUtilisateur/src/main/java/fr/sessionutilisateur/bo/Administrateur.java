package fr.sessionutilisateur.bo;

public class Administrateur {
	
	private int identifiant;
	private String email;
	private String motDePasse;
	
	public Administrateur() {
		
	}
	public Administrateur(String email, String motDePasse) {
		super();
		this.email = email;
		this.motDePasse = motDePasse;
	}
	public Administrateur(int identifiant, String email, String motDePasse) {
		super();
		this.identifiant = identifiant;
		this.email = email;
		this.motDePasse = motDePasse;
	}


	public int getIdentifiant() {
		return identifiant;
	}
	
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	@Override
	public String toString() {
		return "Connecté en tant qu'administrateur : " + email;
	}


}
