package homework9.problem2;

import java.util.Map;
import java.util.HashMap;

// Concrete menu
public class NameTextBox extends TextBox {
	ToyGUI gui;
	HashMap<String, Button> animals;
	
	public NameTextBox(ToyGUI gui, HashMap<String, Button> animals) {
		this.gui = gui;
		this.animals = animals;
	}
	
	public void setText(String text) {   // mimic user input
	    super.setText(text);
	}
	   
	@Override
	public void entered() {
		String name = super.readText();
	    if (animals.get(name) == null) {
	       gui.getSpeaker().beeps(4);
	       gui.setImage("invalid.jpg");
	    } else {
	       for (Map.Entry<String, Button> entry : animals.entrySet()) {
	    	  if(entry.getKey().equals(name)) {
	    		  entry.getValue().clicked();
	    	  } 
	       }
	    }
	}
}
