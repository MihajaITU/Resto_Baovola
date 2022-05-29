/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Service.ServiceCommande;
import Service.ServiceDetailsCommande;
import Service.ServiceProduit;
import Service.ServiceServeur;
import Service.ServiceViewPrixProduit;
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
public class GestionCommande extends HttpServlet {

    
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
                String numero=request.getParameter("numero");
                String date=request.getParameter("date");
                ServiceCommande sp=new ServiceCommande();
                sp.insertCommandeWDate(Integer.parseInt(numero),date);
                
                int idCommande=sp.findIdCommande();
                String type=request.getParameter("type");
                 
               
                
                ServiceProduit id=new ServiceProduit();
                int idProduit=id.findIdProduit(type);
                
               ServiceDetailsCommande sd=new ServiceDetailsCommande();
                ServiceServeur ids=new ServiceServeur();
                int idServeur=ids.findNameServeur(Integer.parseInt(type));
                
                int unite=Integer.parseInt(request.getParameter("type"));
                ServiceViewPrixProduit sv=new ServiceViewPrixProduit();
                ViewPrixProduit[] liste=sv.findAllPrixVente();
                Double prx=0.0;
                for (int i = 0; i < liste.length; i++) {
                    prx=liste[i].getPrixdevente();
                }
                
                sd.addDetails(idCommande,idProduit,idServeur,Double.parseDouble(request.getParameter("type")));
                request.getRequestDispatcher("/GestionCommande").forward(request, response);
            }catch (Exception ex) {
            Logger.getLogger(GestionCommande.class.getName()).log(Level.SEVERE, null, ex);
            
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
