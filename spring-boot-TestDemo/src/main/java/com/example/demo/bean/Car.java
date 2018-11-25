package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Car {

	@Value("${car.name}")
	private String name;
	
	@Value("${car.age}")
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
	public Car(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", age=" + age + "]";
	}
	
	
}
