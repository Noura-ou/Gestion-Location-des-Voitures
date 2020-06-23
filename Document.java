package location;
//import java.util.*;

/**
 * 
 */
public class Document {

  

	/**
     * Default constructor
     */
	  public Document(int numeroDoc,int numeroC ,  String type) {
			super();
			this.numeroDoc = numeroDoc;
			this.type = type;
			this.numeroC = numeroC ;
		}

    /**
     * 
     */
    private int numeroDoc;

    /**
     * 
     */
    private int numeroC;

    /**
     * 
     */
    private String type;

	public int getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(int numeroDoc) {
		this.numeroDoc = numeroDoc;
	}
	public int getNumeroC() {
		return numeroC;
	}
	public void setNumeroC(int numeroC) {
		this.numeroC = numeroC;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



}
