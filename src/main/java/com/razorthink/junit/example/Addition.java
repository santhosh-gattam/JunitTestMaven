package com.razorthink.junit.example;

public class Addition {
	
	public Object add(int a, int b){
		System.out.println("Called add");
		return a+b;
	}
	
	public int test(){
		System.out.println("Testing method");
		
		for(int i=0;i<2;i++){
			System.out.println(add(1,2));
		}
		
		
		return (int) add(1,2);
	}
	
	public static void staticTest(){
		
		System.out.println("Calling a static method...");
		
		
	}

}
