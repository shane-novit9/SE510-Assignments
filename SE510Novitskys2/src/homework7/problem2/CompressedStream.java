package homework7.problem2;

public class CompressedStream extends SocketDecorator {
	
	private String compressedBuffer = "";
	private Stream str;
	
	public CompressedStream(Stream str) {
		super(str);
		this.str = str;
	}
	
	public void finalizeBuffer() { 
		compressedBuffer = Utils.compress(super.getBuffer());
		str.finalizeBuffer();
	} 
	
	public void flush() {
		System.out.println(compressedBuffer + "\n");
	}
	
	public String getBuffer() { 
		return compressedBuffer;
	}
	
}
