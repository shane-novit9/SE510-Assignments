package homework9.problem1;

import java.util.ArrayList;

public class RadioButtonList extends Widget {
	private DialogDirector director;
	private ArrayList<Button> bList = new ArrayList<Button>();
	
	public RadioButtonList(DialogDirector d) {
		super(d);
		this.director = d;
		bList.add(new Button(director, "bold"));
		bList.add(new Button(director, "italic"));
		bList.add(new Button(director, "underlined"));
	}
	
	@Override
	public String getWidgetType() {
		return "rbl";
	}
	@Override
	public void show() {
		System.out.print("RadioButtonList: ");
		for (Button b : bList) {
			System.out.print(b.getName() + ", "); 
		}
		System.out.println(); 
	}
	
	public void push(int index) {
		bList.get(index).push(); 
	}
	
	public int getStatus(int index) {
		return bList.get(index).getStatus();
	}
}
