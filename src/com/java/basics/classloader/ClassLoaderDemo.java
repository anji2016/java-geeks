package com.java.basics.classloader;

import java.util.ArrayList;

import com.sun.javafx.util.Logging;

public class ClassLoaderDemo {
	public static void main(String[] args) {
		System.out.println("Class Loader of this class: "+ClassLoaderDemo.class.getClassLoader());
		
		System.out.println("Class Loader of Logging: "+Logging.class.getClassLoader());
		
		System.out.println("Class Loader of ArrayList: "+ArrayList.class.getClassLoader());
	}

}
