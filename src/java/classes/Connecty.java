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
     private final static String URL = "jdbc:postgresql://localhost/resto" ;
    private final static String USER = "postgres" ;
    private final static String PASSWORD = "123" ;
    public Connection getConnex() throws ClassNotFoundException {
        Connection connect = null ;
        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection(URL, USER, PASSWORD);
            return connect ;
        }
        catch (SQLException limit){
            System.out.println(limit.getMessage());
        }
        return null;
    }
       
}
