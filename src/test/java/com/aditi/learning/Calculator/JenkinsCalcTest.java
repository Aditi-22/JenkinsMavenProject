package com.aditi.learning.Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addtest() {
        jenkinsCalculator myCalc = new jenkinsCalculator();
        assertEquals(10,myCalc.addNumbers(5,5));

	}
	@Test
	public void subtracttest() {
        jenkinsCalculator myCalc = new jenkinsCalculator();
        assertEquals(5,myCalc.subtractNumbers(10, 5));

	}
}
	