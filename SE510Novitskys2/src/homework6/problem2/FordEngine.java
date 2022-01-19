package homework6.problem2;

public class FordEngine implements Engine {
	
	private int size;
	
	@Override
	public void show() {
		System.out.println("-- FORD ENGINE (" + size + ") --");
	}
	@Override
	public int getSize() {
		return size;
	}
	@Override
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public Engine clone() {
		Engine clone = new FordEngine();
		clone.setSize(size);
		return clone;
	}
}
