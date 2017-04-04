package ua.task;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.task.model.Calculator;

/**
 * 
 * @author Nikolay
 *
 */
public class TestCalculator {
	/**
     * Object that we need to test
     */
	private Calculator model;
	
	/**
     * Creating model object
     */
	@Before
	public void createCalculator(){
		model = new Calculator();
	}
	
	/**
	 * Actual checking correct working off getting square root
	 */
	@Test
	public void testGetSquareRoot(){
		Assert.assertTrue(new Double(9).equals(model.getSquareRoot(81.)));
		Assert.assertTrue(new Double(1).equals(model.getSquareRoot(1)));
		Assert.assertTrue(new Double(5).equals(model.getSquareRoot(25.)));
		Assert.assertTrue(new Double(6).equals(model.getSquareRoot(36)));
		Assert.assertTrue(new Double(4).equals(model.getSquareRoot(16.)));
	}
	
	/**
	 * Test method GetSquareRoot for getting negative input numbers
	 */
	@Test
	public void testGetSquareRootForNegativeNumbers(){
		Assert.assertTrue(Double.isNaN(model.getSquareRoot(-81.)));
		Assert.assertTrue(Double.isNaN(model.getSquareRoot(-1.)));
		Assert.assertTrue(Double.isNaN(model.getSquareRoot(-61.)));
		Assert.assertTrue(Double.isNaN(model.getSquareRoot(-18.)));
	}
	
	/**
	 * Test method GetSquareRoot for getting zero on input
	 */
	@Test
	public void testGetSquareRootForZero(){
		Assert.assertTrue(new Double(0).equals(model.getSquareRoot(0.0)));
	}
	
	/**
	 * Test method GetSquareRoot for getting only double value on input
	 */
	@Test
	public void testGetSquareRootFroDouble(){
		Assert.assertTrue(new Double(9).equals(model.getSquareRoot(81.)));
		Assert.assertTrue(new Double(5).equals(model.getSquareRoot(25.)));
		Assert.assertTrue(new Double(4).equals(model.getSquareRoot(16.)));
	}
	
	/**
	 * Test method GetSquareRoot for getting only integer value on input
	 */
	@Test
	public void testGetSquareRootFroInteger(){
		Assert.assertTrue(new Double(1).equals(model.getSquareRoot(1)));
		Assert.assertTrue(new Double(6).equals(model.getSquareRoot(36)));
	}
}

