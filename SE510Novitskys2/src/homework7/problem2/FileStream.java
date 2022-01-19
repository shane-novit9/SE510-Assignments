package homework7.problem2;

public class FileStream implements Stream {
	
	private String buffer = "";
	private String path;
	
	public FileStream(String path) {
		this.path = path;
	}
	
	@Override
	public void addString(String string) {
		buffer = buffer + string;		
	}

	@Override
	public void addInteger(int number) {
		// TODO Auto-generated method stub
		buffer = buffer + String.valueOf(number);
	}

	@Override
	public String getBuffer() {
		return this.buffer;
	}

	@Override
	public void setBuffer(String string) {
		this.buffer = string; 
		
	}

	@Override
	public void finalizeBuffer() {
		System.out.println("Finalizing " + path);
		
	}

	@Override
	public void flush() {
		System.out.print(buffer + "\n");
		setBuffer("");
	}

}
