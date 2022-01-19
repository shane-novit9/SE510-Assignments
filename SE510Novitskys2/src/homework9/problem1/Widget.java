package homework9.problem1;

public class Widget {
	private DialogDirector director;
	
	public Widget(DialogDirector d) {
		this.director = d;
	}
	
	public void changed() {
		this.director.widgetChanged(this);
	}
	
	public String getWidgetType() {
		return "";
	}
	
	public void show() {}
} 
