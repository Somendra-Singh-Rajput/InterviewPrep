package com.codeclass;

public class StockBuyAndSellProblem {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int max = 0;
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] <= min) {
				min = arr[i];
			}
			else {
				max = Math.max(max, arr[i]-min);
			}
		}
		
		System.out.println(max);
	}

}
