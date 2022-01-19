package homework6.problem1;

public class GMPartFactory implements PartsFactory {

	@Override
	public Body createBody() {
		return new GMBody();
	}

	@Override
	public Engine createEngine() {
		return new GMEngine();
	}

	@Override
	public Wheel createWheel() {
		return new GMWheel();
	}
	
}
