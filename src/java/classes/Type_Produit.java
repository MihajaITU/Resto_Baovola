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
public class Type_Produit {
    int id;
    String designation;

    public Type_Produit(int id, String designation) {
        this.id = id;
        this.designation = designation;
    }
    
    public Type_Produit(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public Type_Produit[] getAllType()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from type_produit";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		Type_Produit cat= new Type_Produit(res.getInt(1),res.getString(2));
    		vecteur.add(cat);
    	}
    	Type_Produit[] vao=new Type_Produit[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(Type_Produit)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
    public int getIdType(String name)throws Exception
    {
        int retour=0;
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select id from type_produit where designation='"+name+"'";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		retour = res.getInt(1);
    	}
        c.close();
    	return retour;
    }
}
