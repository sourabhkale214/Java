package com.Project.Beans;

public class Person {
//	declaration of all the data
	private int id;
	private String name;
	private int mobnum;
	
//default constructor	
	public Person() {
		super();
	}
	
//	Parameterized constructor
	public Person(int id, String name, int mobnum) {
		super();
		this.id = id;
		this.name = name;
		this.mobnum = mobnum;
	}

//	setters getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobnum() {
		return mobnum;
	}

	public void setMobnum(int mobnum) {
		this.mobnum = mobnum;
	}
// to string method
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobnum=" + mobnum + "]";
	}
	
	
	
	

}
