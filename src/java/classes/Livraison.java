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
public class Livraison {
    int id;
    String lieu;
    Date daty;
    
    public Livraison(){
        
    }

    public Livraison(int id, String lieu, Date daty) {
        this.id = id;
        this.lieu = lieu;
        this.daty = daty;
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
    
    public void insertLivraison(String lieu,Date daty)throws Exception
    {
       Connecty connecty=new Connecty();
       Connection c= connecty.getConnex();
       String req="insert into Livraison values(nextval('livraison_sq'),'"+lieu+"','"+daty+"')";
       Statement Stat = c.createStatement();
       ResultSet res= Stat.executeQuery(req); 
       c.close();
    }
}
