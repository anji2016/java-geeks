package com.java.basics.string.programs;

import java.util.Scanner;

//reverse a given string
public class ReverseString {
	
	//step 3
	public String reverseString(String input) {
		String result = "";
		//Reverse - esreveR
		//Madam - madaM
		//index aasgnment;condition;increment
		for(int i=input.length()-1;i>=0 ;i--) {
			result = result+input.charAt(i);
		}
		return result;
		
	}
	
	//step 1
	public static void main(String[] args) {
		
		//step 2
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		String input = scanner.next();
		System.out.println("Length of the String " +input.length());
		
		//step 4
		ReverseString reverseStringObj = new ReverseString();
		String reversedString = reverseStringObj.reverseString(input);
		
		//step 5
		System.out.println(reversedString);
		
	}

}
