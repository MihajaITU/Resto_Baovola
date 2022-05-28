/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author HASINA
 */
public class ViewIngredientConsommer {
    int id_ingredient;
    String designation;
    String datecommande;
    double quantite;
    double prixTotal;

    public ViewIngredientConsommer(String designation, String datecommande, double quantite, double prixTotal) {
        this.designation = designation;
        this.datecommande = datecommande;
        this.quantite = quantite;
        this.prixTotal = prixTotal;
    }

    public int getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(int id_ingredient) {
        this.id_ingredient = id_ingredient;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDatecommande() {
        return datecommande;
    }

    public void setDatecommande(String datecommande) {
        this.datecommande = datecommande;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    

    
    
    
    public ViewIngredientConsommer(){
        
    }
   

   
    public ViewIngredientConsommer[] getAllIngredient(String d1,String d2)throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
        String requete=" select designation,datecommande, sum(quantitejour) as ingredientConsomeeJour,sum(prixparjour) as prixJour from ingredientConsommeJour where datecommande >= '"+d1+"' and datecommande <= '"+d2+"' group by  designation,datecommande ";
    	//String requete=" select designation,datecommande, sum(quantitejour) as ingredientConsomeeJour,sum(prixparjour) as prixJour from ingredientConsommeJour  group by  designation,datecommande ";
        Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewIngredientConsommer cat= new ViewIngredientConsommer(res.getString(1),res.getString(2),res.getDouble(3),res.getDouble(4));
    		vecteur.add(cat);
    	}
    	ViewIngredientConsommer[] vao=new ViewIngredientConsommer[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewIngredientConsommer)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
}
