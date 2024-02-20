package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        boolean bDecouvert = false;
        double tempDecouvert = 0;
        double myMontantDecouvert = 0;
        double tempInitial = 0;
        double myMontantInitial = 0;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entrez le nom : ");
        String myName = scan.next();
        
        System.out.println("Entrez le prénom : ");
        String myFirstName = scan.next();
        
        System.out.println("Voulez-vous avoir un découvert ? taper O pour oui, tout autre caractère pour non");
        String Decouvert = scan.next();
        if(Decouvert == "O")
        {
            bDecouvert = true;
        }

        if(bDecouvert)
        {
            tempDecouvert = scan.nextDouble(); 
            do {
                System.out.println("Entrez le montant du découvert (doit être compris entre 100 et 2000 €): ");
                if( tempDecouvert >= 100 || tempDecouvert <= 2000)
                {
                    myMontantDecouvert = scan.nextDouble();
                    break;
                }
            } while(tempDecouvert < 100 || tempDecouvert > 2000);
        }


        do {
            tempInitial = scan.nextDouble();
            System.out.println("Montant d'ouverture de compte minimum de 500 €: ");
            if( tempInitial > 500)
            {
                myMontantInitial = tempInitial;
                break;
            }
        } while(tempInitial < 500);

        Account acc = CreateNewAccount(myName, myFirstName, bDecouvert, myMontantDecouvert, myMontantInitial);

        scan.close();
    }


    
    public static Account CreateNewAccount(String sName, String sFirstName, boolean bDecouvert, double iMontantDecouvert, double iMontantInitialDepot)
    {
        Account newAcc = new Account();
        newAcc.setNom(sName);
        newAcc.setPrenom(sFirstName);
        newAcc.setDecouvert(bDecouvert);
        newAcc.setMontantDecouvert(iMontantDecouvert);
        newAcc.setMontantInitialDepot(iMontantInitialDepot) ;
        
        return newAcc;
    }
}