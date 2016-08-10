package com.razorthink.junit.example;

import org.junit.Before;
import org.junit.Test;

import com.razorthink.utils.FakeMapBuilder;

/**
 * 
 * @author Santhosh
 * 
 * Considering DB call as a map insert.
 *
 */
public class MockDBCall {

	SampleMap sampleMap = FakeMapBuilder.buildFakeMapLookup();
	
	@Before
	public void setUp() {
		
	}

	
	@Test
	public void mockDBCall() throws Exception {
		sampleMap.put("Key", "Val");
		
		sampleMap.put("Key1", "Val1");
		
		System.out.println(sampleMap.get("Key"));
		
      
	}
	
}
