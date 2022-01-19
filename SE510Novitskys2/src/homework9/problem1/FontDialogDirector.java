package homework9.problem1;

import java.util.ArrayList;

public class FontDialogDirector implements DialogDirector {
	private ListBox list;
	private Button ok;
	private Button cancel;
	private RadioButtonList rbl;
	private EntryField field;
	private ArrayList<Widget> wList = new ArrayList<Widget>();
	private int active;
	
	public FontDialogDirector() {
		createWidgets();
		active = 1;
	}
	
	@Override
	public void showDialog() {
		for (Widget w : wList) {
			w.show();
		}	
		System.out.println();
	}
	@Override
	public void createWidgets() {
		list = new ListBox(this);
		ok = new Button(this, "OK");
		cancel = new Button(this, "Cancel");
		cancel.push();
		rbl = new RadioButtonList(this);
		field = new EntryField(this);
		
		wList.add(field);
		wList.add(list);
		wList.add(rbl);
		wList.add(cancel);
		wList.add(ok);
	}
	@Override
	public void widgetChanged(Widget w) {  
		if (w.getWidgetType().equals("list")) { 
			String font = list.getFont();
			field.setFont(font); 
		} else if (w.getWidgetType().equals("ok")) {
			
		} else if (w.getWidgetType().equals("cancel")) {
			
		} else if (w.getWidgetType().equals("rbl")) {
			
		} else { // Entry field
			EntryField field = (EntryField) wList.get(0);
			String font = field.getFont();
	        if (font.equals("Times New Roman")) {
				if (ok.getStatus() == 0) {
					ok.push();
				}
				handleRadio(1);
			} else if (font.equals("Apple Chancery")) {
				if (ok.getStatus() == 0) {
					ok.push();
				}	
				handleRadio(2);
			} else if (font.equals("Arial Black")) { 
				if (ok.getStatus() == 0) {
					ok.push();
				} 
				handleRadio(3);
			} else {
				if (ok.getStatus() == 1) {
					ok.push(); 
				}
				handleRadio(0);
			}
		} 
	}
	
	// Handle the selection of fonts 
	public void handleUserInput(int input) {
		ListBox temp = (ListBox) wList.get(1);
		if (input == 0) { // No font
			temp.selectFamily(0);
		} else if (input == 1) { // TimesNewRoman
			temp.selectFamily(1);
		} else if (input == 2) { // AppleChancery
			temp.selectFamily(2);
		} else if (input == 3) { // ArialBlack
			temp.selectFamily(3);
		} else { // Stop tester
			this.active = 0;
		}
	}
	
	// Handle radio buttons based off the current font
	// type (0: empty, 1: TNR, 2: Apple, 3: Arial) 
	private void handleRadio(int type) {
		if (type == 0) {
			for (int i=0; i<3; i++) {
				if (rbl.getStatus(i) == 1) { 
					rbl.push(i);
				}
			}
		} else if (type == 1) {
			for (int i=0; i<3; i++) {
				if (rbl.getStatus(i) == 0) {
					rbl.push(i);
				}
			}
		} else if (type == 2) {
			if (rbl.getStatus(0) == 0) { rbl.push(0); }
			if (rbl.getStatus(1) == 1) { rbl.push(1); }
			if (rbl.getStatus(2) == 0) { rbl.push(2); }
		} else {
			if (rbl.getStatus(0) == 1) { rbl.push(0); }
			if (rbl.getStatus(1) == 0) { rbl.push(1); }
			if (rbl.getStatus(2) == 0) { rbl.push(2); }
		}
	}
	
	public int getStatus() {
		return this.active; 
	}
}