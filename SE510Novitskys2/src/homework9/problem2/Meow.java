package homework9.problem2;

public class Meow extends Command {
	private ToyGUI gui;
	private final String name = "Cat";
	private final SoundFile sound = new SoundFile("Meow");
	
	public Meow(ToyGUI toy) {
		this.gui = toy;
	}
	
	@Override
	public void execute() {
		gui.setImage(name);
		gui.setSound(sound);
		gui.speak();
	}

}
