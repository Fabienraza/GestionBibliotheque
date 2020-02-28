						/*
						 * Cration méthode connexion à partir du design pattern singleton
						 */

package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBD {
	
	private String url = "jdbc:mysql://localhost:3306/bibliotheque";
	private String identifiant = "root";
	private String mdp = "";
	private static ConnexionBD instance;

	
	public Connection getConnection()
	{
	try 
		{
		Class.forName("com.mysql.jdbc.Driver"); 						// ligne permettant l'utilisation de JDBC dans JEE
		Connection con = DriverManager.getConnection(url, identifiant, mdp);
		System.out.println("connexion établie ...");
		return con;
		} 
	catch (Exception e) 												// il faut egalement changer le type d'exception SQLException > Exception...
		{
		System.out.println("Erreur de connexion...");
		e.printStackTrace();
		return null;
		}
	}
	
	// constructeur par defaut 
	private ConnexionBD() {
	}
	
	
	// methode permettant d'une seule instanciation de la connexion dans une autre classe
	public static ConnexionBD getInstance() {
		if(instance==null)
			{
			instance = new ConnexionBD();
			}
		return instance;
	}
	
	
}
