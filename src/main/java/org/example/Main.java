package org.example;
import static org.example.withdraw.Withdraw.*;
import static org.example.agios.Agios.*;

import org.example.model.Account;

import java.util.Scanner;

import static org.example.account.CreateAccount.NewAccount;


public class Main {
    public static void main(String[] args) {
        Account myAccount = NewAccount();
        WithdrawOperation();
        DisplayAgios();
        CalculAgios(overdraftAmount);
    }
}