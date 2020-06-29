package Basics;

public class NumbersCalc {

	public static void main(String[] args) {
		// different types of functions
		printName();
		int x = 10;
		int y = 20;
		
		addNumbers(x,y);
		int product = multiplyNumbers(x,y);
		System.out.println("The product of " + x + " and " + y + " is " + product);

	}
	
	static void printName() {
		System.out.println("My name is Fazel.");
	}
	
	static void addNumbers(int x, int y) {
		//This function will add 2 numbers and not return but display the result
		int sum = x + y;
		System.out.println("The sum of " + x + " and " + y + " is " + sum );
		
	}
	
	static int multiplyNumbers (int x, int y) {
		//This function will multiply 2 numbers and return the product in integer format
		int product = x * y;
		addNumbers(product,product);
		return product;
	}

}
