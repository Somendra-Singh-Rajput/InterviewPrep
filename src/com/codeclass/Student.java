package com.codeclass;

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
		return this.name.compareTo(st.getName());
	}
	
	@Override
	public boolean equals(Object obj1) {
		
		if(this == obj1) {
			return true;
		}
		
		if(this == null || obj1 == null) {
			return false;
		}
		
		Student obj2 = (Student)obj1;
		
		if(this.name == obj2.name && this.age == obj2.age) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		Student obj1 = new Student();
		
		boolean flag = (this.name == obj1.name && this.age == obj1.age);
		
		if(flag == true) {
			return 1;
		}
		return 0;
		
	}
	
	
}
