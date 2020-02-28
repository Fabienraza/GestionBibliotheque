package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import beans.Livre;

public class LivreDao implements ILivreDao {

	
	
	@Override
	public ArrayList<Livre> getLivre() {
		try {
			Connection connect = ConnexionBD.getInstance().getConnection();
			if (connect != null)
				{
				ArrayList<Livre> listBook = new ArrayList<Livre>();
				
				Statement stat = connect.createStatement();
				ResultSet reponse = stat.executeQuery("select * from livre");
	
				while(reponse.next()==true)
					{
					listBook.add(new Livre( reponse.getString(2), reponse.getString(4), reponse.getInt(1)));
					}
				return listBook;
				}
			} 
		catch (SQLException e) 
			{
			System.out.println("Erreur servenu lors de la recupération...");
			e.printStackTrace();
			}
		return null;
	}

	
	
	@Override
	public int saveLivre(Livre a) {
		try {
			Connection connect = ConnexionBD.getInstance().getConnection();
			if(connect != null)
				{
				PreparedStatement stat = connect.prepareStatement("insert into livre(isbn,titre,categorie) values(?,?,?)");
					stat.setInt(1,a.getIsbn());
					stat.setString(2, a.getTitre());
					stat.setString(3, a.getCategorie());
				System.out.println("Livre ajouté dans la base de donnée");
				return stat.executeUpdate();
				}
			} 
		catch (SQLException e) 
			{
			e.printStackTrace();
			}
		return 0;
	}



	@Override
	public int deleteLivre(int identif) {
		try {
			Connection connect = ConnexionBD.getInstance().getConnection();
			if(connect != null)
				{
				PreparedStatement stat = connect.prepareStatement("delete from livre where isbn=?");
					stat.setInt(1, identif);
				return stat.executeUpdate();
				}
			} 
		catch (SQLException e) 
			{
			e.printStackTrace();
			}
		return 0;
	}

}
