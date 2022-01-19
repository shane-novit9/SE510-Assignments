package homework5.problem2;

import java.util.*;

public class Driver {
	public static void main(String args[]) {
        ToastFactory tf;
        Toaster toaster;
        Scanner kb = new Scanner(System.in);
        System.out.print("Select Toast Type: (0: Fancy, 1: Basic): ");
        int toastType = kb.nextInt();
        if (toastType == 0) {
            tf = new FancyToastFactory();
            toaster = new Toaster(tf);
            toaster.collectToasts();
            System.out.println("FancyToast collection Completed!");
            System.out.println("Display Random FancyToasts");
            toaster.displayToasts();
        }
        else {
            tf = new BasicToastFactory();
            toaster = new Toaster(tf);
            toaster.collectToasts();
            System.out.println("BasicToast collection Completed!");
            System.out.println("Display Random BasicToasts");
            toaster.displayToasts();
        }
        

        kb.close();
    }
}

class BasicToastFactory implements ToastFactory {

	@Override
	public Toast createToast() {
		return new BasicToast();
	}
	
}

class FancyToastFactory implements ToastFactory {

	@Override
	public Toast createToast() {
		return new FancyToast();
	}
	
}

interface Toast {
    public void setText(String text);
    public void display();
}
