package com.razorthink.junit.example;

import static org.powermock.api.mockito.PowerMockito.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/** The annotation to bootstrap powermock. */
@RunWith(PowerMockRunner.class)
/** We want to stub the static method on Addition class 
    hence we have to use the @PrepareForTest annotation. */
@PrepareForTest(Addition.class)
public class StaticMethodTest {
	
	@Before
	public void setUp() {
	}

	/**
	 * Mocking a static method.
	 * @throws Exception
	 */
	@Test
	public void accessPrivateMethod() throws Exception {
		
		/** Creating the spy of Addition class. */
        spy(Addition.class);
 
        /** Stubbing the staticTest method 
            to do nothing when its called. */
        doNothing().when(Addition.class);
        Addition.staticTest();
	}

}
