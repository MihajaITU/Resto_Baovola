/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.Addition;

/**
 *
 * @author HASINA
 */
public class ServiceAddition {
    public ServiceAddition(){
        
    }
    public Addition[] findAllAddition() throws Exception
    {
        Addition add=new Addition();
        return add.getAllAddition();
    }
}
