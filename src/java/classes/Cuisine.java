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
 * @author jeant
 */
public class Cuisine {
     int idCuisine;
    int id_DetailCommande;
    String marquage;
    
    
    public Cuisine(){}

    public int getIdCuisine() {
        return idCuisine;
    }

    public void setIdCuisine(int idCuisine) {
        this.idCuisine = idCuisine;
    }

    public int getid_DetailCommande() {
        return id_DetailCommande;
    }

    public void setid_DetailCommande(int idPlat) {
        this.id_DetailCommande = idPlat;
    }

    public String getMarquage() {
        return marquage;
    }

    public void setMarquage(String marquage) {
        this.marquage = marquage;
    }

    public Cuisine(int idCuisine, int id_DetailCommande, String marquage) {
        this.idCuisine = idCuisine;
        this.id_DetailCommande = id_DetailCommande;
        this.marquage = marquage;
    }
    
     public Cuisine[] getAllFromCuisine()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete=" select * from view_cuisine";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		Cuisine cat= new Cuisine(res.getInt(1),res.getInt(2),res.getString(3));
    		vecteur.add(cat);
    	}
    	Cuisine[] vao=new Cuisine[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(Cuisine)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
     
     public Cuisine[] getAllCuisineCuit ()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete=" select * from view_cuisine where marquage='Cuit'";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		Cuisine cat= new Cuisine(res.getInt(1),res.getInt(2),res.getString(3));
    		vecteur.add(cat);
    	}
    	Cuisine[] vao=new Cuisine[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(Cuisine)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
   
}
