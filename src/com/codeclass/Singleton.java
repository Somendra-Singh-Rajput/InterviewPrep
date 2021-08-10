package com.codeclass;

public class Singleton {

	private static Singleton  singleton = null;
	
	public String s;
	
	private Singleton() {
		s = "Part of singleton class";
	}
	
	public static Singleton getInstance() {
		
		if(singleton == null)
			singleton = new Singleton();
		
		return singleton;
		
	}
	public static void main(String[] args) {
		
		Singleton single = Singleton.getInstance();
		
		single.s = (single.s).toUpperCase();
		
		System.out.println(single.s);

	}

}
