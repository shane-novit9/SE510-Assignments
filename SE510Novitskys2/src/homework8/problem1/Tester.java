package homework8.problem1;

public class Tester {
	
	public static void main(String[] args) {
		Color[][] pixels = new Color[3][3];
	    setColors(pixels, 3, 3);  
	    Graphics image1 = new Image(pixels, 3, 3);
	    Graphics image1Proxy = new ImageProxy(image1);
	    System.out.println("Cloning image1...");
	    Graphics image2 = image1Proxy.clone();
	    Graphics image3 = image1Proxy.clone(); 
	    
	    System.out.println("============================\n");
	    System.out.println("Image 1");
	    image1Proxy.draw();
	    System.out.println("Image 2");
	    image2.draw();
	    System.out.println("Image 3");
	    image3.draw();  // image 1, 2, 3 share the same pixel array
	    
	    System.out.println("============================\n");
	    image2.changeColor(new Point(2,2), new Color(9));
	    image2.changeColor(new Point(0,1), new Color(9));
	    System.out.println("Image 1 (unchanged)");
	    image1Proxy.draw();   // image 1 and 3 still share the same pixel array
	    System.out.println("Image 2 (color change)");
	    image2.draw();   // image 2 has its own copy of the pixel array.
	    System.out.println("Image 3 (unchanged)");
	    image3.draw();
	    
	    System.out.println("============================\n");
	    image1.changeColor(new Point(1,1), new Color(3)); 
	    System.out.println("Image 1 (color change)");
	    image1Proxy.draw();   
	    System.out.println("Image 2 (unchanged)");
	    image2.draw();   
	    System.out.println("Image 3 (changes with image 1)");
	    image3.draw();
	    
	    System.out.println("============================\n");
	    image3.changeColor(new Point(0,2), new Color(7));
	    image2.changeColor(new Point(1,0), new Color(5));
	    System.out.println("Image 1 (unchanged)");
	    image1Proxy.draw();   
	    System.out.println("Image 2 (color change)");
	    image2.draw();  
	    System.out.println("Image 3 (color change)");
	    image3.draw();
	    
	    System.out.println("============================\n");
	    System.out.println("Cloning image3...");
	    Graphics image4 = image3.clone();
	    Graphics image5 = image3.clone();
	    // All reference image3
	    System.out.println("Image 4");
	    image4.draw();   
	    System.out.println("Image 5");
	    image5.draw(); 
	    
	    System.out.println("============================\n");
	    image5.changeColor(new Point(2,0), new Color(1));
	    System.out.println("Image 4");
	    image4.draw();   
	    System.out.println("Image 5 (color change)");
	    image5.draw();   
	}
	 
	public static void setColors(Color[][]arr, int rows, int columns) {
		for (int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				arr[i][j] = new Color(0);
			}
		}
	} 
}
