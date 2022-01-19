package homework7.problem2;

public class SocketStream implements Stream {
	
	private String buffer = "";
	private String location;
	
	public SocketStream(String socket) {
		this.location = socket;
	}
	
	@Override
	public void addString(String string) {
		buffer = buffer + string;
	}

	@Override
	public void addInteger(int number) {
		buffer = buffer + String.valueOf(number);
	}

	@Override
	public String getBuffer() {
		return this.buffer;
	}

	@Override
	public void setBuffer(String string) {
		buffer = string;		
	}

	@Override
	public void finalizeBuffer() {
		System.out.println("Finilizing: " + location);
	}

	@Override
	public void flush() {
		System.out.print(buffer + "\n");
		setBuffer("");
	}

}
