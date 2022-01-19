package homework7.problem2;

public class SvnBitASCIIStream extends SocketDecorator {
	
	private String convertedBuffer;
	private Stream str;
	
	public SvnBitASCIIStream(Stream str) {
		super(str);
		this.str = str;
	}
	
	public void finalizeBuffer() {
		str.finalizeBuffer();
		convertedBuffer = Utils.convertStringTo7BitAscii(str.getBuffer());
		super.finalizeBuffer();
	}
	
	public void flush() {
		System.out.print(convertedBuffer + "\n\n");
	}
	
}
