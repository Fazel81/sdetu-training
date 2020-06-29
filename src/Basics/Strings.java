package Basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String bookTitle = "";
		String wordChoice = "Ring";
		
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book title contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome.");
		}
		
		String firstName = "Fazel";
		String lastName = "Le Roux";
		String SSN = "8882345534";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		System.out.println("first letter of first name is " + firstName.substring(0,1));
		System.out.println("first letter of last name is " + lastName.substring(0,1));
		System.out.println("The last 4 digits of your SSN is " + SSN.substring(SSN.length() - 4));

	}

}
