package servlet;

import java.io.IOException; 
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


@WebServlet("/newBook")
public class ajoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ajoutServlet() {
        super();
    }


    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/ajout.jsp").forward(request, response);
	}


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Livre livre1 = new Livre();
		Auteur auteur1 = new Auteur();
		
		//Recuperation des données saisies par l'utilisateur
		livre1.setTitre(request.getParameter("titreLivre"));
		livre1.setCategorie(request.getParameter("categorie"));
		livre1.setIsbn(Integer.parseInt(request.getParameter("isbn")));
		
		auteur1.setNom(request.getParameter("nomAuteur"));
		auteur1.setPrenom(request.getParameter("prenomAuteur"));
		
		
		//Preparation de l'affichage des résumés sur la page confirmation
		request.setAttribute("livre", livre1);
		request.setAttribute("auteur", auteur1);
		
		
		//Enregistrement dans la base de donnée
		ILivreDao l1 = new LivreDao();
		IAuteurDao aut1 = new AuteurDao();
		
		l1.saveLivre(livre1);
		aut1.saveAuteur(auteur1);
		
		//envoi du contenu recupéré sur la vue confirmation
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/confirmation.jsp").forward(request, response);
	}

}
