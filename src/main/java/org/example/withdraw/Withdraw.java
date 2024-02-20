package org.example.withdraw;
import java.util.Scanner;

public class Withdraw {
    public static double overdraftAmount;
    public static double WithdrawOperation() {
        Scanner scanner = new Scanner(System.in);

        // Demander le montant du découvert autorisé
        System.out.print("Entrez le montant du découvert autorisé (0 s'il n'y en a pas) : ");
        double decouvertAutorise = scanner.nextDouble();

        // Demander le solde en cours
        System.out.print("Entrez le solde en cours : ");
        double solde = scanner.nextDouble();

        // Tant que le solde le permet, demander au client s'il souhaite effectuer un autre retrait
        while (true) {
            // Demander le montant du retrait ou 0 pour quitter
            System.out.print("Entrez le montant du retrait (0 pour quitter) : ");
            double retrait = scanner.nextDouble();

            // Vérifier si le client souhaite quitter
            if (retrait == 0) {
                break;
            }

            // Vérifier si le retrait est autorisé en fonction du découvert
            if (solde - retrait >= -decouvertAutorise) {
                // Effectuer le retrait
                solde -= retrait;
                System.out.println("Retrait effectué. Nouveau solde : " + solde);
            } else {
                System.out.println("Solde insuffisant. Nouveau solde : " + solde);
            }
        }


        // Afficher le nouveau solde et le montant du découvert
        System.out.println("Opérations terminées. Nouveau solde : " + solde);
        System.out.println("Montant du découvert : " + decouvertAutorise);

        // Fermer le scanner
        scanner.close();

        if(solde < 0){
            overdraftAmount = -(solde);
        } else {
            overdraftAmount = 0;
        }
        return overdraftAmount;
    }
}
