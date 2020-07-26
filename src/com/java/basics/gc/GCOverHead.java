package com.java.basics.gc;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GCOverHead {
	public static void main(String[] args) {
		System.out.println("start");
		Map m = new HashMap();
		Random r = new Random();
		m = System.getProperties();
		System.out.println(m.size());
        while (true) { 
            m.put(r.nextInt(), "randomValue"); 
        }
	}
	

}
