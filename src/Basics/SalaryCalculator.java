package Basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// Let's create a variable to define our career
		
		//Declare variables
		String career;
		System.out.println("Progress is starting");
		career = "Software Developer";
		System.out.println("My career is " + career);
		
		//Declare & define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		double salary = rate * hoursPerWeek * weeksPerYear;
		
		System.out.println("My annual salary as a " + career + "at the rate of R" + rate + " per hour is R" + salary + " per year.");

	}

}
