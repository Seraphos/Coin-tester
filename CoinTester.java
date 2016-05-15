/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointester;


import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Seraphos
 */
public class CoinTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("$#.00");//Keeping DecFormat in Main for simplicity
                                                      
       
        System.out.println("Please enter how many quarters you have: ");
            double q = scan.nextDouble();
        System.out.println("Please enter how many dimes you have: ");
            double d = scan.nextDouble();
        System.out.println("Please enter how many nickels you have: ");
            double n = scan.nextDouble();
        System.out.println("Please enter how many pennies you have: ");        
            double p = scan.nextDouble();
        
            Coins nCoin = new Coins();
       
        System.out.println( q + " quarters worth " + df.format(Coins.convertQ(q)));
        System.out.println( d + " dimes worth " + df.format(Coins.convertD(d)));
        System.out.println( n + " nickels worth " + df.format(Coins.convertN(n)));
        System.out.println( p + " pennies worth " + df.format(Coins.convertP(p)));
        System.out.println(df.format(nCoin.giveTotal(Coins.convertQ(q), Coins.convertD(d), 
                                        Coins.convertN(n), Coins.convertP(p)))
                                        + " is the sum of all money entered.");
        
        //a little extra below but wanted more practice
        System.out.println(Coins.giveNumQuart(q) + " quarters entered.");
        System.out.println(Coins.giveNumDimes(d) + " dimes entered.");
        System.out.println(Coins.giveNumNick(n) + " nickels entered.");
        System.out.println(Coins.giveNumPenn(p) + " pennies entered.");

        System.out.println("Coded painstakingly but lovingly by Andrew Connelly");
        
    }
    //purpose of this program is to test the 'Coin' class
    //also to take values given by user and convert to money/decimal format
    //and print results
    
    
}
