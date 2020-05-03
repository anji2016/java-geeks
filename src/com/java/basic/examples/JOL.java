package com.java.basic.examples;

//JAVA OVER LOADING
public class JOL {
	
    // special method : default constructor 
	// no return type and method name same as class name
	public JOL() {
		// Object creation
		System.out.println("Hey! I am creating the object..");
	}
	

	// method overloading : two methods with same name and different parameters
	
	// Add two numbers
	public int addNumbers(int a, int b) {
		System.out.println("I am in add two numbers method");
		return a + b;
	}
	
	// Add three numbers
	public int addNumbers(int a,int b,int c) {
		System.out.println("I am in add three numbers method");
		return a + b + c ;
	}
	
	// Java main method
	public static void main(String[] args) {
		//execution starts from here
		System.out.println("Main...");
		JOL obj = new JOL(); // object creation using constructor 
		int sumTwo = obj.addNumbers(1, 2);
		int sumThree = obj.addNumbers(1, 2, 3);
		System.out.println("two number sum: "+ sumTwo);
		System.out.println("three number sum: "+ sumThree);
		
	}
}
