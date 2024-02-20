import java.util.Scanner;

package org.example;

public class Main {
    public static void main(String[] args) {
        
        bool bDecouvert = false;
        double myMontantDecouvert = 0;
        double myMontantInitial = 0;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entrez le nom : ");
        String myName = scan.nextString();
        
        System.out.println("Entrez le prénom : ");
        String myFirstName = scan.nextString();
        
        System.out.println("Voulez-vous avoir un découvert ? taper O pour oui, tout autre caractère pour non");
        String Decouvert = scan.nextString();
        if(Decouvert == "O")
        {
            bDecouvert = true;
        }

        do {
            System.out.println("Entrez le montant du découvert (doit être compris entre 100 et 2000 €): ");
            if( scan.nextDouble() >= 100 || scan.nextDouble() <= 2000)
            {
                myMontantDecouvert = scan.nextDouble();
                break;
            }
        } while(scan.nextDouble() < 100 || scan.nextDouble() > 2000)


        do {
            System.out.println("Entrez le montant du découvert (doit être compris entre 100 et 2000 €): ");
            if( scan.nextDouble() < 500)
            {
                myMontantInitial = scan.nextDouble();
                break;
            }
        } while(scan.nextDouble() < 500)

        Account acc = CreateNewAccount(myName, myFirstName, bDecouvert, myMontantDecouvert, myMontantInitial);

        scan.close()
    }


    
    public Account CreateNewAccount(string sName, string sFirstName, Bool bDecouvert, int iMontantDecouvert, int iMontantInitialDepot)
    {
        Account newAcc = new Account();
        newAcc.setNom = sName;
        newAcc.setPrenom = sFirstName;
        newAcc.setDecouvert = bDecouvert;
        newAcc.setMontantDecouvert = iMontantDecouvert;
        newAcc.setMontantInitialDepot = iMontantInitialDepot;
        
        return newAcc;
    }
}