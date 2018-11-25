package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.bean.Person02;

@Configuration
public class ConfigDemo {

	@Bean
	public Person02 person02() {
		
		return new Person02("cat",23);
	}
	
}
