package com.qtrinh;

import java.io.Serializable;

public class Student2 implements Serializable {
	private static final long serialVersionUID = 1L;
	protected String name;
	protected int age;
	
	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + "]";
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
	
}
