package homework7.problem2;

public interface Stream {
	public void addString(String string); // append string to the buffer
	public void addInteger(int number);   // append number as a string to the buffer
	public String getBuffer();            // return the string in the buffer
	public void setBuffer(String string); // set string to the buffer
	public void finalizeBuffer();         // finalize buffer before flushing
	public void flush();                  // write the string in the buffer out
}
