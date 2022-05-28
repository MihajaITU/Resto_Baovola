/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.Livreur;

/**
 *
 * @author HASINA
 */
public class ServiceLivreur {
     public Livreur[] findAllLivreur() throws Exception
    {
        Livreur admin=new Livreur();
        return admin.getAllLivreur();
    }
       public Livreur findLivreur(String m,String mdp) throws Exception
    {
        Livreur admin=new Livreur();
        return admin.getLivreur(m,mdp);
    }
     public boolean livreurLogin(String n,String m) throws Exception
    {
        Livreur livreur=new Livreur();
        return livreur.loginLivreur(n,m);
    }
}
