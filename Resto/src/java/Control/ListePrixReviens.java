/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Service.ServiceProduit;
import Service.ServiceViewPrixProduit;
import classes.Produit;
import classes.Type_Produit;
import classes.ViewPrixProduit;
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
public class ListePrixReviens extends HttpServlet {

    
  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
            {   
                ServiceViewPrixProduit sp=new ServiceViewPrixProduit();
                ViewPrixProduit[] liste=sp.findPrixDeRevient();
                Double prx=0.0;
               
                for(int i=0;i<liste.length;i++)
                {
                    prx=sp.findPrixDeVente(liste[i]);
                    liste[i].setPrixdevente(prx);
                }
                request.setAttribute("listePrix",liste);
                //request.setAttribute("listeVente",liste);
                request.getRequestDispatcher("/listePrixProduit.jsp").forward(request, response);
            }catch (Exception ex) {
            Logger.getLogger(ListePrixReviens.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
