package homework9.problem1;

public class Button extends Widget {
	private String name;
	private int enabled = 0;
	
	public Button(DialogDirector d, String n) {
		super(d);
		this.name = "(" + n + ")";
	}
	
	@Override 
	public void show() {
		System.out.println("Button: " + name);
	}
	
	public void push() {
		if (enabled == 0) {
			enabled = 1;
			enable();
		} else { 
			enabled = 0;
			name = "(" + name + ")";
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getStatus() {
		return enabled;
	}
	
	public void enable() {
		name = name.substring(1, name.length()-1);
	}
}
