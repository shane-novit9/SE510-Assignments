package homework9.problem2;

import java.util.List;

// Receiver
public class ToyGUI {
	List<Button> buttons;
	TextBox textBox;
	String image;
	SoundFile sound;
	Speaker speaker = new Speaker();

	public void setSound(SoundFile s) {
		this.sound = s;
	}
	
	public void setButtons(List<Button> buttons) {
	   this.buttons = buttons;
	}
	
	public void setImage(String file) {
	   this.image = file;
	}
	
	public void setTextBox(TextBox textBox) {
	   this.textBox = textBox;
	}
	
	public Speaker getSpeaker() {
	   return speaker;
	}
	
	public void display() {
	   System.out.println(buttons);
	   System.out.println(image);
	   System.out.println(speaker);
	   System.out.println(textBox);
	}
	
	public void speak() {
		System.out.print("\nThe " + image + " goes ");
		speaker.play(sound.getSound());
	}
}
