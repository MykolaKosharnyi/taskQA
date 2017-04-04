package ua.task.model;

/**
 * 
 * @author Nikolay
 * Model class
 */
public class Calculator {
	
	/**
	 * Get square root from input number
	 * @param number from which getting square root
	 * @return result of getting square root
	 */
	public double getSquareRoot(Double number){
		return Math.sqrt(number);
	}
	
	public double getSquareRoot(Integer number){
		return Math.sqrt(number);
	}
}
