package com.java.basics.loops;

public class ConditionaStatementsIfElse {

	public static void main(String[] args) {
		// if else
		// 60 above pass , below 60 fail - 2 conditions
		// 35 marks pass, 60above distinction , 90 above merit - 3 conditions
		int marks = 92;

		//conditional statements
		if (marks >= 35 && marks < 60) {
			System.out.println("Pass");
		} else if (marks >= 60 && marks < 90) {
			System.out.println("Distinction");
		} else if (marks >= 90) {
			System.out.println("Merit");
		} else {
           System.out.println("Fail");
		}
	}

}
