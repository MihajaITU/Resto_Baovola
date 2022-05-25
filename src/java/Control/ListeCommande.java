/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Service.ServiceProduit;
import Service.ServiceType;
import classes.Produit;
import classes.Type_Produit;
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
public class ListeCommande extends HttpServlet {

   

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
                ServiceProduit sp=new ServiceProduit();
                Produit[] liste=sp.findAllProduit();
                request.setAttribute("listeProd",liste);
                ServiceType st=new ServiceType();
                Type_Produit[] listeType=st.findAllType();
                request.setAttribute("listeType",listeType);
                
                request.getRequestDispatcher("/Commande.jsp").forward(request, response);
            }catch (Exception ex) {
            Logger.getLogger(ListeCommande.class.getName()).log(Level.SEVERE, null, ex);
            
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
