package homework6.problem1;

import java.util.ArrayList;
import java.util.Scanner;

class CarShowroom {
    private ArrayList<Car> cars = new ArrayList<Car>();
    private int numCars = 4;
    private PartsFactory pf;
    
    public CarShowroom(PartsFactory p) {
    	this.pf = p;
    }
   
    public void buildCars() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of cars to display: ");
        numCars = kb.nextInt();
       
        String text = "Car No - ";
        for (int i = 0; i < numCars; i++) {   
            Car car = new Car(); 
            car.setName(text + i);
            Body body = pf.createBody();
            Engine engine = pf.createEngine();
            Wheel lf = pf.createWheel();
            Wheel rf = pf.createWheel();
            Wheel lr = pf.createWheel();
            Wheel rr = pf.createWheel();
            car.setBody(body);
            car.setEegine(engine);
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