package oop;

public class LoanAccount implements IRate{
	
	//Interface Methods
	public void setRate() {
		System.out.println("Setting Loan Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing Loan Rate");
	}
	
	//More methods
	public void setTerm (int term) {
		System.out.println("Setting LOAN term to: " + term + " years.");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Setting Amortization schedule");
	}

}