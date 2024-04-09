/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Domain.Client;

/**
 *
 * @author wtfan
 */
public abstract class Account {
    
    
    
    protected String acccountNumber;
    protected double balance;
    protected Client client;

    public Account() {
    }

    public Account(String acccountNumber, double balance, Client client) {
        this.acccountNumber = acccountNumber;
        this.balance = balance;
        this.client = client;
    }

    public String getAcccountNumber() {
        return acccountNumber;
    }

    public void setAcccountNumber(String acccountNumber) {
        this.acccountNumber = acccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
    //-----------------------------------------
    //Methods in order to represent polimorfism
    //-----------------------------------------
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double interestCalculation();
    
    //redefine tostring
    
    public String toString(){
    String result="BANK ACCOUNT INFORMATION: "
            +"\n----------------------------"
            +"\nAccount Number:"+ this.getAcccountNumber()
            +"\nBalance: "+ this.getBalance()
            +"\nAccount Owner:"+ this.getClient().toString();
    
    return result;
    }
    
    
}
