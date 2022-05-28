/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.ViewPlatNonLivree;

/**
 *
 * @author HASINA
 */
public class ServiceViewPlatNonLivree {
    public ServiceViewPlatNonLivree(){
        
    }
    public ViewPlatNonLivree[] findAllPlat() throws Exception
    {
        ViewPlatNonLivree add=new ViewPlatNonLivree();
        return add.getAllPlat();
    }
      public void livreeCommande() throws Exception
    {
        ViewPlatNonLivree pan=new ViewPlatNonLivree();
        pan.updateDetails();
    }
}
