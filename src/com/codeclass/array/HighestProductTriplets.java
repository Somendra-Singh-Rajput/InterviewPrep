package com.codeclass.array;

import java.util.Arrays;

public class HighestProductTriplets {

	public static void main(String[] args) {
		
		int[] arr = {-4,1,-8,9,6};		
		int n = arr.length;		
		Arrays.sort(arr);		
		
		System.out.println("--------------:Method-1:---------------");
		if(n > 2) {
			
			if(arr[n-1]*arr[n-2]*arr[n-3] > arr[0]*arr[1]*arr[n-1]) {
				System.out.println(arr[n-1]+","+arr[n-2]+","+arr[n-3]);
			}else {
				System.out.println(arr[0]+","+arr[1]+","+arr[n-1]);
			}
		}
		
		System.out.println("--------------:Method-2:---------------");
		
		int result = triplets(arr);
		System.out.println(result);

	}
	
	public static int triplets(int[] arr) {
		
		int m = Integer.MIN_VALUE;
		
		int n = arr.length;
		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					m = Math.max(m, arr[i]*arr[j]*arr[k]);
				}
			}
		}
		
		return m;
	}

}
