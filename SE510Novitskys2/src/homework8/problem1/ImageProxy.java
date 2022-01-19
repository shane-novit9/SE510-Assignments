package homework8.problem1;

import java.util.ArrayList;

public class ImageProxy implements Graphics {
	
	private Graphics im;
	private static ArrayList<Graphics> members = new ArrayList<Graphics>();
	
	public ImageProxy(Graphics image) {
		this.im = image; 
	}
	
	public void draw() {
		im.draw();
	}

	public void changeColor(Point point, Color color) {
		if (hasUniqueHash()) {
			System.out.println("Unique hash, no copy needed.\n");
			im.changeColor(point, color);
		} else {
			im = im.clone();
			im.changeColor(point, color);
		}
	}

	public ImageProxy clone() {
		System.out.println("Clone hashcode: " + im.hashCode() + "\n");
		members.add(im);
		return new ImageProxy(im); 
	}
	
	private boolean hasUniqueHash() { 
		boolean result = true;
		for (Graphics i : members) {
			if (im.hashCode() == i.hashCode()) {
				result = false;
			}
		}
		return result;
	}
}
