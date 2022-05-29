/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Service.ServiceServeur;
import Service.ServiceViewPlatALivre;
import classes.Serveur;
import classes.ViewPlatALivre;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HASINA
 */
public class LoginServeur extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            ServiceServeur sa = new ServiceServeur();

            ServiceServeur sp = new ServiceServeur();

            Serveur serveur = sa.findServeur(request.getParameter("mail"), request.getParameter("mdp"));

//                out.print(request.getParameter("mail"));
//                out.print(request.getParameter("mdp"));
//                out.print(livreur.getId());
            boolean valeur = sa.ServeurLogin(request.getParameter("mail"), request.getParameter("mdp"));
            HttpSession session = request.getSession();
            if (valeur == true) {
                session.setAttribute("idServeur", serveur.getId());
                Serveur[] liste = sp.findSpeServeur(serveur.getId());
                request.setAttribute("Commande", liste);
                request.getRequestDispatcher("/TemplateServeur.jsp?p=GestionCommande").forward(request, response);
            } else {
                request.getRequestDispatcher("/LoginServeur.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginServeur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
