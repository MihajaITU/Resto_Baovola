/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

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
public class CommndeParType extends HttpServlet {

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
                request.getRequestDispatcher("/ListeCommande").forward(request, response);
            }catch (Exception ex) {
            Logger.getLogger(TypeProduit.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
