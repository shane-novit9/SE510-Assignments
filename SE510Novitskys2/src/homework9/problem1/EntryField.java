package homework9.problem1;

public class EntryField extends Widget {
	private String font = "";
	
	public EntryField(DialogDirector d) {
		super(d);
	}
	 
	@Override 
	public String getWidgetType() {
		return "field";
	}
	@Override
	public void show() {
			System.out.println("EntryField: " + font);	
	} 
	
	public void setFont(String f) {
		this.font = f;
		changed();
	}
	
	public String getFont() {
		return font; 
	}
}
