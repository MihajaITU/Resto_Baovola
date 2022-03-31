/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Service.ServicePourBoire;
import classes.Type_Produit;
import classes.ViewPourBoire;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HASINA
 */
public class ListePourBoire extends HttpServlet {


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
             response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
            {   
                ServicePourBoire sp=new ServicePourBoire();
                
                String serve=request.getParameter("serveur");
                String date1=request.getParameter("date1");
                String date2=request.getParameter("date2");
            
                //Serveur id=new Type_Produit();
                int idServeur=Integer.parseInt(serve);
                ViewPourBoire[] pb=sp.findPourBoire(idServeur, date1, date2);
                request.setAttribute("liste",pb);
                request.getRequestDispatcher("/pourboire.jsp").forward(request, response);
            }catch (Exception ex) {
            Logger.getLogger(TypeProduit.class.getName()).log(Level.SEVERE, null, ex);
            
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
