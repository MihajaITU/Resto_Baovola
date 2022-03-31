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
public class DetailsCommande {
    int id;
    int idCommande;
    int idProduit;
    int id_Serveur;
    double prixVente;

    public DetailsCommande(int id, int idCommande, int idProduit, int id_Serveur, double prixVente) {
        this.id = id;
        this.idCommande = idCommande;
        this.idProduit = idProduit;
        this.id_Serveur = id_Serveur;
        this.prixVente = prixVente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public int getId_Serveur() {
        return id_Serveur;
    }

    public void setId_Serveur(int id_Serveur) {
        this.id_Serveur = id_Serveur;
    }

    public double getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }
    
    public DetailsCommande(){
        
    }
    
    
    public void insertDetails(int idc,int idp,double pv)throws Exception
    {
       Connecty connecty=new Connecty();
       Connection c= connecty.getConnex();
       String req="insert into detailscommande values(null,'"+idc+"','"+idp+"','"+pv+"')";
       Statement Stat = c.createStatement();
       ResultSet res= Stat.executeQuery(req); 
       c.close();
    }
}
