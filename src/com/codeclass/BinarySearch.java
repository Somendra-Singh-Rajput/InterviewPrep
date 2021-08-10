package com.codeclass;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};  
        int key = 20;  
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);   
        
        int result = binarySearchRecursive(arr,0,last,key);  
        System.out.println("Using recursive search element found at  index : "+result);

	}

	private static void binarySearch(int[] arr, int start, int end, int key) {
		
		int mid = 0;
		mid = (start+end)/2;
		
		while(start <= end) {
			
			if(arr[mid] < key) {
				 start = mid+1;
				 
			}else if(arr[mid] == key) {
				System.out.println("Element found at index : "+mid);
				break;				
			}
			else {
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		
		if(start > end) {
			System.out.println("Item not found.");
		}
		
	}
	
	private static int binarySearchRecursive(int[] arr, int start, int end, int key) {
		
		if(end >= start) {
			int mid = start + (end - start)/2; // (0+(1-0)/2)
			if(arr[mid] == key) {
				return mid;
			}
			
			if(arr[mid] > key) {
				return binarySearchRecursive(arr, start, mid-1, key);
			}else {
				return binarySearchRecursive(arr, mid+1, end, key);
			}
		}
		
		return -1;
	}

}
