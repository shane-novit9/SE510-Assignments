package homework6.problem2;

public class GMEngine implements Engine {

	private int size;
	
	@Override
	public void show() {
		System.out.println("-- GM ENGINE (" + size + ") --");
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
		Engine clone = new GMEngine();
		clone.setSize(size);
		return clone;
	}

}
 