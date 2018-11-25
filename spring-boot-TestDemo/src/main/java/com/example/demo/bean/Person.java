package com.example.demo.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/*@ConfigurationProperties:告诉springboot将本类中的所有属性和配置文件中的相关属性进行绑定
 * 
 *@Component组件将 @ConfigurationProperties加入到容器中，才能生效
 * 
 */

@Component
@ConfigurationProperties(prefix="person")
public class Person {

	private String name;
	private String age;
	private Boolean boss;
	private Date birth;
	
	private Map<String,Object> maps;
	private List<Object> lists;
	private Dog dog;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Boolean getBoss() {
		return boss;
	}
	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Person(String name, String age, Boolean boss, Date birth, Map<String, Object> maps, List<Object> lists,
			Dog dog) {
		super();
		this.name = name;
		this.age = age;
		this.boss = boss;
		this.birth = birth;
		this.maps = maps;
		this.lists = lists;
		this.dog = dog;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", maps=" + maps
				+ ", lists=" + lists + ", dog=" + dog + "]";
	}
	
	
	

	
	
}
