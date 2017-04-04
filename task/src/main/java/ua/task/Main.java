package ua.task;

import ua.task.controller.Controller;
import ua.task.model.Calculator;
import ua.task.view.View;

public class Main {

	public static void main(String[] args) {
		// Initialization
        Calculator model = new Calculator();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.process();
	}
}

