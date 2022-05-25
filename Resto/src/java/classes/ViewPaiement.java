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
public class ViewPaiement {
    
    int id_type_paiement;
    String paiement;
    double montant;
    
    public ViewPaiement(){
        
    }

    public ViewPaiement(int id_type_paiement, String paiement, double montant) {
        this.id_type_paiement = id_type_paiement;
        this.paiement = paiement;
        this.montant = montant;
    }

    public int getId_type_paiement() {
        return id_type_paiement;
    }

    public void setId_type_paiement(int id_type_paiement) {
        this.id_type_paiement = id_type_paiement;
    }

    public String getPaiement() {
        return paiement;
    }

    public void setPaiement(String paiement) {
        this.paiement = paiement;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    
    
    public ViewPaiement[] getAllPaiement(String d1, String d2) throws Exception
    {
        Connecty connecty=new Connecty();
        Connection c=connecty.getConnex();
        String requete="select id,designation,sum(valeur ) as total from viewtotal_paiementByType where dateCommande>'"+d1+"' and dateCommande <'"+d2+"' group by id,designation";
        Statement Stat=c.createStatement();
        ResultSet res=Stat.executeQuery(requete);
        Vector vecteur=new Vector();
        while(res.next()){
            ViewPaiement cat=new ViewPaiement(res.getInt(1),res.getString(2),res.getDouble(3));
            vecteur.add(cat);
        }
        ViewPaiement[] vao=new ViewPaiement[vecteur.size()];
        for(int i=0;i<vecteur.size();i++)
        {
            vao[i]=(ViewPaiement)vecteur.elementAt(i);
        }
        c.close();
        return vao;
    }
    
    public double [] getTotal(ViewPaiement[] liste){
        double[] tab= new double[3];
        tab[0]=0;
        tab[1]=0;
        tab[2]=0;
        for(int i=0;i<liste.length;i++)
        {
            if(liste[i].getId_type_paiement()==1){
                tab[0]=tab[0]+liste[i].getMontant();
            }else if(liste[i].getId_type_paiement()==2){
                tab[1]=tab[1]+liste[i].getMontant();
            }
           
        }
        tab[2]=tab[0]+tab[1];
        return tab;
    }
    public ViewPaiement[] tresor(){
        ViewPaiement huhu= new ViewPaiement();
        ViewPaiement[] liste= new ViewPaiement[10];
        liste[0]=new ViewPaiement(1,"espece",1500.00);
        liste[1]=new ViewPaiement(1,"espece",1800.00);
        liste[2]=new ViewPaiement(1,"espece",7500.00);
        liste[3]=new ViewPaiement(1,"espece",1500.00);
        liste[4]=new ViewPaiement(1,"espece",6000.00);
        liste[5]=new ViewPaiement(2,"cheque",3000.00);
        liste[6]=new ViewPaiement(2,"cheque",1200.00);
        liste[7]=new ViewPaiement(2,"cheque",100.00);
        liste[8]=new ViewPaiement(2,"cheque",500.00);
        liste[9]=new ViewPaiement(2,"cheque",9000.00);
        double[] tresor=huhu.getTotal(liste);
        return liste;
    }
}
