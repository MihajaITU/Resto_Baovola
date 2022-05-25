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
public class ViewPourBoire {
    
    int id_serveur;
    String nom;
    double prixvente;
    double pourboire;
    Date dateCommande;

    public ViewPourBoire(){
        
    }
    
    public ViewPourBoire(int id_serveur, String nom, double prixvente, double pourboire, Date dateCommande) {
        this.id_serveur = id_serveur;
        this.nom = nom;
        this.prixvente = prixvente;
        this.pourboire = pourboire;
        this.dateCommande = dateCommande;
    }

    public int getId_serveur() {
        return id_serveur;
    }

    public void setId_serveur(int id_serveur) {
        this.id_serveur = id_serveur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixvente() {
        return prixvente;
    }

    public void setPrixvente(double prixvente) {
        this.prixvente = prixvente;
    }

    public double getPourboire() {
        return pourboire;
    }

    public void setPourboire(double pourboire) {
        this.pourboire = pourboire;
    }

    public Date getDatecommande() {
        return dateCommande;
    }

    public void setDatecommande(Date datecommande) {
        this.dateCommande = datecommande;
    }
    
    public ViewPourBoire[] getPourBoire(int ids,String d1,String d2)throws Exception
    {
        Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select id_serveur,nom,totalprixvente ,sum(totalpourboire)as totalpourboire,datecommande from view_pourboire where id_serveur='"+ids+"' and datecommande >= '"+d1+"' and datecommande <= '"+d2+"'  group by id_serveur,nom,totalprixvente ,totalpourboire,datecommande ";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewPourBoire cat= new ViewPourBoire(res.getInt(1),res.getString(2),res.getDouble(3),res.getDouble(4),res.getDate(5));
    		vecteur.add(cat);
    	}
    	ViewPourBoire[] vao=new ViewPourBoire[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewPourBoire)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
}
