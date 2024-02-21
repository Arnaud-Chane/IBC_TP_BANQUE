package org.example.account;

import org.example.model.Account;

import java.util.Scanner;

public class CreateAccount {
    public static Account NewAccount()
    {
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
        if("O" == Decouvert.intern() || "o" == Decouvert.intern())
        {
            bDecouvert = true;
        }

        if(bDecouvert)
        {
            do {
                System.out.println("Entrez le montant du découvert (doit être compris entre 100 et 2000 €): ");
                tempDecouvert = scan.nextDouble();
                if( tempDecouvert >= 100 && tempDecouvert <= 2000)
                {
                    myMontantDecouvert = tempDecouvert;
                    break;
                }
            } while(tempDecouvert < 100 || tempDecouvert > 2000);
        }


        do {
            System.out.println("Montant d'ouverture de compte minimum de 500 €: ");
            tempInitial = scan.nextDouble();
            if( tempInitial > 500)
            {
                myMontantInitial = tempInitial;
                break;
            }
        } while(tempInitial < 500);


        Account acc = CreateNewAccount(myName, myFirstName, bDecouvert, myMontantDecouvert, myMontantInitial);

        scan.close();

        return acc;
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
