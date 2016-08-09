package com.razorthink.junit.example;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Santhosh gattam
 * 
 *  Testing a private method using reflection
 *
 */
public class PrivateMethodAccessTest {

	PrivateMethodMock privateMock;

	@Before
	public void setUp() {
		privateMock = new PrivateMethodMock();
	}

	@Test
	public void accessPrivateMethod() {
		Method declaredMethod;
		try {
			declaredMethod = privateMock.getClass().getDeclaredMethod("saySomething", boolean.class);
			declaredMethod.setAccessible(true);
			boolean ret = (boolean) declaredMethod.invoke(privateMock, true);
			assertTrue(ret);
			System.out.println("Done");
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
