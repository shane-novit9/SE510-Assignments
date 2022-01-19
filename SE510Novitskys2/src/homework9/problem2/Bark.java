package homework9.problem2;

public class Bark extends Command {
	private ToyGUI gui;
	private final String name = "Dog";
	private final SoundFile sound = new SoundFile("Bark");
	
	public Bark(ToyGUI t) {
		this.gui = t;
	}
	
	@Override
	public void execute() {
		gui.setImage(name);
		gui.setSound(sound);
		gui.speak();
	}

}
