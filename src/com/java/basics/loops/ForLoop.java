package com.java.basics.loops;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {

/*	for(init;condition;incr/decr){  
		// code to be executed 
		}*/
	
	public static void main(String args[]) {
		
		int[] array= {10,11,12,13,14,15,16,17,18,19,110};
		             //0 1   2  3  4  5  6  7  8  9  10
        
		//array.length
		//end position = array.length-1
		
/*		for (int i=0; i< array.length; i++ ) {
			System.out.println(array[i]);
		}
		*/
		List<String> lst = new ArrayList<String>();
		lst.add("Ajay");
		lst.add("Aparna");
		lst.add("Anji");
		lst.add("Angelina");
		
		for (String name  : lst) {
			System.out.println(name);
		}
		
		
	}
}
