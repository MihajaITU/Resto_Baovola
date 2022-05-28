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
public class ViewPrixProduit {
    
    int id_produit;
    String designation;
    String intitule;
    double prixrevient;
    double prixdevente;
    float prix;

   

    public ViewPrixProduit(int id_produit, String designation, double prixrevient, double prixdevente) {
        this.id_produit = id_produit;
        this.designation = designation;
        this.prixrevient = prixrevient;
        this.prixdevente = prixdevente;
    }
    public ViewPrixProduit(int id_produit, String designation, double prixrevient) {
        this.id_produit = id_produit;
        this.designation = designation;
        this.prixrevient = prixrevient;
        
    }
    
     public ViewPrixProduit(String prod, String type, float prix) {
        this.designation = prod;
        this.intitule = type;
        this.prix = prix;
        
    }

    public int getId_produit() {
        return id_produit;
    }
    
     public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    
    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixrevient() {
        return prixrevient;
    }

    public void setPrixrevient(double prixrevient) {
        this.prixrevient = prixrevient;
    }

    public double getPrixdevente() {
        return prixdevente;
    }

    public void setPrixdevente(double prixdevente) {
        this.prixdevente = prixdevente;
    }
     public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    
    public ViewPrixProduit(){
        
    }
    
    public ViewPrixProduit[] getPrixDeRevient()throws Exception
    {
        Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from view_prixRevient";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewPrixProduit cat= new ViewPrixProduit(res.getInt(1),res.getString(2),res.getDouble(3));
    		vecteur.add(cat);
    	}
    	ViewPrixProduit[] vao=new ViewPrixProduit[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewPrixProduit)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
//    public Double getPrixDeVente(ViewPrixProduit prixDeRevient) throws Exception
//    {
//        int marge1=5000;
//        int marge2=10000;
//        double prixvente=0;
//        //ViewPrixProduit view=new ViewPrixProduit();
//        if(prixDeRevient.getPrixrevient()<marge1)
//        {
//            prixvente=prixDeRevient.getPrixrevient()*3;
//            setPrixdevente(prixvente);
//        }else if(prixDeRevient.getPrixrevient()>=marge1 && prixDeRevient.getPrixrevient()<=marge2)
//        {
//            prixvente=prixDeRevient.getPrixrevient()*2;
//            setPrixdevente(prixvente);
//        }else if(prixDeRevient.getPrixrevient()>marge2)
//        {
//            prixvente=prixDeRevient.getPrixrevient()*1.5;
//            setPrixdevente(prixvente);
//        }
//        return prixvente;
//    }
      public ViewPrixProduit getPrixDeVente(ViewPrixProduit prixDeRevient) throws Exception
    {
        int marge1=5000;
        int marge2=10000;
        double prixvente=0;
        //ViewPrixProduit view=new ViewPrixProduit();
        if(prixDeRevient.getPrixrevient()<marge1)
        {
            prixvente=prixDeRevient.getPrixrevient()*3;
            prixDeRevient.setPrixdevente(prixvente);
        }else if(prixDeRevient.getPrixrevient()>=marge1 && prixDeRevient.getPrixrevient()<=marge2)
        {
            prixvente=prixDeRevient.getPrixrevient()*2;
            prixDeRevient.setPrixdevente(prixvente);
        }else if(prixDeRevient.getPrixrevient()>marge2)
        {
            prixvente=prixDeRevient.getPrixrevient()*1.5;
            prixDeRevient.setPrixdevente(prixvente);
        }
        return prixDeRevient;
    }
    
    public ViewPrixProduit[] getPrixParView(ViewPrixProduit[] prixDeRevient) throws Exception
    {
       ViewPrixProduit[] retour= new ViewPrixProduit[prixDeRevient.length];
        for(int i=0;i<prixDeRevient.length;i++)
        {
            retour[i]=getPrixDeVente(prixDeRevient[i]);
        }
        return retour;
    }
    
    public ViewPrixProduit[] getAllPrixVente()throws Exception
    {
       ViewPrixProduit[] prixDeRevient=getPrixDeRevient();
       ViewPrixProduit[] prix=getPrixParView(prixDeRevient);
       return prix;
    }
    
     public ViewPrixProduit[] getProduitPrixType()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from view_produitPrixType";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewPrixProduit cat= new ViewPrixProduit(res.getString(1),res.getString(2),res.getInt(3));
    		vecteur.add(cat);
    	}
    	ViewPrixProduit[] vao=new ViewPrixProduit[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewPrixProduit)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
    
}
