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
public class Produit {

    int id;
    int id_type_produit;
    String designation;

    public Produit() {

    }

    public Produit(int id, int id_type_produit, String designation) {
        this.id = id;
        this.id_type_produit = id_type_produit;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTypeProduit() {
        return id_type_produit;
    }

    public void setIdTypeProduit(int id) {
        this.id_type_produit = id_type_produit;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Produit[] getAllProduit() throws Exception {
        Connecty connecty = new Connecty();
        Connection c = connecty.getConnex();
        String requete = "select * from produit";
//        System.out.println("connection :"+c);
        Statement Stat = c.createStatement();
        ResultSet res = Stat.executeQuery(requete);
        Vector vecteur = new Vector();
        while (res.next()) {
            Produit cat = new Produit(res.getInt(1), res.getInt(2), res.getString(3));
            vecteur.add(cat);
        }
        Produit[] vao = new Produit[vecteur.size()];
        for (int i = 0; i < vecteur.size(); i++) {
            vao[i] = (Produit) vecteur.elementAt(i);
        }
        c.close();
        return vao;
    }

    public Produit[] getAllProduitByType(int idType) throws Exception {
        Connecty connecty = new Connecty();
        Connection c = connecty.getConnex();
        String requete = "select * from produit where id_type_produit='" + idType + "'";
        Statement Stat = c.createStatement();
        ResultSet res = Stat.executeQuery(requete);
        Vector vecteur = new Vector();
        while (res.next()) {
            Produit cat = new Produit(res.getInt(1), res.getInt(2), res.getString(3));
            vecteur.add(cat);
        }
        Produit[] vao = new Produit[vecteur.size()];
        for (int i = 0; i < vecteur.size(); i++) {
            vao[i] = (Produit) vecteur.elementAt(i);
        }
        c.close();
        return vao;
    }

    public int getIdProduit(String name) throws Exception {
        int retour = 0;
        Connecty connecty = new Connecty();
        Connection c = connecty.getConnex();
        String requete = "select id from produit where designation='" + name + "'";
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
