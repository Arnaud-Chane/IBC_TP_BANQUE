package org.example.agios;
import static org.example.withdraw.Withdraw.overdraftAmount;
import java.util.Scanner;

public class Agios {

    public static void DisplayAgios() {
        System.out.println("Agios");
    }

    public static double CalculAgios(double overdraft) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days of overdraft:");
        while (!scanner.hasNextDouble()) {
            System.out.println("That's not a number! Try again:");
            scanner.next(); // discard the non-double input
        }
        double dayOfOverdraft = scanner.nextDouble();

        double amountOfAgios = (overdraft * dayOfOverdraft * 0.1) / 365;
        if(overdraft == 0){
            System.out.print("The client won't have any agios since no overdraft");
        } else {
            System.out.println("Overdraft : " + overdraft + " and Number of day of overdraft : " + (int)dayOfOverdraft + ".");
            System.out.printf("The client will have to pay %.2f € to the bank for %d day of overdraft.\n", amountOfAgios, (int)dayOfOverdraft);
        }
        return amountOfAgios;
    }
}