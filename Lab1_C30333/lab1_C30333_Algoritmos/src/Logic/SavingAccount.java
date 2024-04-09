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
public class SavingAccount extends Account {


    //Atributes
    private String starDate;
    private int monthsNumber;
    private float interest;

    public SavingAccount(String starDate, int monthsNumber, float interest) {
        this.starDate = starDate;
        this.monthsNumber = monthsNumber;
        this.interest = interest;
    }

    public SavingAccount(String starDate, int monthsNumber, float interest, String acccountNumber, double balance, Client client) {
        super(acccountNumber, balance, client);
        this.starDate = starDate;
        this.monthsNumber = monthsNumber;
        this.interest = interest;
    }

    public String getStarDate() {
        return starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate;
    }

    public int getMonthsNumber() {
        return monthsNumber;
    }

    public void setMonthsNumber(int monthsNumber) {
        this.monthsNumber = monthsNumber;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    
    
    
    @Override
    public void deposit(double amount) {
      
    //super.setBalance(interestCalculation()+amount);
    super.setBalance(getBalance()+amount);
    
    
    }

    @Override
    public void withdraw(double amount) {

        
        super.setBalance(interestCalculation()-amount);
    }

    @Override
    public double interestCalculation() {
        double interestTotal=0;
    
    interestTotal=(this.getInterest()
            /this.getMonthsNumber())
            *super.getBalance();
       
    return interestTotal;
    }
    
    //toString

    
    public String toString() {
    String result="\nACCOUNT TYPE: SAVING ACCOUNTS"
           +"\n----------------------------" 
            +"\n Saving Star Date: "+this.getStarDate()
             +"\nMonths: "+this.getMonthsNumber()
             +"\nInterest: "+this.getInterest()+"%"
            +"\nInterest you got: "
            +this.interestCalculation()
            +"\nStar Date + Interests gained: "+(this.interestCalculation()+this.getBalance());
    return super.toString()+result;
            }
    
}
