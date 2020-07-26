package com.java.basics.methods;

public class StringDemo {
	//Primitive Data Types - int,float,double,boolean,short,long,char,byte
	//Non Primitive Data Types or Wrapper classes,classes - String,Integer,Array etc.
	
	String message = "greet";
	
	int num = 10;
	
	//String
	String strLiteral = "literal"; //string literal
	String strObject = new String("ObjectStr"); //string obj
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		//System.out.println(a == b);
		
		//values go into pool
		String strLiteral = "literal";
		String literal2 = "literal";
		
		//System.out.println(strLiteral == literal2);
		
		//values go into heap
		String obj = new String("objstr");
		String obj2 = new String("OBJSTR");
		
		//System.out.println(obj == obj2);
		
		//String methods
		String value = "Sampleaaa";
		System.out.println(value);
	/*	System.out.println("Equals method "+obj.equals(obj2));
		System.out.println(obj.equalsIgnoreCase(obj2));*/
		
		/*String value = "   ann   ";
		System.out.println(value);
		value = value.trim();
		System.out.println(value);
		System.out.println(value.length());*/
		
		// case
		//value = value.toUpperCase();
		//value = value.toLowerCase();
		
		// index
		int index = value.indexOf("a");
		int lstindex = value.lastIndexOf("a");
		
		//replace
		//value = value.replace('a', 'b');
		
		//substring
		//value = value.substring(4);
		//value = value.substring(0, 4);
		
		
		
		System.out.println(value);
		//System.out.println(lstindex);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
