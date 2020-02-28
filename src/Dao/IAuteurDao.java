package Dao;

import java.util.ArrayList;

import beans.Auteur;

public interface IAuteurDao {

	public ArrayList<Auteur>  getAuteur();
	public int saveAuteur(Auteur a);
}
