package org.example.agios;
import static org.example.withdraw.Withdraw.overdraftAmount;

public class Agios {

    public static void DisplayAgios() {
        System.out.println("Agios");
    }
    public static double CalculAgios(double overdraft, int dayOfOverdraft) {
        double amountOfAgios = (overdraft * dayOfOverdraft * 0.1) / 365;
        if(overdraft == 0){
            System.out.printf("The client won't have any agios since no overdraft");
        } else {
            System.out.println("Overcraft : " + overdraft + " and Number of day of overdraft : " + dayOfOverdraft + ".");
            System.out.printf("The client will have to pay %.2f € to the bank for %d day of overdraft.\n", amountOfAgios, dayOfOverdraft);
        }
        return amountOfAgios;
    }
}
