package com.java.basics.gc;

public class StaticDemo {
	static int count=0;
	   public void increment()
	   {
	       count++;
	   }
	   
	   public static void main(String[] args) {
		   StaticDemo obj1=new StaticDemo();
		   StaticDemo obj2=new StaticDemo();
	       obj1.increment();
	       System.out.println("Obj1: count is="+obj1.count);
	       obj2.increment();
	       System.out.println("Obj2: count is="+obj2.count);
	       Adder.addIncremental(1L);
	}

}
