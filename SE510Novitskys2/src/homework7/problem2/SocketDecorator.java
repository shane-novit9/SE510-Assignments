package homework7.problem2;

public class SocketDecorator implements Stream {
	
	private Stream str;
	
	public SocketDecorator(Stream socket) {
		this.str = socket;
	}
	
	@Override
	public void addString(String string) {
		str.addString(string);
	}

	@Override
	public void addInteger(int number) {
		str.addInteger(number);
	}

	@Override
	public String getBuffer() {
		return str.getBuffer();
	}

	@Override
	public void setBuffer(String string) {
		str.setBuffer(string);		
	}

	@Override
	public void finalizeBuffer() {
	}

	@Override
	public void flush() {
		str.flush();
	}
	
}
