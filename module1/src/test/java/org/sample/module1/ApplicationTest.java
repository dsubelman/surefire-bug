package org.sample.module1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel Subelman
 */
public class ApplicationTest {

	private final String name = "Test";

	@Test
	public void testGetName() {

		Application application = new Application(name);

		assertEquals(name, application.getName());

	}

}
