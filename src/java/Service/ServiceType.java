/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.Produit;
import classes.Type_Produit;

/**
 *
 * @author HASINA
 */
public class ServiceType {
     public ServiceType()
    {
        
    }
    public Type_Produit[] findAllType() throws Exception
    {
        Type_Produit type=new Type_Produit();
        return type.getAllType();
    }
}
