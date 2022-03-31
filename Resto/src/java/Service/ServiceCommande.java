/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.Commande;

/**
 *
 * @author HASINA
 */
public class ServiceCommande {
    public ServiceCommande(){
        
    }
    public void addCommande(int idt,int ids) throws Exception
    {
        Commande pan=new Commande();
        pan.insertCommande(idt,ids);
    }
}
