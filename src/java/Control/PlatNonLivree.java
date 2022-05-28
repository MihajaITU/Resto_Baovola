/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Service.ServiceViewPlatALivre;
import Service.ServiceViewPrixProduit;
import classes.ViewPlatALivre;
import classes.ViewPrixProduit;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HASINA
 */
public class PlatNonLivree extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
            {   
                ServiceViewPlatALivre sp=new ServiceViewPlatALivre();
                
               int livreur=Integer.parseInt(request.getParameter("id"));
               

                //ViewPlatALivre[] liste=sp.findAllPlatALivree();
              
                ViewPlatALivre[] liste=sp.findPlatALivree(livreur);
                request.setAttribute("listePlat",liste);
                //request.getRequestDispatcher("/TemplateLivreur.jsp?p=platsALivre").forward(request, response);
                 RequestDispatcher dispat = request.getRequestDispatcher("/TemplateServeur.jsp?p=platsNonLivree");
                dispat.forward(request, response);
            }catch (Exception ex) {
            Logger.getLogger(PlatNonLivree.class.getName()).log(Level.SEVERE, null, ex);
            
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
