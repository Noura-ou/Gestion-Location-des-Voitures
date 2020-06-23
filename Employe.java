package location;

public class Employe {
	
	
	 private String nom;
	 private String prenom;
	 
	// Attibuts deduits des relations
	 private Agence agence;
	 
		public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

		public Employe(String nom, String prenom, Agence agence) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.agence = agence;
		}
		 
		
	public Agence getAgence() {
			return agence;
		}


		public void setAgence(Agence agence) {
			this.agence = agence;
		}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

	

}
