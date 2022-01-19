package homework9.problem2;

// Abstract invoker
public abstract class Button {
	String label;
	
	public void setLabel(String l) {
		this.label = l;
	}
	
	abstract void clicked();
}
