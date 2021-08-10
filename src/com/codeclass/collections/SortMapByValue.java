package com.codeclass.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(2, "Somendra");
		hm.put(1, "Pravendra");
		hm.put(4, "Manendra");
		hm.put(3, "Upendra");
		
		hm = sortByValue(hm);
		
		System.out.println(hm);

	}
	
	public static HashMap<Integer, String> sortByValue(HashMap<Integer,String> hm){
		
		HashMap<Integer, String> sortedMap = new LinkedHashMap<>();
		Set<Entry<Integer,String>> entry = hm.entrySet();
		
		List<Entry<Integer,String>> list = new LinkedList<>(entry);
		list.sort((x,y) -> x.getValue().compareTo(y.getValue()));
		
		for(Entry<Integer,String> e : list) {
			sortedMap.put(e.getKey(), e.getValue());
		}
		
		return sortedMap;
	}

}
