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
}
