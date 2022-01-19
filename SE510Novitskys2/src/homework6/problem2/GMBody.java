package homework6.problem2;

public class GMBody implements Body {
	
	private String size;
	
	@Override
	public void show() {
		System.out.println("-- GM BODY (" + size + ") --");
	}
	@Override
	public String getSize() {
		return this.size;
	}
	@Override
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public Body clone() {
		Body clone = new GMBody();
		clone.setSize(size);
		return clone;
	}
}
