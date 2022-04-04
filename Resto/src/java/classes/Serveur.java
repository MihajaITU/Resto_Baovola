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
public class Serveur {
    int id;
    String nom;
    
    public Serveur()
    {
        
    }
    
    public Serveur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    public Serveur[] getAllServeur()throws Exception
    {
        Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from serveur";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		Serveur cat= new Serveur(res.getInt(1),res.getString(2));
    		vecteur.add(cat);
    	}
    	Serveur[] vao=new Serveur[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(Serveur)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
    public int getIdServeur(String name)throws Exception
    {
        int retour=0;
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select id from serveur where nom='"+name+"'";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		retour = res.getInt(1);
    	}
        c.close();
    	return retour;
    }
}
