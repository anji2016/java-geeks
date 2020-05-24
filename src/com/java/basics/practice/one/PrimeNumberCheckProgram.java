package com.java.basics.practice.one;

import java.util.Scanner;

public class PrimeNumberCheckProgram {

	// Statement : Program to check whether input number is prime or not
	
	//step3
	public boolean isPrimeNumber(int number) { // true - prime  , false - not a prime 
		
		for (int i=2 ; i <= number/2 ; i++) {
			 int remainder = number % i;
			 if(remainder == 0) {
				 return false; // not a prime number
			 }
		}
		return true; // its a prime number
	}
	
	//Step : 1 
	public static void main(String arg[]) {
		
		//Step2 
		Scanner inputChannel = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = inputChannel.nextInt();
		
		//step4
		PrimeNumberCheckProgram obj = new PrimeNumberCheckProgram();
		boolean result = obj.isPrimeNumber(number);
		
		//step5
		
		if (result == true) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("Its not a prime number");
		}
	}
	
}
