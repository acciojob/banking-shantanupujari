package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {
     BankAccount B1 = new BankAccount("shantanu", 5000.27,500);
     CurrentAccount c1= new CurrentAccount("tushar",5001,"JAISHREE");
     StudentAccount s1=new StudentAccount("pratik",5002,"sbes");
     SavingsAccount sv= new SavingsAccount("neha",5003,1000,5.6);
}
}