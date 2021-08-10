package com.codeclass.array;

public class HighestProductOfTriplets {

	public static void main(String[] args) {
		
		int[] arr = {-4,1,-8,9,6};		
		int n = arr.length;		
		int m = Integer.MIN_VALUE;

		
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					m = Math.max(m, arr[i]*arr[j]*arr[k]);
				}
			}
		}
		
		System.out.println(m);

	}

}
