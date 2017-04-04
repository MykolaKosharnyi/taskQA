package ua.task.view;

import java.util.Scanner;

/**
 * 
 * @author Nikolay
 * Class to work with presentation
 */
public class View {

	public static final String EXIT = "Type 'exit' to quit this program.\n";
	public static final String ENTER_NUMBER = "Please, enter new number wrom which need to get square root:";
	private static final String COMPLETE_PROGRAM = "\n The program is completed.";
	private static final String WRONG = "Wrong, you must enter the number!";
	private static final String EXIT_COMMAND = "exit";
	/**
	 * Scanner helps to enter new date
	 */
	private Scanner sc;
	
	public View(){
		sc = new Scanner(System.in);
	}
	
	public View(Scanner sc){
		this.sc = sc;
	}
	/**
     * Print message
     * @param message - text that need to output
     */
    public void printMessage(String message){
        System.out.println(message);
    }
    
    /**
     * 
     * @param sc Scanner helps to enter new date
     * @return number which will enter user
     */
    public double inputNumber(){
    	while( ! sc.hasNextDouble()) {
    		if(sc.next().equals(EXIT_COMMAND)){	
    			printMessage(COMPLETE_PROGRAM);
    			System.exit(0);
    		}
            printMessage(WRONG);
            sc.next();
        }
    	return sc.nextDouble();
    }
}
