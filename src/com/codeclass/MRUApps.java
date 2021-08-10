package com.codeclass;

public class MRUApps {

	public static void main(String[] args) {

		int[] arr = {3,5,4,2,6,1};
		int K = 3;
		int N = arr.length-1;
		//System.out.println(N);
		
		int appIndex = 0;
		appIndex = K%N;
		//System.out.println(appIndex);
		int a = appIndex, appId = arr[appIndex];
		//System.out.println(appId);
		
		while(a > 0) {
			arr[a] = arr[--a];
			//System.out.println(a);
		}
		
		arr[0] = appId;
		
		for(int i : arr) {
			System.out.print(i + ",");
		}

	}

}
