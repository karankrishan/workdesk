package com.kilo.test;

import junit.framework.TestCase;

public class KiloTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		System.out.println("Set up");
	}

	
	public void testMethod() {
		System.out.println("Teaser");
	}
	
	@Override
	protected void tearDown() throws Exception {
		System.out.println("tear down");
	}
}
