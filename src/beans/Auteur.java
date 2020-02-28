package beans;

public class Auteur {
	
	private String nom;
	private String prenom;
	private int id;
	
	
	public Auteur() {

	}
	
	public Auteur(String nom, String prenom, int id) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	public Auteur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Auteur [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}


	
}
