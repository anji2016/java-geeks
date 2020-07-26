package com.java.basics.gc;

public class Adder {
	public static long addIncremental(long l)
    {	
		   Long sum=0L; //wrapper
          // long sum=0L;
            sum =sum+l;
            return sum;
    }
    public static void main(String[] args) {
        
           for(long i=0;i<1000000000;i++)
           {
                  addIncremental(i);
           }
           System.out.println("done");
    }
}
