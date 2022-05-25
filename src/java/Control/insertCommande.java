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
public class insertCommande extends HttpServlet {

    
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
                
                ServiceCommande sp=new ServiceCommande();
                ServiceDetailsCommande sd=new ServiceDetailsCommande();
                sp.addCommande(Integer.parseInt(request.getParameter("idt")));
                int idCommande=sp.findIdCommande();
                String name=request.getParameter("produit");
                ServiceProduit id=new ServiceProduit();
                int idProduit=id.findIdProduit(name);
                String nom=request.getParameter("serveur");
                ServiceServeur ids=new ServiceServeur();
                int idServeur=ids.findIdServeur(nom);
                
                int unite=Integer.parseInt(request.getParameter("qte"));
                ServiceViewPrixProduit sv=new ServiceViewPrixProduit();
                ViewPrixProduit[] liste=sv.findAllPrixVente();
                Double prx=0.0;
                
                
                for (int i = 0; i < liste.length; i++) {
                    prx=liste[i].getPrixdevente();
                }
                
                
                
                
                sd.addDetails(idCommande,idProduit,idServeur,Double.parseDouble(request.getParameter("pv")));
//                Panier[] listePan=sp.findPanierClient((String)request.getSession().getAttribute("idClient"));
//                request.setAttribute("listePan",listePan);
                request.getRequestDispatcher("PanierClient").forward(request, response);
            }catch (Exception ex) {
            Logger.getLogger(insertCommande.class.getName()).log(Level.SEVERE, null, ex);
            
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
