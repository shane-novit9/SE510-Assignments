package homework6.problem2;

import java.util.ArrayList;
import java.util.Scanner;

class CarShowroom {
    private ArrayList<Car> cars = new ArrayList<Car>();
    private int numCars = 4;
    private Wheel wheelProto;
    private Engine engineProto;
    private Body bodyProto;
    
    public CarShowroom(Wheel wp, Engine ep, Body bp) {
    	this.wheelProto = wp;
    	this.engineProto = ep;
    	this.bodyProto = bp;
    }
   
    public void buildCars() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of cars to display: ");
        numCars = kb.nextInt();
       
        String text = "Car No - ";
        for (int i = 0; i < numCars; i++) {   
            Car car = new Car(); 
            car.setName(text + i);
            Body body = bodyProto.clone();
            Engine engine = engineProto.clone();
            Wheel lf = wheelProto.clone();
            Wheel rf = wheelProto.clone();
            Wheel lr = wheelProto.clone();
            Wheel rr = wheelProto.clone();
            car.setBody(body);
            car.setEngine(engine);
            car.setWheels(lf,  rf,  lr,  rr);
            cars.add(car);
        }
    }
   
    public void showCars() {    
        for (int i = 0; i < numCars; i++) {
            cars.get(i).show();
        }
    }
}