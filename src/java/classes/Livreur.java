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
public class Livreur {
    int id;
    String nom;
    String mail;
    String mdp;

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Livreur(int id, String nom, String mail, String mdp) {
        this.id = id;
        this.nom = nom;
        this.mail = mail;
        this.mdp = mdp;
    }

    public Livreur()
    {
        
    }
    
    
    
    public Livreur[] getAllLivreur()throws Exception
    {
        Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from livreur";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		Livreur cat= new Livreur(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));
    		vecteur.add(cat);
    	}
    	Livreur[] vao=new Livreur[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(Livreur)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
    public int getIdLivreur(String mail)throws Exception
    {
        int retour=0;
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select id from livreur where mail='"+mail+"'";
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
    public boolean loginLivreur(String n,String m)throws Exception
    {
        Livreur[] tab= getAllLivreur();
        for(Livreur tabl : tab)
        {
            if(tabl.getMail().equalsIgnoreCase(n) && tabl.getMdp().equalsIgnoreCase(m))
            {
                return true;
            }
        }
        
        return false;
    }
    public Livreur getLivreur(String n,String m)throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
        Livreur bat= new Livreur();
    	String requete="select * from livreur where mail='"+n+"' and mdp='"+m+"'";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	while(res.next())
    	{
            bat= new Livreur(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));
    	}
        c.close();
    	return bat;
    }
}
