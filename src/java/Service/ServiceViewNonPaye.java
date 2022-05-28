/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.ViewNonPaye;

/**
 *
 * @author HASINA
 */
public class ServiceViewNonPaye {
    public ServiceViewNonPaye(){
        
    }
     public ViewNonPaye[] findNonPaye() throws Exception
    {
        ViewNonPaye add=new ViewNonPaye();
        return add.getNonPaye();
    }
}
