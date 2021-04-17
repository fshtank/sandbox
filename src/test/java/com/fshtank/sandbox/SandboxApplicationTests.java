package com.fshtank.sandbox;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SandboxApplicationTests {

	/**
	 * bitwise pp40 Little Black Book
	 */
	@Test
	void bitWise() {
		int v1=5, v2=125, r, shift;
		for (shift=0;shift<8;shift++) {
			r=v1<<shift;
			System.out.println(v1+" << "+shift+" = " + r);
			r=v2<<shift;
			System.out.println(v2+" << "+shift+" = " + r);
		}
		assertTrue(true);
	}
}
