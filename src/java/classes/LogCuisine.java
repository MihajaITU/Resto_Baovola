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
public class LogCuisine {
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

    public LogCuisine(int id, String nom, String mail, String mdp) {
        this.id = id;
        this.nom = nom;
        this.mail = mail;
        this.mdp = mdp;
    }

    public LogCuisine()
    {
        
    }
    
    
    
    public LogCuisine[] getAllLogCuisine()throws Exception
    {
        Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from LogCuisine";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		LogCuisine cat= new LogCuisine(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));
    		vecteur.add(cat);
    	}
    	LogCuisine[] vao=new LogCuisine[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(LogCuisine)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
    public int getIdLogCuisine(String mail)throws Exception
    {
        int retour=0;
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select id from logCuisine where mail='"+mail+"'";
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
    public boolean LogCuisineLogin(String n,String m)throws Exception
    {
        LogCuisine[] tab= getAllLogCuisine();
        for(LogCuisine tabl : tab)
        {
            if(tabl.getMail().equalsIgnoreCase(n) && tabl.getMdp().equalsIgnoreCase(m))
            {
                return true;
            }
        }
        
        return false;
    }
    public LogCuisine getLogCuisine(String n,String m)throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
        LogCuisine bat= new LogCuisine();
    	String requete="select * from logCuisine where mail='"+n+"' and mdp='"+m+"'";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	while(res.next())
    	{
            bat= new LogCuisine(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));
    	}
        c.close();
    	return bat;
    }
}
