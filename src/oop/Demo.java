package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk () {
		System.out.println(name + " is walking.");
	}
	
	void email() {
		System.out.println(name + "'s email address is " + this.email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		
		Person person1 = new Person();
		person1.name = "Kevin";
		person1.phone = "082339437";
		person1.email = "kevinj@sdet.com";
		
		person1.email();
		person1.walk();
		person1.sleep();

	}

}
