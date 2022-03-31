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

/**
 *
 * @author HASINA
 */
public class Commande {
    int id;
    int id_tables;
    Date commande;
    
    public Commande(){
        
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


    public Date getCommande() {
        return commande;
    }

    public void setCommande(Date commande) {
        this.commande = commande;
    }

    public Commande(int id, int id_tables, Date commande) {
        this.id = id;
        this.id_tables = id_tables;
        this.commande = commande;
    }

    public void insertCommande(int idt,int ids)throws Exception
    {
       Connecty connecty=new Connecty();
       Connection c= connecty.getConnex();
       String req="insert into commande values(null,'"+idt+"','"+ids+"',now())";
       Statement Stat = c.createStatement();
       ResultSet res= Stat.executeQuery(req); 
       c.close();
    }
}
