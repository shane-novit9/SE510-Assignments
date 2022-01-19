package homework7.problem2;

public class Client {
	public static void main(String[] args) {
		
		Stream stream = new SvnBitASCIIStream(new CompressedStream(new FileStream("/Users/boblazard/Area51/elements"))); 
		stream.addInteger(2345);
		stream.addString("Hello World!");
		stream.addInteger(200);
		stream.finalizeBuffer();
		stream.flush();
		
		stream = new CompressedStream(new SocketStream("cs.scranton.edu"));
		stream.addInteger(987);
		stream.finalizeBuffer();
		stream.flush();
		
		stream = new SocketStream("cs.scranton.edu");
		stream.addString("Plain String");
		stream.addInteger(1);
		stream.finalizeBuffer();
		stream.flush();
	
	}
}
