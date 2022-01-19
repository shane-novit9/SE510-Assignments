package homework5.problem2;

import java.util.*;

public class Toaster {
	private ArrayList<Toast> toasts = new ArrayList<Toast>();
	private ToastFactory tf;
    private int numToasts = 10;
   
    public Toaster(ToastFactory tf) {
    	this.tf = tf;
    }
    
    public void collectToasts() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of toasts: ");
        numToasts = kb.nextInt();
       
        String text = "Hello World";
        for (int i = 0; i < numToasts; i++) {
            text = text + "-" + i;
            // read the text to toast from kb
            Toast toast = tf.createToast(); // Create Toast implementation 
            toast.setText(text);
            toasts.add(toast);
        }
        kb.close();
    }
    public void displayToasts() {
        Random r = new Random();
       
        for (int i = 0; i < numToasts; i++) {
            toasts.get(r.nextInt(numToasts)).display();
        }
    }
}
