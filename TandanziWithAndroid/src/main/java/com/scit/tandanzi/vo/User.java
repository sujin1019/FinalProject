package com.scit.tandanzi.vo;

public class User {

	private String id;
	private String pw;
	private double height;
	private double weight;
	private int age;
	private double carbohy;
	private double protein;
	private double fat;
	
	public User(){}

	public User(String id, String pw, double height, double weight, int age, double carbohy, double protein,
			double fat) {
		super();
		this.id = id;
		this.pw = pw;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.carbohy = carbohy;
		this.protein = protein;
		this.fat = fat;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getCarbohy() {
		return carbohy;
	}


	public void setCarbohy(double carbohy) {
		this.carbohy = carbohy;
	}


	public double getProtein() {
		return protein;
	}


	public void setProtein(double protein) {
		this.protein = protein;
	}


	public double getFat() {
		return fat;
	}


	public void setFat(double fat) {
		this.fat = fat;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", height=" + height + ", weight=" + weight + ", age=" + age
				+ ", carbohy=" + carbohy + ", protein=" + protein + ", fat=" + fat + "]";
	}
	
	
	
}
