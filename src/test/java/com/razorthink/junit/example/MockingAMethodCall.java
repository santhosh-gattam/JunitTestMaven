package com.razorthink.junit.example;

import static org.powermock.api.mockito.PowerMockito.*;
import static org.mockito.Matchers.anyInt;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith( PowerMockRunner.class )
@PrepareForTest( Addition.class )
public class MockingAMethodCall {

	Addition helper;
	@Test
	public void additionTest() throws IOException
	{
		System.out.println(helper.test());
	}

	/**
	 * Writes different values on each call
	 * @throws Exception
	 */

	@Before
	public void setUp() throws Exception
	{
		helper = spy(new Addition());
		doReturn(123).doReturn(100).doReturn(150).when(helper).add(anyInt(),anyInt());
	}
}

