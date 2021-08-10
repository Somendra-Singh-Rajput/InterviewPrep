package com.codeclass;

public class MostRecentUsedApp {

	public static void main(String[] args) {
		
	    int []arr = { 3, 5, 2, 4, 1 };
	    int N = arr.length;
		int K = 3;
		
		System.out.println("-----------------:Before switching:------------------\n");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int index = 0 ;
		index  = K%N;
		
		int x = index, index_id = arr[index];
		while(x > 0) {
			arr[x] = arr[--x];
		}
		
		arr[0] = index_id;
		
		System.out.println("-----------------:After switching:------------------\n");
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
