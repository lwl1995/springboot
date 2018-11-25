package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Car;
import com.example.demo.bean.Car01;
import com.example.demo.bean.Person;
import com.example.demo.bean.Person02;
import com.example.demo.config.ConfigDemo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestDemoApplicationTests {

	@Autowired
	private Person person;
	
	@Autowired
	private Car car;
	
	@Autowired
	private Car01 car01;
	
	
	@Test
	public void contextLoads() {
		
		System.out.println(person);
	}
	
	
	@Test
	public void contextLoads00() {
		
		System.out.println(car);
	}
	
	@Test
	public void contextLoads01() {
		
		System.out.println(car01);
	}
	
	
	@Test
	public void main() {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigDemo.class);
		Person02 person02 = (Person02) context.getBean("person02");
		System.out.println(person02);
		
	}

}
