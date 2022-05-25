/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.Produit;
import classes.ViewPrixProduit;

/**
 *
 * @author HASINA
 */
public class ServiceViewPrixProduit {
    public ServiceViewPrixProduit()
    {
        
    }
     public ViewPrixProduit[] findPrixDeRevient() throws Exception
    {
        ViewPrixProduit produit=new ViewPrixProduit();
        return produit.getPrixDeRevient();
    }
//    public Double findPrixDeVente(ViewPrixProduit prixDeRevient) throws Exception
//    {
//        ViewPrixProduit produit=new ViewPrixProduit();
//        return produit.getPrixDeVente(prixDeRevient);
//    }
//    public Double[] findPrixParView(ViewPrixProduit[] prixDeRevient) throws Exception
//    {
//        ViewPrixProduit produit=new ViewPrixProduit();
//        return produit.getPrixParView(prixDeRevient);
//    }
      public ViewPrixProduit[] findAllPrixVente() throws Exception
    {
        ViewPrixProduit produit=new ViewPrixProduit();
        return produit.getAllPrixVente();
    }
}
