package com.codeclass.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExmp {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		System.out.println(set1);
		
		Set<Integer> set2 = new LinkedHashSet<>();
		
		set2.add(1);
		set2.add(2);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		System.out.println(set2);

	}

}
