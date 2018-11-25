package com.example.demo.bean;

public class Dog {

	private String name;	
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Dog(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	
}
