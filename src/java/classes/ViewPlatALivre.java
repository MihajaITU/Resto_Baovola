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
public class ViewPlatALivre {
    int id;
    String lieu;
    Date daty;
    String nom;
    String deignation;
    double prixVente;
    Boolean etaLivre;
    int id_Livreur;
    
    public ViewPlatALivre(){
        
    }

    public ViewPlatALivre(int id, String lieu, Date daty, String nom, String deignation, double prixVente, Boolean etaLivre, int id_Livreur) {
        this.id = id;
        this.lieu = lieu;
        this.daty = daty;
        this.nom = nom;
        this.deignation = deignation;
        this.prixVente = prixVente;
        this.etaLivre = etaLivre;
        this.id_Livreur = id_Livreur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Date getDaty() {
        return daty;
    }

    public void setDaty(Date daty) {
        this.daty = daty;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDeignation() {
        return deignation;
    }

    public void setDeignation(String deignation) {
        this.deignation = deignation;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public Boolean getEtaLivre() {
        return etaLivre;
    }

    public void setEtaLivre(Boolean etaLivre) {
        this.etaLivre = etaLivre;
    }

    public int getId_Livreur() {
        return id_Livreur;
    }

    public void setId_Livreur(int id_Livreur) {
        this.id_Livreur = id_Livreur;
    }
    
    public ViewPlatALivre[] getPlatALivree(int id)throws Exception
    {
        Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from listeLivraison where id_Livreur='"+id+"' and etatLivre=false";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewPlatALivre cat= new ViewPlatALivre(res.getInt(1),res.getString(2),res.getDate(3),res.getString(4),res.getString(5),res.getDouble(6),res.getBoolean(7),res.getInt(8));
    		vecteur.add(cat);
    	}
    	ViewPlatALivre[] vao=new ViewPlatALivre[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewPlatALivre)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
    public ViewPlatALivre[] getAllPlatALivree()throws Exception
    {
        Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from listeLivraison";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewPlatALivre cat= new ViewPlatALivre(res.getInt(1),res.getString(2),res.getDate(3),res.getString(4),res.getString(5),res.getDouble(6),res.getBoolean(7),res.getInt(8));
    		vecteur.add(cat);
    	}
    	ViewPlatALivre[] vao=new ViewPlatALivre[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewPlatALivre)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
}
