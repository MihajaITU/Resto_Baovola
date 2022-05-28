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
public class Addition {
    int id;
    int idTable;
    String designation;
    double addition;

    public Addition(int id, int idTable, String designation, double addition) {
        this.id = id;
        this.idTable = idTable;
        this.designation = designation;
        this.addition = addition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getAddition() {
        return addition;
    }

    public void setAddition(double addition) {
        this.addition = addition;
    }
    
    
    public Addition(){
        
    }
    
    public Addition[] getAllAddition()throws Exception
    {
    	Connecty connecty=new Connecty();
    	Connection c= connecty.getConnex();
    	String requete="select * from addition";
    	Statement Stat = c.createStatement();
    	ResultSet res= Stat.executeQuery(requete);
    	Vector vecteur=new Vector(); 
    	while(res.next())
    	{
    		Addition cat= new Addition(res.getInt(1),res.getInt(2),res.getString(3),res.getDouble(4));
    		vecteur.add(cat);
    	}
    	Addition[] vao=new Addition[vecteur.size()];
    	for (int i=0;i<vecteur.size();i++)
    	{
    		vao[i]=(Addition)vecteur.elementAt(i);
    	}
        c.close();
    	return vao;
    }
   
}
