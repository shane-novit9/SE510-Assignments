package homework6.problem2;

import java.util.Scanner;

public class CarTypeSelector {
	   public static void main(String args[]) {
	        String BODY_SIZE = "L";
	        int ENGINE_SIZE = 6;
	        int WHEEL_DIAMETER = 20;
	        int type;

	        CarShowroom carShowroom;
	        Scanner kb = new Scanner(System.in);
	        System.out.print("Select Type for Body: (0: Ford, 1: GM): ");
	        type = kb.nextInt();
	        Body body;
	        if (type == 0) {
	        	// Use Ford Engine
	            body = new FordBody();
	        }
	        else {
	            // Use GM Body
	        	body = new GMBody();
	        }
	        body.setSize(BODY_SIZE);

	        System.out.print("Select Type for Engine: (0: Ford, 1: GM): ");
	        type = kb.nextInt();
	        Engine engine;
	        if (type == 0) {
	            // Use Ford Engine
	        	engine = new FordEngine();
	        }
	        else {
	            // Use GM engine
	        	engine = new GMEngine();
	        }
	        engine.setSize(ENGINE_SIZE);

	        System.out.print("Select Type for Wheels: (0: Ford, 1: GM): ");
	        type = kb.nextInt();
	        Wheel wheel;
	        if (type == 0) {
	            // Use Ford Wheels
	        	wheel = new FordWheel();
	        }
	        else {
	            // Use GM Wheels
	        	wheel = new GMWheel();
	        }
	        wheel.setDiameter(WHEEL_DIAMETER);

	        carShowroom = new CarShowroom(wheel, engine, body);
	        carShowroom.buildCars();
	        carShowroom.showCars();
	        kb.close();
	    }
	}