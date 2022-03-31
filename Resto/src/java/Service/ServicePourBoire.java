/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.ViewPourBoire;
import java.util.Date;

/**
 *
 * @author HASINA
 */
public class ServicePourBoire {
    public ServicePourBoire()
    {
        
    }
    public ViewPourBoire[] findPourBoire(int ids, String d1, String d2) throws Exception
    {
        ViewPourBoire view=new ViewPourBoire();
        return view.getPourBoire(ids,d1,d2);
    }
}
