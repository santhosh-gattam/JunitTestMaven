package com.razorthink.junit.example;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith( PowerMockRunner.class )
@PrepareForTest(  Singleton.class  )
public class SingletonUsageClassTest {

	private Singleton singleton;
	@Test
	public void additionTest() throws IOException
	{
		new SingletonUsageClass().test();
	}

	/**
	 * mocking a singleton get instance method
	 * @throws Exception
	 */

	@Before
	public void setUp() throws Exception
	{
		PowerMockito.mockStatic(Singleton.class);
		singleton = Mockito.mock(Singleton.class);
		PowerMockito.when(Singleton.getInstance()).thenReturn(singleton);
	}
}
