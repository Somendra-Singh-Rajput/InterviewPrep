package com.codeclass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoArrayContainsSameEle {

	public static void main(String[] args) {
		
		Integer[] arr1 = {2,3,4,5,6,7};
		Integer[] arr2 = {3,3,4,5,6,7};
		
		System.out.println(sameElements(arr1, arr2));
	}
	
	public static boolean sameElements(Object[] arr1, Object[] arr2) {
		
		Set<Object> set1 = new HashSet<>(Arrays.asList(arr1));
		Set<Object> set2 = new HashSet<>(Arrays.asList(arr2));
		
		if(arr1.length != arr2.length) {			
			return false;	
		}
		else {
			
			for(Object obj1 : set1) {
				if(!set2.contains(obj1)) {				
					return false;
				}else {
					return true;
				}
			}
			
			return true;
		}
	}

}
