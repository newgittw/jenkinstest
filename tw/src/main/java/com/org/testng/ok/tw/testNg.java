package com.org.testng.ok.tw;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class testNg {
	@Test
	public void testAdd() {
		String str = "TestNG is working fine";
		assertEquals("TestNG is working fine", str);
	}
	
	@Test
	public void testNew() {
		String str = "TestNG is working fine 1";
		assertEquals("TestNG is working fine 1", str);
	}
}
