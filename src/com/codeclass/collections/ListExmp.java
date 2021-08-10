package com.codeclass.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExmp {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(8);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(3);
		
		Collections.sort(list);
		System.out.println("----------------:Sorted the list:----------------");
		System.out.println(list);
		
		List<Integer> list1 = new LinkedList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(4);
		list1.add(3);
		
		System.out.println(list1);
		
		System.out.println("---------------:Iterating using iterator:------------------- ");
		
		Iterator iterator =  list.iterator();
		
		while(iterator.hasNext()) {
			int i = (int) iterator.next();
			System.out.println(i);
		}
		
		System.out.println("---------------:Iterating using list iterator:------------------- ");
		
		ListIterator li = list1.listIterator();
		
		while(li.hasNext()) {
			int i = (int) li.next();
			System.out.println(i);
		}
		
		List<Student> stList = new ArrayList<>();
		
		stList.add(new Student("Somendra", 30));
		stList.add(new Student("Bikash", 27));
		stList.add(new Student("Suraj", 31));
		stList.add(new Student("Lakshya", 26));
		stList.add(new Student("Shubham", 24));
		
		Collections.sort(stList);
		System.out.println("-------------:Printing student list in ascednign order:---------------\n");
		System.out.println(stList);
		
		Collections.sort(stList, new Comparator<Student>() {
			
		@Override
		public int compare(Student o1, Student o2) {
			
			if(o1.getAge()>o2.getAge())
				return -1;
			if(o1.getAge()<o2.getAge())
				return 1;
			return 0;
		}
		
		});
		
		System.out.println("-------------:Printing student list in descednign order:---------------\n");
		System.out.println(stList);
	}
}
