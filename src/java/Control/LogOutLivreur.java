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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HASINA
 */
public class LogOutLivreur extends HttpServlet {

    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try (PrintWriter out = response.getWriter()) 
            {
               HttpSession sessionLivreur=request.getSession();
               ServletContext context = this.getServletContext();
               String messageErreur="LogOut";
              request.setAttribute("messageErreur",messageErreur);
               sessionLivreur.invalidate();
               RequestDispatcher dispat=context.getRequestDispatcher("/Accueil.jsp");
               dispat.forward(request,response);
            }catch (Exception ex) {
            Logger.getLogger(LogOutLivreur.class.getName()).log(Level.SEVERE, null, ex);
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
