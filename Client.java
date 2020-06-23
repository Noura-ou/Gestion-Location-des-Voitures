package location;
//import java.util.*;

import java.util.Vector;

/**
 * 
 */
public class Client {

	/**
     * Default constructor
     */
	 public Client(String nom,int numClient , String prenom, String type ) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.type = type;
			this.numClient = numClient  ;
		}
    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private int numClient ;
    /**
     * 
     */
    private String prenom;

    /**
     * 
     */
    private String type;
    /**
     * @return
     */
   // public document[] afficherDocuments() {
    public int getnumClient() {
		return numClient ;
	}

    public void setnumClient(int numClient) {
		this.numClient = numClient;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
   public static void afficherDocClient( int numClient) {
	   Vector <Document> documents =new Vector <>();
	    for (Document d : documents) {
	    	System.out.println( "Les documents du clients numéro " + "  " + d.getNumeroC() +" sont"+ " "+ d.getType() );
	    }
   }


}
