/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HASINA
 */
public class Connecty {
     private final static String URL = "jdbc:postgresql://localhost/restau" ;
    private final static String USER = "postgres" ;
    private final static String PASSWORD = "0000" ;
    public Connection getConnex() throws ClassNotFoundException {
        Connection connect = null ;
        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(URL, USER, PASSWORD);
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/restau", "postgres", "0000");
//            System.out.println("connection = "+connect);
            return connect ;
        }
        catch (SQLException limit){
            System.out.println(limit.getMessage());
        }
        return null;
    }
       
}
