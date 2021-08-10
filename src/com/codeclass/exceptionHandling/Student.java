package com.codeclass.exceptionHandling;

public class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Student st) {
		
		if(this.age>st.age)
			return 1;
		if(this.age<st.age)
			return -1;
		
		return 0;
	}
	
	

}
