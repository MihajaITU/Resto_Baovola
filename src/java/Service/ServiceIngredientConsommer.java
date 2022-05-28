/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.ViewIngredientConsommer;

/**
 *
 * @author HASINA
 */
public class ServiceIngredientConsommer {
    public ServiceIngredientConsommer(){
        
    }
    public ViewIngredientConsommer[] findAllIngredient(String d1,String d2) throws Exception
    {
        ViewIngredientConsommer add=new ViewIngredientConsommer();
        return add.getAllIngredient(d1,d2);
    }
}
