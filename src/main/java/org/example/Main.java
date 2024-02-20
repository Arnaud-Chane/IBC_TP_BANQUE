package org.example;
import static org.example.withdraw.Withdraw.*;
import static org.example.agios.Agios.*;

public class Main {
    public static void main(String[] args) {
        WithdrawOperation();
        DisplayAgios();
        CalculAgios(overdraftAmount);
    }
}