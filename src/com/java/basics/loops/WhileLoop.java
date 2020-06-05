package com.java.basics.loops;

import java.util.ArrayList;
import java.util.List;

public class WhileLoop {

	public static void main(String[] args) {

		/*
		 * for (int i=0; i< array.length; i++ ) { System.out.println(array[i]); }
		 */

		int[] array = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 110 };
		// 0 1 2 3 4 5 6 7 8 9 10

		int i = 0; // start condition
		while (i < array.length) { // termination
			System.out.println(array[i]);
			i++;// increment
		}

		List<String> lst = new ArrayList<String>(); // size
		lst.add("Ajay");
		lst.add("Aparna");
		lst.add("Anji");
		lst.add("Angelina");

		int j = 0;// start condition
		while (j < lst.size()) { // end condition
			System.out.println(lst.get(j));
			j++; // increment
		}

	}
}
