package beans;

public class Livre {
	private String titre;
	private String categorie;
	private int isbn;
	
	
	public Livre() {

	}

	public Livre(String titre, String categorie, int isbn) {
		this.titre = titre;
		this.categorie = categorie;
		this.isbn = isbn;
	}




	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
	

}
