package Basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		//Fibonnaci number is defined by the sum of the 2 previous Fibonnaci numbers
		//fib(0) = 0
		//fib(1) = 0 + 1
		//fib(2) = fib(0) + fib(1) = 0 + 1 = 1
		//fib(3) = fib(1) + fib(2) = 1 + 1 = 2
		//fib(4) = fib(2) + fib(3) = 1 + 2 = 3
		//fib(5) = fib(3) + fib(4) = 2 + 3 = 5
		//fib(5) = fib(4) + fib(5) = 3 + 5 = 8
		int x = 6;
		System.out.println("The Fibonnaci of " + x + " is " + fib(x));
		
		//factorials
		//1! = 1 * 1 = 1
		//2! = 2 * 1 = 2
		//3! = 3 * 2 * 1 = 6
		//4! = 4 * 3 * 2 * 1 = 24
		//5! = 5 * 4 * 3 * 2 * 1 = 120
		//6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
		System.out.println("The factorial of " + x + " is " + fac(x));

	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		
		return fib(n-1) + fib(n-2);
	}
	
	public static int fac (int m) {
		if (m==0) {
			return 0;
		}
		else if (m==1) {
			return 1;
		}
		
		return m * fac(m-1);
	}

}
