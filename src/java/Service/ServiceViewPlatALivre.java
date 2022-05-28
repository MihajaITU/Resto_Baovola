/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.ViewPlatALivre;

/**
 *
 * @author HASINA
 */
public class ServiceViewPlatALivre {
     public ServiceViewPlatALivre(){
        
    }
    public ViewPlatALivre[] findPlatALivree(int id) throws Exception
    {
        ViewPlatALivre add=new ViewPlatALivre();
        return add.getPlatALivree(id);
    }
    
    public ViewPlatALivre[] findAllPlatALivree() throws Exception
    {
        ViewPlatALivre add=new ViewPlatALivre();
        return add.getAllPlatALivree();
    }
   
}
