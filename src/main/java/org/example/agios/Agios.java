package org.example.agios;

import static org.example.withdraw.Withdraw.overdraftAmount;

public class Agios {

    public static void DisplayAgios(){
        System.out.println("Agios");
    }

    public static double CalculAgios(double overdraft, int dayOfOverdraft){
        double DOverdraft = overdraft;
        System.out.println("Overcraft : "+DOverdraft+" and Number of day of overdraft : "+dayOfOverdraft+".");
        return DOverdraft;
    }
}
