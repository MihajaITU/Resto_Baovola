/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.DetailsCommande;
import classes.Produit;

/**
 *
 * @author HASINA
 */
public class ServiceDetailsCommande {
    public ServiceDetailsCommande(){
        
    }
    public void addDetails(int idc,int idp,int ids,double pv) throws Exception
    {
        DetailsCommande pan=new DetailsCommande();
        pan.insertDetails(idc,idp,ids,pv);
    }
     public void ajoutCommander(Produit[] produits,int[] unite, int idc, int ids) throws Exception
    {
        DetailsCommande pan=new DetailsCommande();
        pan.commander(produits,unite,idc,ids);
    }
}
