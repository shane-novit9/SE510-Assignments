package homework6.problem1;

import java.util.Scanner;

public class CarTypeSelector {
    public static void main(String args[]) {
        CarShowroom carShowroom;
        PartsFactory pf;
        Scanner kb = new Scanner(System.in);
        System.out.print("Select Car Type: (0: Ford, 1: GM): ");
        int carType = kb.nextInt();
        if (carType == 0) {
            // Show Ford Cars
        	pf = new FordPartFactory();
        	carShowroom = new CarShowroom(pf);
        }
        else {
            pf = new GMPartFactory();
            carShowroom = new CarShowroom(pf);
        }
        carShowroom.buildCars();
        carShowroom.showCars();
        kb.close();
    }
}