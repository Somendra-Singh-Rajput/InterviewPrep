package com.codeclass;

import java.util.HashSet;

public class OverrideEqualsAndHashcode {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("Somendra",24);
		Student s2 = new Student("Somendra",24);
		Student s3 = new Student("Somendra",25);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		HashSet<Student> hm = new HashSet<>();
		
		hm.add(s1);
		hm.add(s2);
		hm.add(s3);
		
		System.out.println(hm);
		
	}
}
