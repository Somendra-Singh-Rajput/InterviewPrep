package com.codeclass;

import java.util.HashSet;

public class TripletsOptimized {

	public static void main(String[] args) {
		
		 int arr[] = { 0, -1, 2, -3, 1 };
	     int sum = -3;
	     int n = arr.length;
	     
    	 HashSet<Integer> s = new HashSet<>();
    	 
	     for(int i=0;i<n-1;i++) {
	    	 
	    	 for(int j=i+1;j<n;j++) {
	    		 
	    		 int x = sum - (arr[i]+arr[j]);
	    		 if(s.contains(x)) {
	    			 System.out.println(x+" "+arr[i]+" "+arr[j]);
	    		 }else {
	    			 s.add(arr[j]);
	    		 }
	    	 }	    	 
	     }	     
	     //System.out.println(s);
	}

}
