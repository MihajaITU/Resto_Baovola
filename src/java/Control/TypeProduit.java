/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Service.ServiceProduit;
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
public class TypeProduit extends HttpServlet {

    
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
                String name=request.getParameter("type");
                Type_Produit id=new Type_Produit();
                int idType=id.getIdType(name);
                request.setAttribute("idT",idType);
                int idT=(int)request.getAttribute("idT");
                ServiceProduit sp=new ServiceProduit();
                Produit [] lp=sp.findAllProduitByType(idT);
                request.setAttribute("byType",lp);
               request.getRequestDispatcher("/ListeCommande.jsp").forward(request, response);
//                request.getRequestDispatcher("/acceuil.jsp").forward(request, response);
            }catch (Exception ex) {
            Logger.getLogger(TypeProduit.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

   
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
