package com.andgopa.challenge;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private String name;

    private List<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public boolean addCustomer(String name, double initAmount) {
        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, initAmount));
            return true;
        }
        return false;
    }

    public boolean addTransactionToCustomer(String name, Double transaction) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addNewTransaction(transaction);
            return true;
        }
        return false;
    }

    public void displayBranchInfo() {
        int index = 1;
        for (Customer c : customers) {
            System.out.println("Customer number " + index++);
            c.displayCustomerInformation();
        }
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i<customers.size(); i++) {
            if (customers.get(i).getName().equals(name)) {
                return customers.get(i);
            }
        }
        return null;
    }
}
