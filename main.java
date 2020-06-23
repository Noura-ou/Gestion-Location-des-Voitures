package location;
import java.util.Vector;



import location.Location;
import location.Agence;
import location.Client;
import location.Employe;
import location.Directeur;
import location.Voiture;

public class GestionAgenceLocation {
	public static void main(String[] args) {
		
	//  objets de type Agence
		System.out.println( "****** Affichage du nom et Adresse de l'agence ***** ");
		Agence agence1 = new Agence( "agence1" , " Rabat_AlIrfane") ;
		System.out.println(agence1.getNom() + " " + agence1.getAdresse() );
		Vector <Agence> Ag= new Vector <Agence>();
		Ag.add( agence1);
	//  objets de type Directeur
		System.out.println( "****** Affichage du nom et prenom du directeur ***** ");
		Directeur directeur1 = new Directeur ( "Abida" , "Nisrine") ; 
		System.out.println( directeur1.getNom() + " " + directeur1.getPrenom() ) ;
	//  objets de type Employe
		System.out.println( "****** Affichage des Employés de l'Agence ***** ");
		Employe gestionnaire =new Employe("Radi" , "Jabir");
		Employe technicien =new Employe ( "Nassir " , "Wissal");
		Vector <Employe> vEmp=new Vector <Employe>();
		vEmp.add(gestionnaire);
		vEmp.add(technicien);
		for(Employe e:vEmp) {
			System.out.println(e.getNom()+" "+e.getPrenom() );
		}
		// objets de type Voitures	
		System.out.println( "****** Affichage des Voitures de l'agence ***** ");
		Voiture v1=new Voiture(1,"A154" , "Lux","Mercedes","12734",96.0, true );
		Voiture v2=new Voiture(2," D4522" ,"Mini","BMW","14485" ,8000.0 , false);
		Voiture v3=new Voiture(3," B4512" ,"4*4","TOYOTA","54869" ,7000.0 , true );
		Voiture v4=new Voiture(4," M145" , "economique","DACIA","369500" ,1200.0 , true );
		Vector <Voiture> voitures=new Vector <>();
		voitures.add(v1);voitures.add(v2);voitures.add(v3);voitures.add(v4);
		for (Voiture v:voitures) {
			System.out.println(" Numéro Voiture : " +" " +v.getNumVoiture()+ "  " +  " Carte grise : " + " " + v.getCarteGrise() +" "+" La Marque : " +" " + v.getMarque() +" "+ " Matricule : " + " " + v.getMatricule() +" "+ " Prix voiture : " + " " + v.getPrixVoiture()+" "+ " le  type de voiture: " + " " +v.getType() +" " + " voiture louée ou non ; " + " " + v.isLouee());
		}
	//  objets de type Client
		System.out.println( "****** Affichage des Clients de l'agence ***** ");
		Client client1 = new Client ( " Alami", 1,"Adil", " Professionnel" );
		Client client2 = new Client ( " Alami2",2, "Adil2", "normal");
		Client client3 = new Client ( " Alami3",3, "Adil3" , "normal");
		Vector <Client> clients= new Vector <>() ;
		clients.add(client1) ; clients.add(client2) ; clients.add(client3) ;
		for (Client c: clients) {
			System.out.println(c.getNom() +" " + c.getPrenom() +" "+ c.getType() );
		}
	//  objets de type Location
		System.out.println( "****** Affichage des Locations ***** ");
		Location location1=new Location( 1,"12734", "12.02.2020" , "15.06.2013", 54125 ,"espece");
		Location location2=new Location( 2,"4", "14.12.2010","26.12.2052",54558,"cheque");
		Location loca3 = new Location(3, "246KLM7", "22.05.2019", "29.05.2019",34457 ,"Cheque");
		Location loca4 = new Location(4, "54869", "22.05.2019", "29.05.2019",3487 ,"Cheque");
	//	Location location5=new Location( 5 ,2,5, 665 , 2010 , 2011 ," Carte ");
		Vector <Location> locations=new Vector <>();
		locations.add(location1);locations.add(location2);locations.add(loca3);locations.add(loca4);
		//locations.add(location4);locations.add(location5);
		for(Location v:locations) {
			System.out.println("La location du client"+v.getNumClient()+" est:");
			System.out.println("La voiture louée est "+ v.getMatricule()+" La date de début de location "+v.getDateDebut()+"  La date de la fin de location "+v.getDateFin()+" Le type de paiement "+v.getTypePayement());
			
		}
	//  objets de type Documents
		Document doc1=new Document ( 1 ,1,"Permis de conduire");
		Document doc2=new Document (2 ,2, "CIN");
		Document doc3=new Document (3 ,2, "Justificatif de domicile");
		Vector <Document> documents =new Vector <>();
		documents.add(doc1);documents.add(doc2);documents.add(doc3);
	
		System.out.println( "****** Affichage des Documents  ***** ");
		for (Document d : documents) {
			System.out.println( "le numéro du document  "+"  "+d.getNumeroDoc() +" "+ "son type est " +" "+ d.getType());
		}
		
		// methode calcul montant location du client
		System.out.println( "****** Calcul des montants des LOcations ***** ");
		for(Location v:locations){
			System.out.println("Le montant de la location   "+v.getNumClient()+"  du  "+v.getDateDebut()+"  à "+v.getDateFin()+ "  est:  ");
			
			
		}
		System.out.println("Le montant de la location est: "+ Location.calculMontant(location1));
		System.out.println("Le montant de la location est: "+Location.calculMontant(location2));
		System.out.println("Le montant de la location est: "+Location.calculMontant(loca3));
		System.out.println("Le montant de la location est: "+Location.calculMontant(loca4));
		
		// methode calcul montant client
		System.out.println( "****** Calcul du Montant d'un Client ***** ");
		for (Client  C: clients) {
		 
			float montantClient=0;
				for(Location l:locations) {
				
					
				if (C.getnumClient()==l.getNumClient()) {
						
				     montantClient += l.calculMontant(l);
				}	  
	             }
				System.out.println("le montant du client numéro " + C.getnumClient()+" " +  " est de "+ montantClient + " "+ "Dh" ) ;
		     	}
		// methodes afficher les voitures 
		System.out.println( "****** Affichage des Voitures de  l'agence ***** ");
		for (Agence A : Ag) {
			 System.out.println("les voitures de l'agence" +" "+ A.getNom() + " " + " sont " );
			 for  ( Voiture v : voitures ) {
					System.out.println( v.getMatricule()+" " + v.getType()+ " " + v.getMarque()+ " "+ v.getCarteGrise());
				}
	        	}
		
		// methode afficher les voitures louées
		System.out.println( "****** Affichage des Voitures Louées ***** ");
		for (Agence A : Ag) {
			 System.out.println("les voitures de l'agence" +" "+ A.getNom() + " Louees"+ "  "+ "sont ");
			 for  ( Voiture v : voitures ) {
				 if  ( v.isLouee()) {
					System.out.println(" Matricule de la voiture: " +" " + v.getMatricule()+" " + " Le Type de la Voiture: " + " " + v.getType()+ " " + " Marque : " +" " + v.getMarque()+ " "+ " Carte Grise: " +" " + v.getCarteGrise());
				}
	        	}
	            }
	
		// methode afficher documents	d'un clients
		System.out.println( "****** Affichage des Documents d'un Client ***** ");
		for (Client C: clients) {
			   for (Document d : documents) {
			if ( C.getnumClient() == d.getNumeroC()  ) {
			System.out.println( "Le document numéro " +d.getNumeroDoc() + " du client numéro "+" "+C.getnumClient()+ " " +"est"+" " +d.getType() );
		    }
		    }
	        }
		
		// methode calcul garantie d'un Client
		System.out.println( "****** Calculer la Garantie d'un Client ***** ");
		for(Location l: locations) {
	    	for(Voiture v: voitures) {
	    		double garantie=0;
	    		if (l.getMatricule()== v.getMatricule()) {
	    			switch(v.getType()) {
	    			case "Lux" : 
	    			garantie = 0.3 *(v.getPrixVoiture());
	    			break; 
	    			case "4*4" :
	    			garantie = 0.2 * (v.getPrixVoiture());
	    			break;
	    			case "sport" : 
	    			garantie = 0.1 *(v.getPrixVoiture());
	    			break;
	    			default : 
	    			garantie = 0.05 * (v.getPrixVoiture()); 
	    		break;
	    			}
	    			System.out.println("Le client numéro "+" "+ l.getNumClient()+" a comme garantie:"+ garantie + " Dhs ")	;
		    			
	    		}
	    		
	}
}
}
}
