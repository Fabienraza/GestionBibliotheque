package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dao.ILivreDao;
import Dao.LivreDao;
import beans.Livre;



@WebServlet("/supprimerLivre")
public class SupprimerLivreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	
	
    public SupprimerLivreServlet() {
        super();
    }
 
   
    
    		//Methode permettant l'affichage du contenue de la page suppressiond'un livre 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Livre> tableau = new  ArrayList<Livre>();
		ILivreDao accesBD = new LivreDao();
		
		tableau = accesBD.getLivre();
		
		request.setAttribute("listeLivres", tableau);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/deletelivre.jsp").forward(request, response);
	}

	
	
	
		//Methode permettant la suppression d'une livre a partir de l'ISBN
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ILivreDao acc = new LivreDao();
		

		
		acc.deleteLivre(Integer.parseInt(request.getParameter("id_livre")));
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/webfiles/deletelivre.jsp").forward(request, response);
	}

}
