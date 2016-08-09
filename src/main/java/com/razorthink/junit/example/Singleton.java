package com.razorthink.junit.example;

public class Singleton {

	
	private static Singleton instance;

	private Singleton(){
       
    }
 
    public static synchronized Singleton getInstance(){
    	System.out.println("Called..so mock didn't work");
    	if(instance==null){
    		instance=new Singleton();
    	}
        return instance;
    }
	
}
