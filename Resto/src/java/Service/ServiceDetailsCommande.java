/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.DetailsCommande;

/**
 *
 * @author HASINA
 */
public class ServiceDetailsCommande {
    public ServiceDetailsCommande(){
        
    }
    public void addDetails(int idc,int idp,double pv) throws Exception
    {
        DetailsCommande pan=new DetailsCommande();
        pan.insertDetails(idc,idp,pv);
    }
}
