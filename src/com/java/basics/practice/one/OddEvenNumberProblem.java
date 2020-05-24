package com.java.basics.practice.one;

import java.util.Scanner;

public class OddEvenNumberProblem {
	
	// statement : Java Program to check Even or Odd number
	
	//step 3 : create a method to provide the logic for a  given problem 
	public boolean  isEvenNumber(int number) {
	    int remainder = number % 2;
	    boolean result = (remainder == 0);
	    if ( result ) 
	    {
	    	return true;
	    }
		return false;
	}
	
	//Step:1
	//String args[] --> String arguments array 
	public static void main(String args[]) {
		
		//Step2 : input channel (in java we call it is as Scanner)
		Scanner inputChannel = new Scanner(System.in); // create a input channel 
		System.out.println("Enter the number: ");
		int number = inputChannel.nextInt(); // create a specific channel for the input
		
		//Step 4 : execute the logic and get the output 
		OddEvenNumberProblem obj = new OddEvenNumberProblem(); // create object for working class
		boolean result = obj.isEvenNumber(number);
		
		//Step 5 : Display output 
		if ( result == true) {
			System.out.println("It is an even number");
		} 
		else
		{
			System.out.println("It is an Odd number");
		}
		
		
	}

}
