/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author jeant
 */
public class RecetteProduit {
    
    int idProduit;
    String produit;
    String ingredient;
    int quantite;
    String reference;

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public RecetteProduit(int idProduit, String produit, String ingredient, int quantite, String reference) {
        this.idProduit = idProduit;
        this.produit = produit;
        this.ingredient = ingredient;
        this.quantite = quantite;
        this.reference = reference;
    }

    public RecetteProduit(int idProduit, String ingredient, int quantite, String reference) {
        this.idProduit = idProduit;
        this.ingredient = ingredient;
        this.quantite = quantite;
        this.reference = reference;
    }
    
    
    public RecetteProduit(){}
    
    public List<RecetteProduit> ListeRecetteProduit(int idProduit)throws Exception{
        Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
        String req="select * from RecetteProduit where idProduit="+idProduit;
        Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(req);
    	List<RecetteProduit> vecteur=new ArrayList<>(); 
    	while(res.next())
    	{
    		RecetteProduit cat= new RecetteProduit(res.getInt(1),res.getString(2),res.getInt(3),res.getString(4));
    		vecteur.add(this);
    	}
        c.close();
    	return vecteur;
        
    }
    
}
