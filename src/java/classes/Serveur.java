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
public class Serveur {

    
    int id;
    String nom;
    String mail;
    String mdp;
    
    public Serveur(int id, String nom, String mail, String mdp) {
        this.id = id;
        this.nom = nom;
        this.mail = mail;
        this.mdp = mdp;
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
    

    public Serveur() {

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

    public Serveur[] getAllServeur() throws Exception {
        Connecty connecty = new Connecty();
        Connection c = connecty.getConnex();
        String requete = "select * from serveur";
        Statement Stat = c.createStatement();
        ResultSet res = Stat.executeQuery(requete);
        Vector vecteur = new Vector();
        while (res.next()) {
            Serveur cat = new Serveur(res.getInt(1), res.getString(2));
            vecteur.add(cat);
        }
        Serveur[] vao = new Serveur[vecteur.size()];
        for (int i = 0; i < vecteur.size(); i++) {
            vao[i] = (Serveur) vecteur.elementAt(i);
        }
        c.close();
        return vao;
    }
    
    public Serveur[] getSpeServeur(int d) throws Exception {
        Connecty connecty = new Connecty();
        Connection c = connecty.getConnex();
        String requete = "select * from serveur where id='" + d + "'";
        Statement Stat = c.createStatement();
        ResultSet res = Stat.executeQuery(requete);
        Vector vecteur = new Vector();
        while (res.next()) {
            Serveur cat = new Serveur(res.getInt(1), res.getString(2));
            vecteur.add(cat);
        }
        Serveur[] vao = new Serveur[vecteur.size()];
        for (int i = 0; i < vecteur.size(); i++) {
            vao[i] = (Serveur) vecteur.elementAt(i);
        }
        c.close();
        return vao;
    }

    public int getIdServeur(String name) throws Exception {
        int retour = 0;
        Connecty connecty = new Connecty();
        Connection c = connecty.getConnex();
        String requete = "select id from serveur where nom='" + name + "'";
        Statement Stat = c.createStatement();
        ResultSet res = Stat.executeQuery(requete);
        Vector vecteur = new Vector();
        while (res.next()) {
            retour = res.getInt(1);
        }
        c.close();
        return retour;
    }
 public boolean loginServeur(String n,String m)throws Exception
    {
        Serveur[] tab= getAllServeur();
        for(Serveur tabl : tab)
        {
            if(tabl.getMail().equalsIgnoreCase(n) && tabl.getMdp().equalsIgnoreCase(m))
            {
                return true;
            }
        }
        
        return false;
    }
    public Serveur getServeur(String n,String m)throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
        Serveur bat= new Serveur();
    	String requete="select * from Serveur where mail='"+n+"' and mdp='"+m+"'";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	while(res.next())
    	{
            bat= new Serveur(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));
    	}
        c.close();
    	return bat;
    }
    
    public Serveur getOneServeur(String n)throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
        Serveur bat= new Serveur();
    	String requete="select * from Serveur where nom='"+n+"'";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	while(res.next())
    	{
            bat= new Serveur(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));
    	}
        c.close();
    	return bat;
    }
    
     public Serveur getIddServeur(String m)throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
        Serveur bat= new Serveur();
    	String requete="select id from Serveur where mail='"+m+"'";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	while(res.next())
    	{
            bat= new Serveur(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));
    	}
        c.close();
    	return bat;
    }
     
       public int getNameServeur(int name) throws Exception {
        int retour = 0;
        Connecty connecty = new Connecty();
        Connection c = connecty.getConnex();
        String requete = "select id from serveur where id='" + name + "'";
        Statement Stat = c.createStatement();
        ResultSet res = Stat.executeQuery(requete);
        Vector vecteur = new Vector();
        while (res.next()) {
            retour = res.getInt(1);
        }
        c.close();
        return retour;
    }
}
