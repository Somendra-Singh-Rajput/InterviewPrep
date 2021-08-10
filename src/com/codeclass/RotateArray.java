package com.codeclass;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		//Method-1
		int arr[] = {1, 2, 3, 4, 5, 6, 7};	
		int d = 2;
		int n = arr.length-1;

		int temp=0;

		for(int i = 0; i < d; i++) {

			for(int j = n; j > 0; j--) {

				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
		}

		System.out.println("-------------:Method-1:-----------");
		for(int a = 0; a <= n;a++) {
			System.out.print(arr[a]+" ");
		}

		System.out.println();
		System.out.println("-------------:Method-2:-----------");

		rightRotate(arr,d);
		System.out.println(Arrays.toString(arr));

	}

	public static void rightRotate(int[] arr,int k) {

		for(int i=0; i<k; i++) {
			rotateByOne(arr);
		}
	}

	public static void rotateByOne(int[] arr) {

		int end = arr[arr.length-1];

		for(int i=arr.length-2; i >=0; i--) {
			arr[i+1] = arr[i];
		}

		arr[0] = end;	
	}

}
