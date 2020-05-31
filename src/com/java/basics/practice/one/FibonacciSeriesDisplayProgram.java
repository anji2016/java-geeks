package com.java.basics.practice.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeriesDisplayProgram {

	// Statement : Program to Display Fibonacci series upto a given number
	// Fibonacci series : 0 1 1 2 3 5 8 13 ...
	
	// step3 : logic or solution to the given problem 
	public List<Integer> getFibonacciSeries(int number){
		int t1 = 0;
		int t2 = 1;
		
		List<Integer> lst = new ArrayList<>(); // creation of list
		
		lst.add(t1);
		lst.add(t2);
		
		while(t1 + t2 <= number) {
			int sum = t1 + t2;
			lst.add(sum);
			t1= t2; //current t1 is previous t2
			t2 =sum; // current t2 is sum of previous t1 and t2 
		}
		
		return lst;
	}
	
	//step1: create a main method 
	public static void main(String args[]) {
		
		// step2: creation of input channel
		Scanner inputChannel = new Scanner(System.in);
		System.out.println("Enter the number to display Fibonacci Series : ");
		int number = inputChannel.nextInt();
		
		//step4: execute the logic and get output 
		FibonacciSeriesDisplayProgram obj = new FibonacciSeriesDisplayProgram();
		List<Integer> lst = obj.getFibonacciSeries(number);
		
		//step5: Display output
		System.out.println("Fibonacci Series :");
		System.out.println(lst);
		
	}
}
