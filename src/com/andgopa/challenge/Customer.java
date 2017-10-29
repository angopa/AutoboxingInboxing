package com.andgopa.challenge;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;

    private List<Double> transactions;

    public Customer(String name, Double transaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addNewTransaction(transaction);
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addNewTransaction(Double transaction) {
        transactions.add(transaction);
        System.out.println("Added new transaction " + transaction);
    }

    public void displayCustomerInformation() {
        System.out.println("Name : " + name);
        System.out.println("Transactions: " + transactions.toString());
    }
}
