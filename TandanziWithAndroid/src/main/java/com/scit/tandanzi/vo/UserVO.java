package com.scit.tandanzi.vo;

public class UserVO {

	private String id;
	private String pw;
	private double weight;
	private double carbohy;
	private double protein;
	private double fat;
	
	public UserVO(){}

	public UserVO(String id, String pw, double weight, double carbohy, double protein, double fat) {
		super();
		this.id = id;
		this.pw = pw;
		this.weight = weight;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
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
		return "UserVO [id=" + id + ", pw=" + pw + ", weight=" + weight + ", carbohy=" + carbohy + ", protein="
				+ protein + ", fat=" + fat + "]";
	}


	
}
