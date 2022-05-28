/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Service.ServiceLivreur;
import Service.ServiceViewPlatALivre;
import classes.Livreur;
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
public class LoginLivreur extends HttpServlet {

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
         try (PrintWriter out = response.getWriter()) 
            {
                ServiceLivreur sa=new ServiceLivreur();
                
                ServiceViewPlatALivre sp=new ServiceViewPlatALivre();
                
                Livreur livreur=sa.findLivreur(request.getParameter("mail"), request.getParameter("mdp"));
                
//                out.print(request.getParameter("mail"));
//                out.print(request.getParameter("mdp"));
//                out.print(livreur.getId());
                
                boolean valeur =sa.livreurLogin(request.getParameter("mail"), request.getParameter("mdp"));
                HttpSession session = request.getSession();
                if(valeur == true)
                {
                    session.setAttribute("idLivreur",livreur.getId());  
                    ViewPlatALivre[] liste=sp.findPlatALivree(livreur.getId());
                    request.setAttribute("listePlat",liste);
                   request.getRequestDispatcher("/TemplateLivreur.jsp?p=platsALivre").forward(request, response);
                }else{
                    request.getRequestDispatcher("/loginLivreur.jsp").forward(request, response);
                }
            }catch (Exception ex) {
            Logger.getLogger(LoginLivreur.class.getName()).log(Level.SEVERE, null, ex);
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
