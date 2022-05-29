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
public class ViewCuisine {
    
     int idCuisine;
    int id_DetailCommande;
    String marquage;
    String designation;
    String intitule;
    int id_Produit,id_Serveur;
    float prixVente;

    public int getId_DetailCommande() {
        return id_DetailCommande;
    }

    public void setId_DetailCommande(int id_DetailCommande) {
        this.id_DetailCommande = id_DetailCommande;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getId_Produit() {
        return id_Produit;
    }

    public void setId_Produit(int id_Produit) {
        this.id_Produit = id_Produit;
    }

    public int getId_Serveur() {
        return id_Serveur;
    }

    public void setId_Serveur(int id_Serveur) {
        this.id_Serveur = id_Serveur;
    }

    public float getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(float prixVente) {
        this.prixVente = prixVente;
    }
    
    

    public ViewCuisine(String marquage, String designation, String intitule, int id_Produit, int id_Serveur) {
        this.marquage = marquage;
        this.designation = designation;
        this.intitule = intitule;
        this.id_Produit = id_Produit;
        this.id_Serveur = id_Serveur;
    }
    
    
    public ViewCuisine(){}

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

    public ViewCuisine(int idCuisine, int id_DetailCommande, String marquage) {
        this.idCuisine = idCuisine;
        this.id_DetailCommande = id_DetailCommande;
        this.marquage = marquage;
    }
    
     public ViewCuisine[] getAllFromCuisine()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete=" select * from view_cuisine";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewCuisine cat= new ViewCuisine(res.getString(1),res.getString(2),res.getString(3),res.getInt(4),res.getInt(5));
    		vecteur.add(cat);
    	}
    	ViewCuisine[] vao=new ViewCuisine[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewCuisine)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
     
     public ViewCuisine[] getAllCuisineCuit ()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete=" select * from view_cuisine where marquage='Cuit'";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewCuisine cat= new ViewCuisine(res.getString(1),res.getString(2),res.getString(3),res.getInt(4),res.getInt(5));
    		vecteur.add(cat);
    	}
    	ViewCuisine[] vao=new ViewCuisine[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewCuisine)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
     
     public ViewCuisine[] getPlatPrepare ()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete=" select * from view_cuisine where marquage='En cours'";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewCuisine cat= new ViewCuisine(res.getString(1),res.getString(2),res.getString(3),res.getInt(4),res.getInt(5));
    		vecteur.add(cat);
    	}
    	ViewCuisine[] vao=new ViewCuisine[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewCuisine)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
}
