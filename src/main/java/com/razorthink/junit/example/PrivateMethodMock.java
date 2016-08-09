package com.razorthink.junit.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
 
public final class PrivateMethodMock {
 
    public static List<String> getData() {
        List<String> data = null;
        try {
        	 data =readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
 
    private static List<String> readFile() throws IOException {
    	System.out.println("Called..so mock didn't work");
        List<String> lines = new ArrayList<>();
        return lines;
    }
    
    private boolean saySomething(boolean say){
    	return say;
    }
 
}