package com.qtrinh1289;

public class SalaryEmployee extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String position;
	private float salary;
	private float bonus;

	public SalaryEmployee(String id, String name, int age, boolean gender, String position, float salary, float bonus) {
		super(id, name, age, gender);
		this.position = position;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "SalaryEmployee [position=" + position + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

}
