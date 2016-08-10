package com.razorthink.utils;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.util.HashMap;
import java.util.Map;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import com.razorthink.junit.example.SampleMap;

public class FakeMapBuilder {

	public static SampleMap buildFakeMapLookup()
	{
		SampleMap fake = mock(SampleMap.class);

		final Map<String, String> map = new HashMap<String, String>();

		doAnswer(new Answer<String>() {

			@Override
			public String answer( InvocationOnMock invocation ) throws Throwable
			{
				System.out.println("Calling overridden answer method");
				Object[] arguments = invocation.getArguments();

				String key = String.valueOf(arguments[0]);

				return map.get(key);
			}
		}).when(fake).get(anyString());

		doAnswer(new Answer<String>() {

			@Override
			public String answer( InvocationOnMock invocation ) throws Throwable
			{
				System.out.println("Calling overridden answer method");
				Object[] arguments = invocation.getArguments();

				String key = String.valueOf(arguments[0]);

				String val = String.valueOf(arguments[1]);

				map.put(key, val);

				return null;
			}
		}).when(fake).put(anyString(),anyString());

		return fake;
	}

}
