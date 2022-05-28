/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.ViewPaiement;
import java.util.Date;

/**
 *
 * @author HASINA
 */
public class ServiceViewPaiement {
    public ServiceViewPaiement(){
        
    }
     public ViewPaiement[] findAllPaiement(String d1, String d2) throws Exception
    {
        ViewPaiement add=new ViewPaiement();
        return add.getAllPaiement(d1,d2);
    }
     public double [] findTotal(ViewPaiement[]liste)throws Exception
     {
         ViewPaiement add=new ViewPaiement();
         return add.getTotal(liste);
     }
}
