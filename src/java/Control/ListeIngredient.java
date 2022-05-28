/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Service.ServiceIngredientConsommer;
import classes.ViewIngredientConsommer;
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
public class ListeIngredient extends HttpServlet {

    

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
        try (PrintWriter out = response.getWriter()) {
            
            
            String date1=request.getParameter("date1");
            String date2=request.getParameter("date2");
            ServiceIngredientConsommer sp=new ServiceIngredientConsommer();
                ViewIngredientConsommer[] liste=sp.findAllIngredient(date1,date2);
                request.setAttribute("ingredient",liste);
                  double total = 0;
                         for(int a=0;a<liste.length;a++){
                             total=total+liste[a].getPrixTotal();
                         }
                         request.setAttribute("total",total);
                request.getRequestDispatcher("/ingredients.jsp").forward(request, response);
            }catch (Exception ex) {
            Logger.getLogger(ListeIngredient.class.getName()).log(Level.SEVERE, null, ex);
            
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
