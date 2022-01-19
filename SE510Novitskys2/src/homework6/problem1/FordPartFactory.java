package homework6.problem1;

public class FordPartFactory implements PartsFactory {

	@Override
	public Body createBody() {
		return new FordBody();
	}

	@Override
	public Engine createEngine() {
		return new FordEngine();
	}

	@Override
	public Wheel createWheel() {
		return new FordWheel();
	}
	
}
