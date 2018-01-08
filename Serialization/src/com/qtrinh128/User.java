package com.qtrinh128;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*Không thể Serialize biến static
	 * Không muốn Serialize biến nào thì thêm vào từ khóa transient trước kiểu của biến
	 * */
	protected String name;
	protected int age;
	protected String address;
	protected boolean gender;
	
	
	public User(String name, int age, String address, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
}
