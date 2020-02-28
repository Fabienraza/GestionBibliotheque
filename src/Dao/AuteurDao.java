package Dao;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import beans.Auteur;


public class AuteurDao implements IAuteurDao{
	
	public Connection connect = ConnexionBD.getInstance().getConnection();

	
		// Methode permettant la récupération l'ensemble des livres dans la BD
	@Override
	public ArrayList<Auteur> getAuteur() {

		try 
			{
			if(connect != null)
				{
				Statement stat = connect.createStatement();
				ResultSet reponse = stat.executeQuery("select * from auteur");
				
				ArrayList<Auteur> listAuteur = new ArrayList<Auteur>();
				
				
					while(reponse.next()==true) {
					listAuteur.add(new Auteur(reponse.getString(2), reponse.getString(3), reponse.getInt(1)));
					}
				System.out.println("Recuperation liste des auteurs effectuée ");
				System.out.println(listAuteur);
				return listAuteur;
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
	public int saveAuteur(Auteur a) {
		try {
			if (connect != null )
				{
				PreparedStatement stat = connect.prepareStatement("insert into auteur(nomAuteur,prenomAuteur) values(?,?)");
					stat.setString(1,a.getNom());
					stat.setString(2, a.getPrenom());
				System.out.println("Auteur ajouté dans la base de donnée");
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
