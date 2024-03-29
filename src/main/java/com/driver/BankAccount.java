package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;


    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        if (sum < 0 || sum > digits * 9) {
            throw new Exception("Account Number can not be generated");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits; i++) {
            int digit = Math.min(sum, 9);
            sb.append(digit);
            sum -= digit;
        }
        return sb.toString();
    }

    public void deposit(double amount) {
        //add amount to balance
         balance= balance+amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
         if (balance-amount>minBalance){
             throw new Exception("Insufficient Balance");
         }else {
             balance=balance-amount;
         }

    }

}