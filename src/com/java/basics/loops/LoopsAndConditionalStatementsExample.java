package com.java.basics.loops;

import java.util.ArrayList;
import java.util.List;

public class LoopsAndConditionalStatementsExample {
	
	
	public static void main(String[] args) {
	
		List<String> lst = new ArrayList<>();
		lst.add("Apple-Seasonal");
		lst.add("Mango-Seasonal");
		lst.add("Orange");
		lst.add("Banana");
		lst.add("CustardApple-Seasonal");
		lst.add("Papaya");
		
		//for each element
		for (String fruit : lst) {
			if(!fruit.contains("Seasonal")){
				System.out.println(fruit);
			}
		}
		
		
	}

}
