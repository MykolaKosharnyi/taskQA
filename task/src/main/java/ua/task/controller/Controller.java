package ua.task.controller;

import ua.task.model.Calculator;
import ua.task.view.View;

public class Controller {

    private Calculator model;
    private View view;

    public Controller(Calculator model, View view) {
        this.model  = model;
        this.view = view;
    }
    
    public void process(){
    	//say user opportunity to quit
    	view.printMessage(View.EXIT);
    	
    	while(true){
    		//offer to enter new number
    		view.printMessage(View.ENTER_NUMBER);
    		
    		double result = model.getSquareRoot(view.inputNumber());
    		
    		//show result
    		view.printMessage(String.format("Result of getting quare root is %s \n", result));
    	}
    }
}
