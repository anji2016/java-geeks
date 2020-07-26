package com.java.basic.examples;

//PLAN for Media
//accessmodifier  //keyword-class //ClassName //{}
public class Media { //class name should start with capital letter
	//variables
	String photo;
	String video;
	String audio;
	
	//method 1
	//accessmodifier //returntype //methodname(){}
	public void uploadPhoto(){ // method name should start with small letter - camelcase
		System.out.println("Uploaded photo: "+photo);
	}
	
	//method 2
	public void editPhoto() {
		System.out.println("Edited photo: "+photo);
	}
	
	//method 3
	public void deletePhoto() {
		System.out.println("Deleted photo: "+photo);
	}
	
	//main method
	//main worker - main thread
	public static void main(String[] args) {
		//object for media
		//classname objname = keyword-new classname();
		Media mediaImage = new Media();//our object name is media
		//assigning value
		mediaImage.photo = "samuel";
		//calling methods
		mediaImage.uploadPhoto();
		mediaImage.editPhoto();
		mediaImage.deletePhoto();
		
		//one more object
		Media mediaPhoto = new Media();
		mediaPhoto.photo = "sujatha";
		mediaPhoto.uploadPhoto();
		mediaPhoto.editPhoto();
		mediaPhoto.deletePhoto();
	}

}
