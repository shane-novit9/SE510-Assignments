package homework9.problem2;

import java.util.HashMap; 
import java.util.ArrayList;

// Application
public class Toy {
	public static void main(String[] args) {
	      HashMap<String, Button> animals = new HashMap<>();
	      ArrayList<Button> buttons = new ArrayList<>();
	      ToyGUI gui = new ToyGUI();
	  
	      Command bark = new Bark(gui);
	      Command meow = new Meow(gui);
	      Command moo = new Moo(gui);
	      AnimalButton dog = new AnimalButton("Dog", bark);
	      AnimalButton cat = new AnimalButton("Cat", meow);
	      AnimalButton cow = new AnimalButton("Cow", moo);

	      buttons.add(dog);
	      buttons.add(cat);
	      buttons.add(cow);

	      animals.put("Dog", dog);
	      animals.put("Cat", cat);
	      animals.put("Cow", cow);
	      NameTextBox animalName = new NameTextBox(gui, animals);

	      gui.setButtons(buttons);
	      gui.setImage("welcome.jpg");
	      gui.setTextBox(animalName);

	      gui.display();

	      // Testing the code
	      dog.clicked();
	      cat.clicked();
	      cow.clicked();
	      animalName.setText("Cow");
	      animalName.entered();
	      animalName.setText("Cat");  // player is typing "Cat"
	      animalName.entered();       // player completed the input
	      animalName.setText("Dog");
	      animalName.entered();
	      animalName.setText("Moose");
	      animalName.entered();
	}
}
