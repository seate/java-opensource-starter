package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * You must document test class
 */
class MainTest {

	/**
	 * You must document test method
	 */
	@Test
	void methodTest() {
		Main instance = new Main();

		assertTrue(instance.method(true));
		assertFalse(instance.method(false));
	}

}
