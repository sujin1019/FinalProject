package com.scit.tandanzi.vo;

public class SearchVO {
	private int foodNum;
	private String name;
	private double eachCarbohy;
	private double eachProtein;
	private double eachFat;
	
	public SearchVO(){}

	public SearchVO(int foodNum, String name, double eachCarbohy, double eachProtein, double eachFat) {
		super();
		this.foodNum = foodNum;
		this.name = name;
		this.eachCarbohy = eachCarbohy;
		this.eachProtein = eachProtein;
		this.eachFat = eachFat;
	}

	public int getFoodNum() {
		return foodNum;
	}

	public void setFoodNum(int foodNum) {
		this.foodNum = foodNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEachCarbohy() {
		return eachCarbohy;
	}

	public void setEachCarbohy(double eachCarbohy) {
		this.eachCarbohy = eachCarbohy;
	}

	public double getEachProtein() {
		return eachProtein;
	}

	public void setEachProtein(double eachProtein) {
		this.eachProtein = eachProtein;
	}

	public double getEachFat() {
		return eachFat;
	}

	public void setEachFat(double eachFat) {
		this.eachFat = eachFat;
	}

	@Override
	public String toString() {
		return "SearchVO [foodNum=" + foodNum + ", name=" + name + ", eachCarbohy=" + eachCarbohy + ", eachProtein="
				+ eachProtein + ", eachFat=" + eachFat + "]";
	}
	
	
}
