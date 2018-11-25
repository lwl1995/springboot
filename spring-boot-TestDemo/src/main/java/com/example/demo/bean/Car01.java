package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:car01.properties"})
public class Car01 {

	@Value("${name}")
	private String name;
	
	@Value("${age}")
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
	
	public Car01() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car01(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Car [name=" + name + ", age=" + age + "]";
	}
}
