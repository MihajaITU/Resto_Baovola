/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author HASINA
 */
public class Main {
    public static void main(String[] args) throws Exception{
        ViewPaiement huhu= new ViewPaiement();
        ViewPaiement[] liste= new ViewPaiement[10];
        liste[0]=new ViewPaiement(1,"espece",1500.00);
        liste[1]=new ViewPaiement(1,"espece",1800.00);
        liste[2]=new ViewPaiement(1,"espece",7500.00);
        liste[3]=new ViewPaiement(1,"espece",1500.00);
        liste[4]=new ViewPaiement(1,"espece",6000.00);
        liste[5]=new ViewPaiement(2,"cheque",3000.00);
        liste[6]=new ViewPaiement(2,"cheque",1200.00);
        liste[7]=new ViewPaiement(2,"cheque",100.00);
        liste[8]=new ViewPaiement(2,"cheque",500.00);
        liste[9]=new ViewPaiement(2,"cheque",9000.00);
        double[] tresor=huhu.getTotal(liste);
        
    }
}
