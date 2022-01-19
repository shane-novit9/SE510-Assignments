package homework6.problem2;

public class GMWheel implements Wheel {

	private int diameter;
	
	@Override
	public void show() {
		System.out.println("-- GM WHEEL (" + diameter + ") --");
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
		Wheel clone = new GMWheel();
		clone.setDiameter(diameter);
		return clone;
	}

}
