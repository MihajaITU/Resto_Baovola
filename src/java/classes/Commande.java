/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author HASINA
 */
public class Commande {
    int id;
    int id_tables;
    int id_Produit;
    int unite;

    public Commande(int id, int id_tables, int id_Produit, int unite) {
        this.id = id;
        this.id_tables = id_tables;
        this.id_Produit = id_Produit;
        this.unite = unite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_tables() {
        return id_tables;
    }

    public void setId_tables(int id_tables) {
        this.id_tables = id_tables;
    }

    public int getId_Produit() {
        return id_Produit;
    }

    public void setId_Produit(int id_Produit) {
        this.id_Produit = id_Produit;
    }

    public int getUnite() {
        return unite;
    }

    public void setUnite(int unite) {
        this.unite = unite;
    }
}
