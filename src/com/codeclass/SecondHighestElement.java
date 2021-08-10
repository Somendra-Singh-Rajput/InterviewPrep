package com.codeclass;

public class SecondHighestElement {

	public static void main(String[] args) {
	
		int[] arr = {3,2,5,7,8,19,10};

		int high1 = Integer.MIN_VALUE;
	    int high2 = Integer.MIN_VALUE;
	    
	    for (int num : arr) {
	      if (num > high1) {
	        high2 = high1;
	        high1 = num;
	      } else if (num > high2) {
	        high2 = num;
	      }
	    }
		
		System.out.println(high2);

	}

}
