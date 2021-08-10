package com.codeclass.exceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = null;
		
		
		try {
			String name = st.getName();
			
		}catch(NullPointerException e) {
			System.out.println("Null Pointer Exception Occurred.");
		}


	}

}
