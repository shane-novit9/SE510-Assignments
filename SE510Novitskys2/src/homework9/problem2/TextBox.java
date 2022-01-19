package homework9.problem2;

// Abstract menu
public abstract class TextBox {
	String text; // Entered by user
	
	public void setText(String t) {
		this.text = t;
	}
	
	public String readText() {
		return text;
	}
	
	public abstract void entered();
}
