/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointester;
            //Course:               CSE 1301J
            //Student Name:         Andrew Connelly
            //Assignment Number:    Project #3

/**
 *
 * @author Seraphos
 */
public class Coins {
    
     private double quart; 
     private double dimes;
     private double nick;
     private double penn;
   
    public Coins() 
    {
        quart = 0;
        dimes = 0;
        nick = 0;
        penn = 0;
    }
    public Coins(double q, double d, double n, double p) 
    {
        quart = q;
        dimes = d;
        nick = n;
        penn = p;
        System.out.println("Constructor with parameters is finished.");
    }
    
    
    
    public double getQuart()
    {
        return quart;
    }
    
    public double getDimes()
    {
        return dimes;
    }
    
    public double getNick()
    {
        return nick;
    }
    
    public double getPenn()
    {
        return penn;
    }
    
     public void setQuart(double newQuart)
    {
        if (newQuart >= 0 )
            quart = newQuart;
    }
    
    public void setDimes(double newDimes)
    {
        if (newDimes >= 0 )
            dimes = newDimes;
    }
    
    public void setNick(double newNick)
    {
        if (newNick >= 0 )
            nick = newNick;
    }
    
    public void setPenn(double newPenn)
    {
        if (newPenn >= 0 )
            penn = newPenn;
    }
    
    public String toString()
    {

        return "There are" + quart + " quarters, " + dimes + " dimes, "
                + nick + " nickels, and " + penn + " pennies.";
    }
  
    public static double convertQ(double numQ)
    {
       return numQ * .25;
    }
    
    public static double convertD(double numD)
    {
       return numD * .1;
    }
    
    public static double convertN(double numN)
    {
       return numN * .05;
    }

    public static double convertP(double numP)
    {
       return numP * .01;
    }
    
    public static double giveTotal(double a, double b, double c, double d)
    {
        return a + b + c + d;
    }
    
    public static double giveNumQuart(double numQuart)
    {
        return numQuart;
    }
    public static double giveNumDimes(double numDimes)
    {
        return numDimes;
    }
    
    public static double giveNumNick(double numNick)
    {
        return numNick;
    }
    
    public static double giveNumPenn(double numPenn)
    {
        return numPenn;
    }
}
