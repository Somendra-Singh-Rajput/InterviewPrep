package com.codeclass;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

public class CustomizedSorting {

	public static void main(String[] args) {
	
		Student s1 = new Student("Somendra",24);
		Student s2 = new Student("Lakshya",23);
		Student s3 = new Student("Amit",26);
		Student s4 = new Student("Pawan",25);
		Student s5 = new Student("Abhishek",24);
		Student s6 = new Student("Pawan",25);
		
		HashSet<Student> set = new HashSet<>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		
		System.out.println("----------------------:Before sorting:-----------------------\n");
		System.out.println(set+"\n");
		
		LinkedList<Student> list = new LinkedList<>();
		
		list.addAll(set);
		
		Collections.sort(list, new Comparator<Student>() {
			
			public int compare(Student o1, Student o2) {
				
				if(o1.getAge() > o2.getAge()) {
					return 1;
				}else {
					return -1;
				}
			};
		});
		
		
		System.out.println("----------------------:After sorting:-----------------------\n");
		System.err.println(list);
		
		Collections.sort(list, new SortByName());
		
		System.out.println("----------------------:After sorting by name:-----------------------\n");
		System.err.println(list);

	}

}
