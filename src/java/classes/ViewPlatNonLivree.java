/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author HASINA
 */
public class ViewPlatNonLivree {
    int id_table;
    int id_produit;
    String produit;
    int id_commande;

    public ViewPlatNonLivree(int id_table, int id_produit, String produit, int id_commande) {
        this.id_table = id_table;
        this.id_produit = id_produit;
        this.produit = produit;
        this.id_commande = id_commande;
    }

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }
    

   
    
    public ViewPlatNonLivree(){
        
    }
    
    public int getId_table() {
        return id_table;
    }

    public void setId_table(int id_table) {
        this.id_table = id_table;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }
    
    public ViewPlatNonLivree[] getAllPlat()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from addition";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewPlatNonLivree cat= new ViewPlatNonLivree(res.getInt(1),res.getInt(2),res.getString(3),res.getInt(4));
    		vecteur.add(cat);
    	}
    	ViewPlatNonLivree[] vao=new ViewPlatNonLivree[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewPlatNonLivree)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
    
      public void updateDetails()throws Exception
    {
       Connecty connecty=new Connecty();
       Connection c= connecty.getConnex();
       String req="update detailscommande set estlivree= true where idCommande='"+this.id_commande+"' and idTable='"+this.id_table+"' and idProduit='"+this.id_produit+"'";
       Statement Stat = c.createStatement();
       ResultSet res= Stat.executeQuery(req); 
       c.close();
    }
    
}
