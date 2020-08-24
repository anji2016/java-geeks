package com.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	
	public void readFile() throws IOException {
		File file = new File("filename.txt");
		BufferedReader bf = new BufferedReader(new FileReader(file));
		String st;
		while((st=bf.readLine())!=null) {
			System.out.println(st);
		}
		bf.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		CheckedException obj = new CheckedException();
		obj.readFile();
	}

}
