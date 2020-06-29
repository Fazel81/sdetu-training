package Basics;

public class Weather {

	public static void main(String[] args) {
		// This program will give suggestions of what to wear based on the weather (temperature)
		
		int temperature = 65;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt.");
		}
		else if ((temperature > 60) && (sunCondition != "Sunny")) {
			System.out.println("It's a bit cooler.  Perhaps wear a long-sleeve t-shirt and jeans.");			
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This a cool day, make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day.  Bring a sweater");
		}
		

	}

}
