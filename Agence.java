package location;
import java.util.Vector;

public class Agence {
	 
	 private String nom;
	 private String adresse ;
	 
	 // Attibuts deduits des relations
      private Vector <Employe> employes  ;
      private Directeur directeur ;
      private Vector <Voiture> voiture ;
     
		
	public Agence(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}

	public Agence(String nom, String adresse, Vector<Employe> employes, Directeur directeur, Vector<Voiture> voiture) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.employes = employes;
		this.directeur = directeur;
		this.voiture = voiture;
	}
	
	public Vector<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Vector<Employe> employes) {
		this.employes = employes;
	}

	public Directeur getDirecteur() {
		return directeur;
	}

	public void setDirecteur(Directeur directeur) {
		this.directeur = directeur;
	}

	public Vector<Voiture> getVoiture() {
		return voiture;
	}

	public void setVoiture(Vector<Voiture> voiture) {
		this.voiture = voiture;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	// Les méthodes 
	public void afficherVoitures() {
		// on utilise boucle for afin d'afficher le vecteur des voitures
		for  ( Voiture v : voiture ) {
			System.out.println( v.getMatricule()+" " + v.getType()+ " " + v.getMarque()+ " "+ v.getCarteGrise());
		}
	}

		public void afficherVoituresLouees() {
			// on utilise boucle for afin d'afficher le vecteur des voitures
			for  ( Voiture v : voiture ) {
				if  ( v.isLouee()) {
				System.out.println( v.getMatricule()+" " + v.getType()+ " " + v.getMarque()+ " "+ v.getCarteGrise());
				}
				
				}


	

		}	
	
}
