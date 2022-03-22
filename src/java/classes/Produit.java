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
public class Produit 
{
    int id;
    String designation;

    public Produit()
    {
        
    }
    
    public Produit(int id, String designation) {
        this.id = id;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public Produit[] getAllProduit()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from produit";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		Produit cat= new Produit(res.getInt(1),res.getString(2));
    		vecteur.add(cat);
    	}
    	Produit[] vao=new Produit[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(Produit)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
}
