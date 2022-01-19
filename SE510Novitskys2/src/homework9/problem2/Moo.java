package homework9.problem2;

public class Moo extends Command {
	private ToyGUI gui;
	private final String name = "Cow";
	private final SoundFile moo = new SoundFile("Moo");
	
	public Moo(ToyGUI toy) {
		this.gui = toy;
	}
	
	@Override
	public void execute() {
		gui.setImage(name);
		gui.setSound(moo);
		gui.speak();
	}

}
