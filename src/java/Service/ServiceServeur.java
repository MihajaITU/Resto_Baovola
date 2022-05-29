/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.Serveur;

/**
 *
 * @author HASINA
 */
public class ServiceServeur {
    public ServiceServeur(){
        
    }
    public Serveur[] findAllServeur() throws Exception
    {
        Serveur serveur=new Serveur();
        return serveur.getAllServeur();
    }
     public Serveur findServeur(String n,String mdp) throws Exception
    {
        Serveur pan=new Serveur();
        return pan.getServeur(n,mdp);
    }
     public int findOneServeur(String n) throws Exception
    {
        Serveur pan=new Serveur();
        return pan.getIdServeur(n);
    }
     
     public Serveur findIddServeur(String n) throws Exception
    {
        Serveur pan=new Serveur();
        return pan.getIddServeur(n);
    }
     public int findNameServeur(int n) throws Exception
    {
        Serveur pan=new Serveur();
        return pan.getNameServeur(n);
    }
     
     public Serveur[] findSpeServeur(int n) throws Exception
    {
        Serveur pan=new Serveur();
        return pan.getSpeServeur(n);
    }
     
     public boolean ServeurLogin(String n,String m) throws Exception
    {
        Serveur livreur=new Serveur();
        return livreur.loginServeur(n,m);
    }
}
