package homework9.problem1;

public class ListBox extends Widget {
	private String[] family = {
			"", "Times New Roman", "Apple Chancery",
			"Arial Black"
	};
	private String[] familyOut = {
			"", "Times New Roman", "Apple Chancery",
			"Arial Black"
	}; 
	private int currentFam = 0;
	
	public ListBox(DialogDirector d) {
		super(d);
	}

	@Override
	public String getWidgetType() { 
		return "list";
	}
	@Override
	public void show() {
		System.out.print("ListBox: ");
		System.out.printf("%s\n         %s\n         %s\n" , family[1], family[2], family[3]);
	}
	
	public String getFont() {
		String output;
		if (currentFam == 0) {
			output = " ";
		} else {
			output = familyOut[currentFam]; 
		}
		return output;  
	}
	
	public void selectFamily(int location) {
		if (currentFam != -1) { 
			deselectFamily(currentFam);
		}
		currentFam = location;
		if (currentFam != 0) {
			family[location] = family[location] + "(selected)";
		} 
		changed();
	}
	
	private void deselectFamily(int location) {
		if (currentFam != 0) {
			family[location] = family[location].substring(0, family[location].indexOf("("));
		}
	}
} 