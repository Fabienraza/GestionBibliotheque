package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.AuteurDao;
import Dao.IAuteurDao;
import Dao.ILivreDao;
import Dao.LivreDao;
import beans.Auteur;
import beans.Livre;


@WebServlet("/listelivres")
public class AfficheLivresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
    public AfficheLivresServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

    
    	// Pour afficher sur la page "listelivres" les livre de la base de donnée
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
			// Recupération des livres dans la base de donnée
		ArrayList<Livre> tableau = new  ArrayList<Livre>();
		ArrayList<Auteur> tab = new  ArrayList<Auteur>();
		ILivreDao accesBD = new LivreDao();
		IAuteurDao dao =new AuteurDao();
		
		tab = dao.getAuteur();
		tableau = accesBD.getLivre();
		
		
		request.setAttribute("listeLivres", tableau);
		
		request.setAttribute("listeAuteurs", tab);
		
		
		System.out.println(tab);
		
			//Envoi et Affichage des listes sur la page listeLivres
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/listelivres.jsp").forward(request, response);
	}

}
