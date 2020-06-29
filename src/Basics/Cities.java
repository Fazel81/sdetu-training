package Basics;

public class Cities {

	public static void main(String[] args) {
		// learning about loops/arrays
		
		//declare and define array
		String[] cities = {"New York","San Francisco","Miami","Dallas"};
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//declare array
		String[] countries;
		
		//define the array
		countries = new String[3];
		
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		
		System.out.println(countries[2]);
		
		//Declare & define the array (only size)
		
		String[] states = new String[5];
		
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i=0;
		
		//Do loop: enter the loop then tests condition
		System.out.println("******** Printing with DO loop***********");
		
		do {
			System.out.println(states[i]);
			i = i + 1;
		} while (i < 5);
		
		//While loop: tests condition first then enters loop
		int n= 0;
		boolean stateFound = false;
		System.out.println("******** Printing with While loop***********");
		
		while (!stateFound) {
			String state = states[n];
			/*System.out.println("State at " + n + " is: " + state);
			n++;
			if (n > 5) {
				stateFound = true;
			} */
			
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("Found the state of Texas");
				stateFound = true;
			}
			n++;
		}
		
		//For loop: best structure for iterating through an array
		System.out.println("******** Printing with For loop***********");
		for (int x=0;x<5;x++) {
			System.out.println("State number " + x + " is " + states[x]);
		}

	}

}
