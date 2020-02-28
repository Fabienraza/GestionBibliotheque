package Dao;

import java.util.ArrayList;
import beans.Livre;

public interface ILivreDao {
	
	public ArrayList<Livre> getLivre();
	public int saveLivre(Livre a);
	public int deleteLivre(int identif);
	

}
