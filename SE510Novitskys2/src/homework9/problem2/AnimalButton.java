package homework9.problem2;

// Concrete invoker
public class AnimalButton extends Button {

	private Command noise;
	
	public AnimalButton(String label, Command noise) {
		setLabel(label);
		this.noise = noise;
	}
	
	@Override
	void clicked() {
		noise.execute();
	}

}
