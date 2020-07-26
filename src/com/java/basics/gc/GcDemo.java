package com.java.basics.gc;

import java.util.HashMap;
import java.util.Map;

public class GcDemo {
	public static void main(String args[]) throws InterruptedException {
	   Map<GcDemo, String> map = new HashMap<GcDemo, String>();
	   Thread.sleep(10000);
	   for(;;) {
			 map.put(new GcDemo(), "value");
			 map.clear();
	        }
	}
}
