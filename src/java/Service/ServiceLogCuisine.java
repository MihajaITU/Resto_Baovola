/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import classes.LogCuisine;

/**
 *
 * @author jeant
 */
public class ServiceLogCuisine {
     public LogCuisine[] findAllLogCuisine() throws Exception
    {
        LogCuisine admin=new LogCuisine();
        return admin.getAllLogCuisine();
    }
       public LogCuisine findLogCuisine(String m,String mdp) throws Exception
    {
        LogCuisine admin=new LogCuisine();
        return admin.getLogCuisine(m,mdp);
    }
     public boolean LogCuisineLogin(String n,String m) throws Exception
    {
        LogCuisine livreur=new LogCuisine();
        return livreur.LogCuisineLogin(n,m);
    }
}
