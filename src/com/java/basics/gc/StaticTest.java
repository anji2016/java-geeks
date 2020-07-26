package com.java.basics.gc;

import java.util.ArrayList;
import java.util.List;

public class StaticTest {
	//22.2 
	//567677899.3
	public static  List<Double> list = new ArrayList<>();
	public static  List<Double> list2 = new ArrayList<>();
    public void populateList() {
        for (int i = 0; i < 100000000; i++) {
            list.add(Math.random());
        }
        System.out.println("Debug Point 2");
    }
 
    public static void main(String[] args) throws InterruptedException {
    	System.out.println("Debug Point 1");
        new StaticTest().populateList();
        list=null;
        for (int i = 0; i < 100000000; i++) {
           list2.add(Math.random());
        }
        Thread.sleep(10000);
        System.out.println("Debug Point 3");
        
    }
}
