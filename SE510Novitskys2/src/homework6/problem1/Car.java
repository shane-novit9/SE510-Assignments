package homework6.problem1;

import java.util.ArrayList;

class Car {
	private String name;
	private Body body;
	private Engine engine;
	private ArrayList<Wheel> wheels = new ArrayList<>();
	
	public void setName(String name) {
		this.name = name;
	}
    public void setBody(Body body) {
    	this.body = body;
    }
    public void setEegine(Engine engine) {
    	this.engine = engine;
    }
    public void setWheels(Wheel leftFront, Wheel rightFront, Wheel leftRear, Wheel rightRear) {
    	wheels.add(leftFront);
    	wheels.add(rightFront);
    	wheels.add(leftRear);
    	wheels.add(rightRear);
    }
	public Body getBody() {
		return body;
	}
	public Engine getEngine() {
		return engine;
	}
	public ArrayList<Wheel> getWheels() {
		return wheels;
	}

    public void show() {
    	System.out.println("Car name: " + name);
    	System.out.print("   Body:               "); getBody().show();
       	System.out.print("   Engine:             "); getEngine().show();
    	System.out.print("   Left Front Wheel:   "); getWheels().get(0).show();
    	System.out.print("   Right Front Wheel:  "); getWheels().get(1).show();
    	System.out.print("   Left Rear Wheel:    "); getWheels().get(2).show();
    	System.out.print("   Right Rear Wheel:   "); getWheels().get(3).show();
    };
}