package web;
import java.io.IOException;
//import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import agence.IagenceCatalogue;
import agence.AgenceImpl;
import agence.IagenceCatalogue;
import agence.voyage;
@WebServlet (name="cs",urlPatterns= {"/controleur"})
public class ControleurServlet extends HttpServlet {
private IagenceCatalogue agence;
@Override
public void init() throws ServletException {
	agence=new AgenceImpl();
}
@Override
protected void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException {
String mc=request.getParameter("motCle");
VoyageModele mod = new VoyageModele();
mod.setMotCle(mc);
List<voyage> prods = agence.getvoyagesParMotCle(mc);
mod.setProduits(prods);
request.setAttribute("modele", mod);
request.getRequestDispatcher("voyagesView.jsp").forward(request,response);
}
}
