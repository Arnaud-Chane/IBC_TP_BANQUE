package org.example.agios;

public class Agios {

    public static void DisplayAgios(){
        System.out.println("Agios");
    }

    public static double CalculAgios(int overdraft, int dayOfOverdraft){
        double DOverdraft = overdraft;
        System.out.println("Overcraft : "+DOverdraft+" and Number of day of overdraft : "+dayOfOverdraft+".");
        return DOverdraft;
    }
}
