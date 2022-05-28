/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author ASUS TUF
 */
public class ViewStock {

    String ingredient;
    double ingredientrestante;
    String dateStock;

    public ViewStock(String ingredient, double ingredientrestante, String dateStock) {
        this.ingredient = ingredient;
        this.ingredientrestante = ingredientrestante;
        this.dateStock = dateStock;
    }

    public ViewStock() {
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public double getIngredientrestante() {
        return ingredientrestante;
    }

    public void setIngredientrestante(double ingredientrestante) {
        this.ingredientrestante = ingredientrestante;
    }

    public String getDateStock() {
        return dateStock;
    }

    public void setDateStock(String dateStock) {
        this.dateStock = dateStock;
    }

    public ViewStock[] getStock() throws Exception{
        Connecty connecty = new Connecty();
        Connection c = connecty.getConnex();
        String requete = "select * from view_stock";
        Statement Stat = c.createStatement();
        ResultSet res = Stat.executeQuery(requete);
        Vector vecteur = new Vector();
        while (res.next()) {
            ViewStock cat = new ViewStock(res.getString(1), res.getDouble(2), res.getString(3));
            vecteur.add(cat);
        }
        ViewStock[] vao = new ViewStock[vecteur.size()];
        for (int i = 0; i < vecteur.size(); i++) {
            vao[i] = (ViewStock) vecteur.elementAt(i);
        }
        c.close();
        return vao;
    }
}
