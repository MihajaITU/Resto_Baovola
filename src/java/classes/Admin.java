/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author ASUS TUF
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author HASINA
 */
public class Admin {

    int id;
    String nom;
    String mail;
    String mdp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Admin(int id, String nom, String mail, String mdp) {
        this.id = id;
        this.nom = nom;
        this.mail = mail;
        this.mdp = mdp;
    }

    public Admin() {

    }

    public Admin[] getAllLivreur() throws Exception {
        Connecty connecty = new Connecty();
        Connection c = connecty.getConnex();
        String requete = "select * from admin";
        Statement Stat = c.createStatement();
        ResultSet res = Stat.executeQuery(requete);
        Vector vecteur = new Vector();
        while (res.next()) {
            Admin cat = new Admin(res.getInt(1), res.getString(2), res.getString(3), res.getString(4));
            vecteur.add(cat);
        }
        Admin[] vao = new Admin[vecteur.size()];
        for (int i = 0; i < vecteur.size(); i++) {
            vao[i] = (Admin) vecteur.elementAt(i);
        }
        c.close();
        return vao;
    }

    public boolean loginAdmin(String n, String m) throws Exception {
        Admin[] tab = getAllLivreur();
        for (Admin tabl : tab) {
            if (tabl.getMail().equalsIgnoreCase(n) && tabl.getMdp().equalsIgnoreCase(m)) {
                return true;
            }
        }

        return false;
    }

    public Admin getAdmin(String n, String m) throws Exception {
        Connecty connecty = new Connecty();
        Connection c = connecty.getConnex();
        Admin bat = new Admin();
        String requete = "select * from admin where mail='" + n + "' and mdp='" + m + "'";
        Statement Stat = c.createStatement();
        ResultSet res = Stat.executeQuery(requete);
        while (res.next()) {
            bat = new Admin(res.getInt(1), res.getString(2), res.getString(3), res.getString(4));
        }
        c.close();
        return bat;
    }
}
