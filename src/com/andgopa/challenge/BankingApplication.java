package com.andgopa.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//      Created by Andres Gonzalez 10/27/17
public class BankingApplication {

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        Bank bank = new Bank("HSBC");

        bank.addNewBranch("Polanco");

        bank.addNewCustomer("Polanco", "Andres", 200.0);
        bank.addNewCustomer("Polanco", "Jorge", 200.0);
        bank.addNewCustomer("Polanco", "Javier", 200.0);

        bank.addNewBranch("Narvarte");

        bank.addNewCustomer("Narvarte", "Igor", 300.0);
        bank.addNewCustomer("Narvarte", "Andrew", 300.0);
        bank.addNewCustomer("Narvarte", "Yifu", 300.0);

        bank.addNewTransactionToCustomer("Narvarte", "Yifu", 300.0);

        bank.displayBranchList();
    }

    public void createMenu() {
        System.out.println("Select option: " );
        System.out.println("1. Create Branch " );
        System.out.println("2. Add Customer " );
        System.out.println("3. Add Transaction " );
        System.out.println("4. Display Customers List" );
    }
}
