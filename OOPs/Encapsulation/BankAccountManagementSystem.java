package OOPs.Encapsulation;
/*
Project: Bank Account Management System
Concept: Encapsulation

Key Features:
- Secure account data storage
- Deposit and withdraw operations
- Balance validation (no negative balance)
- Controlled access using methods

OOP Concepts:
- Private variables
- Getters and Setters
- Validation logic
- Class design
*/
class BankAccount{
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public void setAccountHolder( String accountHolder){
        this.accountHolder = accountHolder;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    

    public String getAccountHolder(){
        return accountHolder;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        }
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }
}

public class BankAccountManagementSystem {
    public static void main (String[] args){
        BankAccount account = new BankAccount();
         account.setAccountHolder("Rashi");
        account.setAccountNumber(12345);

        account.deposit(5000);
        account.withdraw(2000);

        System.out.println("Balance: " + account.getBalance());
    }
}


    

