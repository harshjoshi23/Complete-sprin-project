package com.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestGreeting {

	@Test
	@DisplayName(value = "The function return a string of length less than or equal to 5")
	void testGetMessage() {
		
		Greeting grtObj = new Greeting();
		// Char length should be 5
		assertEquals(5, grtObj.getMessage().length());
//		fail("Not yet implemented");
	}
	@Test
	@DisplayName(value = "The function return a string of length less than or equal to 5")
	void testGetMessageOther() {
		
		Greeting grtObj = new Greeting();
		// Expecting Hello but actually is welcome
		assertEquals("Hello", grtObj.getMessage());
//		fail("Not yet implemented");
	}

}
