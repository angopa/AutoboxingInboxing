package com.andgopa.challenge;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private List<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public boolean addNewBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addNewCustomer(String branchName, String customerName, Double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomer(customerName, transaction);
        }

        return false;
    }

    public boolean addNewTransactionToCustomer(String branchName, String customerName, Double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addTransactionToCustomer(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(name)) {
                return branches.get(i);
            }
        }
        return null;
    }

    public void displayBranchList() {
        int index = 1;
        for (Branch b : branches) {
            System.out.println("\nBranch number " + index++);
            b.displayBranchInfo();
        }
    }
}
