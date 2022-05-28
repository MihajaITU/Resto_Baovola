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
public class ViewNonPaye {
    int idCommande;
    int idTable;
    String designation;
    double total;
    Date daty;

    public ViewNonPaye(int idCommande, int idTable, String designation, double total, Date daty) {
        this.idCommande = idCommande;
        this.idTable = idTable;
        this.designation = designation;
        this.total = total;
        this.daty = daty;
    }

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getIdTable() {
        return idTable;
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDaty() {
        return daty;
    }

    public void setDaty(Date daty) {
        this.daty = daty;
    }

    
    
    public ViewNonPaye(){
        
    }
    
    
    
     public ViewNonPaye[] getNonPaye()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from view_totalAddNonPayer";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		ViewNonPaye cat= new ViewNonPaye(res.getInt(1),res.getInt(2),res.getString(3),res.getDouble(4),res.getDate(5));
    		vecteur.add(cat);
    	}
    	ViewNonPaye[] vao=new ViewNonPaye[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(ViewNonPaye)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
   
}
