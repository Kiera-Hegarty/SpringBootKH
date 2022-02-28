package com.qa.starterproject.domain;

public class Dog {
	
	private Integer id;
	private String name;
	private Integer age;
	private String ears;
	
	public Dog() {
		super();
	}


	public Dog(Integer id, String name, Integer age, String ears) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.ears = ears;
	}

	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


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


	public String getEars() {
		return ears;
	}


	public void setEars(String ears) {
		this.ears = ears;
	}


	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", age=" + age + ", ears=" + ears + "]";
	}


}
