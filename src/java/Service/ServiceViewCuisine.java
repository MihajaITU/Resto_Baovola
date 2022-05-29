/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.ViewCuisine;

/**
 *
 * @author HASINA
 */
public class ServiceViewCuisine {
     public ServiceViewCuisine(){
        
    }
    public ViewCuisine[] findPlatPrepare() throws Exception
    {
        ViewCuisine add=new ViewCuisine();
        return add.getPlatPrepare();
    }
    
    public ViewCuisine[] getAllFromCuisine() throws Exception
    {
        ViewCuisine add=new ViewCuisine();
        return add.getAllFromCuisine();
    }
   
     public ViewCuisine[] getAllCuisineCuit() throws Exception
    {
        ViewCuisine add=new ViewCuisine();
        return add.getAllCuisineCuit();
    }
}
