# springboot
taiji
# springboot
taiji

### springboot上周项目总结

##### 一.热部署

```java
在pom.xml中配置如下

<!-- Springboot热部署 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
```

##### 二.配置文件application.properties的使用

```java
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

```

application.properties

```java
car.name=lisi
car.age=12
```

测试类

```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestDemoApplicationTests {

	
	@Autowired
	private Car car;
	
	@Test
	public void contextLoads00() {
		
		System.out.println(car);
	}
	
}
```

##### 三.application.yml的使用

新建一个实体类Dog

```java
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
```

把Dog写入到Person类中

```java
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
	
```

applocation.yml中

```java
person:
  name: yuwen
  age: 15
  boss: false
  birth: 2018/12/4
  maps: {k1: v1,k2: v2}
  lists: 
    - java
    - php  
  dog: 
    age: 15
    name: xiaogou

```

测试类

```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestDemoApplicationTests {

	@Autowired
	private Person person;
	

	@Test
	public void contextLoads() {
		
		System.out.println(person);
	}
	
}

```

##### 四.@PropertySource指定外部配置文件

实体类

```java
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
```

外部配置文件

```
name=liu
age=44
```

测试类

```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestDemoApplicationTests {


	@Autowired
	private Car01 car01;
	
	@Test
	public void contextLoads01() {
		
		System.out.println(car01);
	}
	

}

```

##### 五.lombok的使用

```java
lombok的作用：使@Data注解生效

第一步：下载lombok插件

<https://projectlombok.org/download>

第二步：

用命令符的方法安装（安装完后别忘重启开发软件）：
```

![img](https://img-blog.csdnimg.cn/20181122203910548.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MTYzOTE3OQ==,size_16,color_FFFFFF,t_70)![点击并拖拽以移动](data:image/gif;base64,R0lGODlhAQABAPABAP///wAAACH5BAEKAAAALAAAAAABAAEAAAICRAEAOw==)



```pom
第三步：在pom.xml中配置

<!-- lombok -->

<dependency>

      <groupId>org.projectlombok</groupId>

      <artifactId>lombok</artifactId>

     <version>1.16.20</version>

</dependency>
```

##### 六.Spring boot Admin监控

```java
简述：建两个工程，一个为**admin工程**(工程名字任意)，一个为**client工程**(工程名字任意)

在**admin工程**中：

1.在admin工程中加入以下依赖：

切记项目的版本不要是2.0以上版本，应为1.5.17的即可，2.0的会报错
```



![img](https://img-blog.csdnimg.cn/20181123202220945.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MTYzOTE3OQ==,size_16,color_FFFFFF,t_70)![点击并拖拽以移动](data:image/gif;base64,R0lGODlhAQABAPABAP///wAAACH5BAEKAAAALAAAAAABAAEAAAICRAEAOw==)



```java
<!--引入admin server依赖-->

<dependency>
            <groupId>de.codecentric</groupId>
            <artifactId>spring-boot-admin-server</artifactId>
            <version>1.5.6</version>
</dependency>
        <!--admin server的展示-->
  <dependency>
            <groupId>de.codecentric</groupId>
            <artifactId>spring-boot-admin-server-ui</artifactId>
            <version>1.5.6</version>
  </dependency>
  2.在admin工程的配置文件中加入如下：

server.port=**8000**（端口号任意，但是要跟**client工程**的配置文件中的spring.boot.admin.url=http://localhost:**8000**一致 ）

3.在admin的工程的启动类上加入如下三个注解：

**@Configuration**

**@EnableAutoConfiguration**

**@EnableAdminServer**

在client工程中：

1.在client工程中加入如下依赖：

<dependency>
   <groupId>de.codecentric</groupId>
   <artifactId>spring-boot-admin-starter-client</artifactId>
   <version>1.5.6</version>
</dependency>

2.在client配置文件中加入如下：

spring.boot.admin.url=http://localhost:8000  （跟admin的配置文件的端口号一致）
management.security.enabled=false

最后这俩个项目必须都同时启动，输入http://localhost:8000访问即可


