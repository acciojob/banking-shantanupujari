package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }

    public void setMaxWithdrawalLimit(double maxWithdrawalLimit) {
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        super(name,balance,0);
        this.maxWithdrawalLimit=maxWithdrawalLimit;
        this.rate= rate;

    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
//        if (amount > maxWithdrawalLimit) {
//            throw new Exception("Maximum Withdraw Limit Exceed");
//        }
//        if (amount > getBalance()) {
//            throw new Exception("Insufficient Balance");
//        }
//        int bal= (int) getBalance();
//        setBalance(bal-=amount);
        if(amount<=maxWithdrawalLimit)
            super.withdraw(amount);
        else
            throw new Exception("Maximum Withdraw Limit Exceeded");



    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
//       int bal = (int) getBalance();
//        return bal * rate * years;
        return getBalance()*(1+(rate*years)/100);
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
//        int bal = (int) getBalance();
//        return bal* Math.pow((1 + rate / times), times * years);
        double compoundInterest = getBalance()*Math.pow((1+rate/(100*times)),(times*years));
        return getBalance()*Math.pow((1+rate/(100*times)),(times*years));
    }

}
