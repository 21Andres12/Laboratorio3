package Logic;

import Domain.Client;

public class CurrentAccount extends Account {

    
    private float interest;

    public CurrentAccount() {
    }

    public CurrentAccount(float interest, String acccountNumber, double balance, Client client) {
        super(acccountNumber, balance, client);
        this.interest = interest;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    @Override
    public void deposit(double amount) {
      super.setBalance(getBalance()+amount);
    }

    @Override
    public void withdraw(double amount) {
     super.setBalance(interestCalculation()-amount);
    }

    @Override
    public double interestCalculation() {
      double interestFinal=0;
       interestFinal=(super.getBalance()
               *this.interest)
               /12;
      
      return interestFinal;
    }
     public String toString() {
    String result="\nACCOUNT TYPE: CURRENT ACCOUNTS"
           +"\n----------------------------" 
             +"\nInterest: "+this.getInterest()+"%"
            +"\nInterest you got: "
            +this.interestCalculation()
            +"\nBalance + Interests gained: "+(this.interestCalculation()+this.getBalance());
    return super.toString()+result;
            }
}
