package com.codeclass.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapExmp {

	public static void main(String[] args) {
		
		Map<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "Somendra");
		hm.put(2, "Amit");
		hm.put(3, "Lakshya");
		hm.put(3, "Pawan");
		hm.put(4, "Abhishek");
		
		System.out.println(hm);
		
		Map<Integer,String> ht = new Hashtable<>();
		
		ht.put(1, "Somendra");
		ht.put(2, "Amit");
		ht.put(3, "Lakshya");
		ht.put(3, "Pawan");
		ht.put(4, "Abhishek");
		
		System.out.println(ht);
		
		Map<Integer,String> tm = new TreeMap<>();
		
		tm.put(1, "Somendra");
		tm.put(2, "Amit");
		tm.put(3, "Pawan");
		tm.put(4, "Abhishek");
		tm.put(3, "Lakshya");

		
		System.out.println(tm);


	}

}
