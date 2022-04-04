/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.Produit;

/**
 *
 * @author HASINA
 */
public class ServiceProduit {
    public ServiceProduit()
    {
        
    }
     public Produit[] findAllProduit() throws Exception
    {
        Produit produit=new Produit();
        return produit.getAllProduit();
    }
      public Produit[] findAllProduitByType(int idType) throws Exception
    {
        Produit produit=new Produit();
        return produit.getAllProduitByType(idType);
    }
    public int findIdProduit(String n) throws Exception
    {
        Produit pan=new Produit();
        return pan.getIdProduit(n);
    }
}
