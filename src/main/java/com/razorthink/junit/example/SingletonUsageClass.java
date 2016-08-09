package com.razorthink.junit.example;

public class SingletonUsageClass {
	
	public void test(){
		System.out.println("Test method called..");
		Singleton instance = Singleton.getInstance();
	}

}
