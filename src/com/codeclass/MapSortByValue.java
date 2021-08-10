package com.codeclass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.stream.Collectors.*;

import java.util.Collections;
import java.util.Comparator;

import static java.util.Map.Entry.*;

public class MapSortByValue {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "Somendra");
		hm.put(3, "Amit");
		hm.put(4, "Lakshya");
		hm.put(5, "Pawan");
		hm.put(2, "Abhishek");
		
		System.out.println("-----------------:Before Sorting:-----------------\n");
		System.out.println(hm);
		
		Map<Object, Object> hm1 = hm.entrySet()
			.stream()
				.sorted(comparingByValue())
					.collect(toMap(s -> s.getKey(), s -> s.getValue(),(s1,s2) -> s2, LinkedHashMap::new));
		
		System.out.println("-----------------:After Sorting:-----------------\n");
		System.out.println(hm1);
		
		Map<Object, Object> hm2 = hm.entrySet()
				.stream()
					.sorted(comparingByValue())
						.collect(toMap(Map.Entry::getKey,Map.Entry::getValue, (s1,s2) -> s2, LinkedHashMap::new));

		System.out.println("-----------------:After Sorting:-----------------\n");
		System.out.println(hm2);
		
		
		System.out.println("-----------------:After Sorting:-----------------\n");
		
		 HashMap<Integer,String> sorted = sortByValue(hm);
		 
	        for (Map.Entry<Integer,String> en : sorted.entrySet()) {
	            System.out.println("Key = " + en.getKey() +
	                          ", Value = " + en.getValue());
	        }
	}
	
	public static HashMap<Integer, String> sortByValue(HashMap<Integer,String> hm){
		
		LinkedList<Map.Entry<Integer,String>> list = new LinkedList<>(hm.entrySet());
		
		
		Collections.sort(list,new Comparator<Map.Entry<Integer,String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		HashMap<Integer,String> sorted = new LinkedHashMap<>();
		
		for(Map.Entry<Integer, String> entry : list) {
			sorted.put(entry.getKey(), entry.getValue());
		}
		
		return sorted;
	}

}
