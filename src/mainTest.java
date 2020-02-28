import java.util.ArrayList;

import Dao.AuteurDao;
import Dao.IAuteurDao;
import Dao.ILivreDao;
import Dao.LivreDao;
import beans.Auteur;
import beans.Livre;

public class mainTest {

	public static void main(String[] args) {
		
				// Test ajout d'un livre dans BD
			Livre l1 = new Livre("petit prince", "bande dessinée", 123);
			Livre l2 = new Livre("java pour les nuls", "Technologie", 145);
			
			ILivreDao accesDonnee = new LivreDao();
			
			accesDonnee.saveLivre(l1);
			accesDonnee.saveLivre(l2);
			
				// Test ajout auteur dans BD
			Auteur a1 = new Auteur("DUPONT", "Paul");
			Auteur a2 = new Auteur("TOTO","Azerty");
			
			IAuteurDao access = new AuteurDao();
			
			access.saveAuteur(a1);
			access.saveAuteur(a2);
			
	}

}
