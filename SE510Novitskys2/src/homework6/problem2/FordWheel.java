package homework6.problem2;

public class FordWheel implements Wheel {
	
	private int diameter;
	
	@Override
	public void show() {
		System.out.println("-- FORD WHEEL (" + diameter + ") --");
	}
	@Override
	public int getDiameter() {
		return diameter;
	}
	@Override
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	@Override 
	public Wheel clone() {
		Wheel clone = new FordWheel();
		clone.setDiameter(diameter);
		return clone;
	}
}
