package com.scit.tandanzi.vo;

public class User {

	private int num;
	private String name;
	private String phone;
	
	
	//constructor
	public User() {
		super();
	}


	public User(int num, String name, String phone) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
	}


	//getter & setter
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + ", phone=" + phone + "]";
	}
	
	

	
}
