/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HASINA
 */
public class DetailsLivraison {
    int id;
    int id_Livreur;
    int id_Produit;
    double prixVente;
    boolean etatLivre;
    int id_Livraison;
    
    public DetailsLivraison(){
        
    }

    public DetailsLivraison(int id, int id_Livreur, int id_Produit, double prixVente, boolean etatLivre, int id_Livraison) {
        this.id = id;
        this.id_Livreur = id_Livreur;
        this.id_Produit = id_Produit;
        this.prixVente = prixVente;
        this.etatLivre = etatLivre;
        this.id_Livraison = id_Livraison;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Livreur() {
        return id_Livreur;
    }

    public void setId_Livreur(int id_Livreur) {
        this.id_Livreur = id_Livreur;
    }

    public int getId_Produit() {
        return id_Produit;
    }

    public void setId_Produit(int id_Produit) {
        this.id_Produit = id_Produit;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public boolean isEtatLivre() {
        return etatLivre;
    }

    public void setEtatLivre(boolean etatLivre) {
        this.etatLivre = etatLivre;
    }

    public int getId_Livraison() {
        return id_Livraison;
    }

    public void setId_Livraison(int id_Livraison) {
        this.id_Livraison = id_Livraison;
    }
    
    public void insertDetailsLivraison(int idl,int idp,double pv,int idLivr)throws Exception
    {
       Connecty connecty=new Connecty();
       Connection c= connecty.getConnex();
       String req="insert into detailsLivraison values(nextval('detailsLivraison_sq'),'"+idl+"','"+idp+"','"+pv+"',false,'"+idLivr+"')";
       Statement Stat = c.createStatement();
       ResultSet res= Stat.executeQuery(req); 
       c.close();
    }
    
    public void updateDetailsLivraison(int idp,int idl)throws Exception
    {
       Connecty connecty=new Connecty();
       Connection c= connecty.getConnex();
       String req="update detailsLivraison set etatLivre= true where id_Produit='"+idp+"' and id_Livraison='"+idl+"' ";
       Statement Stat = c.createStatement();
       ResultSet res= Stat.executeQuery(req); 
       c.close();
    }
}
